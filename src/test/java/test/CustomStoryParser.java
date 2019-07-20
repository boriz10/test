/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing. Copyright ( c ) 2017 Canadian Tire
 * Corporation, Ltd. All rights reserved.
 */

package test;

import org.jbehave.core.model.Story;
import org.jbehave.core.parsers.RegexStoryParser;
import test.filters.PriorityFilter;
import test.filters.ScenarioIdFilter;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CustomStoryParser extends RegexStoryParser {

    private Map<String, List<String>> storyScenariosMap;

    public CustomStoryParser(final Map<String, List<String>> storyScenariosMap) {
        this.storyScenariosMap = storyScenariosMap;
    }

    public static List<String> getScenarioIdsByStoryPath(final String storyPath,
            final Map<String, List<String>> storyScenariosMap) {
        return storyScenariosMap.containsKey(storyPath) ? storyScenariosMap.get(storyPath) : Collections.emptyList();
    }

    @Override
    public Story parseStory(final String storyAsText, final String storyPath) {
        Story story = super.parseStory(storyAsText, storyPath);
        PriorityFilter.filterScenariosByPriority(story);
        ScenarioIdFilter.filterScenariosByIds(story, getScenarioIdsByStoryPath(storyPath));
        return story;
    }

    private List<String> getScenarioIdsByStoryPath(final String storyPath) {
        return getScenarioIdsByStoryPath(storyPath, storyScenariosMap);
    }
}