package common;

public enum TField {

    STATUS_CODE("statusCode"), //
    ERROR_CODE("errorCode"), //
    ERROR_MESSAGE("errorMessage"), //
    ENTRY_NUMBER("entryNumber"), //
    ENTRY_QUANTITY("quantity"), //
    ITEM_INDEX_TO_REPLACE("itemIndexToReplace"), //
    SKU_REPLACEMENT_INDEX("skuReplacementIndex"), //
    SKU_REPLACEMENT_QTY("skuReplacementQty"), //
    SKU_REPLACEMENT_PRICE("skuReplacementPrice"), //
    SYMBOLS_COUNT("symbolsCount"), //
    LABELS_COUNT("labelsCount"), //
    QUANTITY("Quantity"), //
    SKU_INDEX("skuIndex"), //
    HS_SKU_INDEX("hsSkuIndex"),//
    NOT_CANCELLED_SKU_INDEX("notCancelledSkuIndex"), //
    ADDITIONAL_SKU_INDEX("additionalIndex"), //
    CONSIGNMENT_STATUS("consignmentStatus"), //
    SOURCE_TYPE("sourceType"), //
    PACKAGE_ID("packageId"), //
    PACKAGE_NAME("packageName"), //
    TOTAL_PACKAGES("totalPackages"), //
    PACKAGE_STORE_LOCATION("packageStoreLocation"), //
    ORDER_CODE("orderCode"), //
    REPAIR_ORDER_NUMBER("repairOrderNumber"), //
    CUSTOMER_NAME("customerName"), //
    CUSTOMER_FACE_ETA("customerFacedEta"), //
    CONSIGNMENT_ETA("consignmentEta"), //
    MOVE_FROM_CONSIGNMENT("moveFromConsignment"), //
    IS_APPOINTMENT_REQUESTED("isAppointmentRequested"), //
    VEHICLE_IDENTIFICATION_NUMBER("vehicleIdentificationNumber"), //
    CQ_TAGS("cq:tags"), //
    MIN_STORE_QTY("minStoreQty"), //
    MAX_STORE_QTY("maxStoreQty"), //
    MIN_CORPORATE_QTY("minCorporateQty"), //
    MAX_CORPORATE_QTY("maxCorporateQty"), //
    MIN_QTY("minQty"), //
    MAX_QTY("maxQty"), //
    IS_EXCLUSIVE("IsOnline.Exclusive"),
    IS_SELLABLE("IsOnline.Sellable"), //
    IS_ORDERABLE("IsOnline.Orderable"), //
    IS_STORECLEARENCE("IsOnline.StoreClearance"),
    TABLE("table"), //
    WHEEL_TABLE("wheelTable"), //
    TIRE_TABLE("tireTable"), //
    REASON("Reason"), //
    ATTRIBUTE_VALUE("attributeValue"), //
    ALLOCATION_SOURCE("allocationSource"), //
    CLASS_NAME("className"), //
    DELIVERY_OPTION("deliveryOption"), //
    REPLACE_WITH("replaceWith"), //
    SUBCATEGORY_NAME("pim_subCategoryName"), //
    FINE_LINE_NAME("pim_finelineName"), //
    SPECIFICATIONS("specifications"), //
    VALIDATION_ERROR("validationError"), //
    PRODUCT_NAME_EN("pim_productName_EN"), //
    BRAND_NAME_EN("pim_brandName"), //
    ENCODED_PDP_LINK("encodedPdpLink"), //
    ROLE("role"), //
    CREDENTIALS("credetials"), //
    INCORRECT_VALUE("incorrectValue"), //
    CTC_ITEM_NUMBER("CTC Item #"), //
    IS_TIRE_CANT_BE_INSTALLED("IsTireCantBeInstalledInStore"), //
    ATTRIBUTE("attribute"), //
    ACTION_VALUE("actionValue"), //
    COMPARATOR("comparator"), //
    VALUE("value"), //
    CONNECTION_TYPE("connectionType"), //
    RESERVATION("reservation"), //
    IS_ROR("isRor"), //
    IS_SOI("isSoi"), //
    COLLECTOR("collector"), //
    HAS_HYBRIS_RULES("hasHybrisRules"), //
    HAS_TMX_RULES("hasTMXRules"), //
    TPMS("tpms"), //
    HUB_RINGS("hubRings"), //
    BOLTS_AND_LUGS("boltsAndLugs"), //
    STORE_CLEARANCE("IsOnline.StoreClearance"), //
    UPC_CODE("upccode"), //
    KEYWORD("keyword"), //
    PROPERTY("property"), //
    NEW_PROPERTY_VALUE("NewPropertyValue"), //
    VEHICLE_YEAR("year"), //
    VEHICLE_MAKE("make"), //
    VEHICLE_MODEL("model"), //
    VEHICLE_BODY("body"), //
    VEHICLE_CHASSIS("chassis"), //
    VEHICLE_OPTION("option"), //
    VEHICLE_ENGINE("engine"), //
    ON_HOLD("onHold"), //
    DELIVERY_POSTAL_CODE("deliveryPostalCode"), //
    IS_CLEARANCE("isClearance"), //
    ASSIGNMENT("assignment"), //
    EMPLOYEE_UID("employeeUID"), //
    ENTRY_STATUS("entryStatus"), //
    LINE_STATUS("lineStatus"), //
    ETA_LINE_STATUS("etaLineStatus"), //
    HISTORY_STATUS("historyStatus"), //
    EXPECTED_LINE_STATUS("expectedLineStatus"), //
    APP_VERSION("appVersion"), //
    CATEGORY_ID("categoryID"), //
    GROUP_ID("groupID"), //
    IS_CHECK_BOX_SELECTED("isCheckBoxSelected"), //
    OFFER_REPLACEMENT("offerReplacement"), //
    OFFER_REPLACEMENT_NO_VALUE("isOfferReplacementNoSelected"), //
    OFFER_REPLACEMENT_YES_VALUE("isOfferReplacementYesSelected"), //
    IS_ORIGINAL_SKU_EXIST("isOriginalSkuExist"), //
    IS_REPLACED_SKU_EXIST("isReplacedSkuExist"), //
    ORDER_POSITION("orderPosition"), //
    QUANTITY_TO_PICK("quantityToPick"), //
    PICKED_QUANTITY("pickedQuantity"), //
    ORDERED_QUANTITY("orderedQuantity"), //
    STORE_NUMBER("store_number"), //
    PCL_BATCH_NUMBER("pclBatchNumber"), //
    PRODUCT_DESCRIPTION("productDescription"), //
    BATCH_TYPE("batchType"), //
    HC_BATCH_NUMBER("hcBatchNumber"), //
    HC_BATCH_SEQUENCE_NUMBER("hcBatchSequenceNumber"), //
    SELECT_CHECK_BOX_VISIBILITY("selectCheckBoxVisibility"), //
    PACK_BUTTON_VISIBILITY("packButtonVisibility"), //
    VISIBILITY("Visibility"), //
    ENABLE_ABILITY("enableAbility"), //
    ORDER_PRESENCE("orderPresence"), //
    PRESENCE("presence"), //
    UNPICK_REASON_QTY("unpickReasonQty"), //
    UNPICK_REASON_CODE("unpickReasonCode"), //
    PARAMETER("parameter"), //
    SEARCH_STRING("searchString"), //
    SEARCH_BY("SEARCH_BY"), //
    EMPLOYEE_NAME("employeeName"), TABLE_PATH_NAME("name"), //
    LANG("lang"), //
    YEAR("year"), //
    MAKE_CODE("makeCode"), //
    MAKE_NAME("makeName"), //
    INTERNAL_MAKE("internalMake"), //
    STORE_ZONE("storeZone"), //
    TYPE("type"), //
    IDENTIFIER("identifier"), //
    IS_ACTIVE("isActive"), //
    PRICING("pricing"), //
    COST("cost"), //
    CURRENCY("currency"), //
    MAKE_TYPE("makeType"), //
    MODEL_CODE("modelCode"), //
    MODEL_NAME("modelName"), //
    STORE_ELIGIBILITY_FOR_DELIVERY("storeEligibleForDelivery"), //
    SKU_ELIGIBILITY_FOR_DELIVERY("skuEligibleForDelivery"), //
    DELIVERY_OPTIONS("deliveryOptions"), //
    STORE_SUPPORT_TYPES("storeSupportTypes"), //
    STORE_NAME("storeName"), //
    ENGINE_CODE("engineCode"), //
    ENGINE_NAME("engineName"), //
    MENU_TITLE("menuTitle"), //
    DELIVERY_COST_FIELD("deliveryCostField"), //
    DELIVERY_COST_FIELD_VALUE("deliveryCostFieldValue"), //
    PACKAGE_FIELD("packageField"), //
    PACKAGE_FIELD_VALUE("packageFieldValue"), //
    HOME_DELIVERY("Home Delivery"), //
    HOME_SERVICES("homeServices"), //
    PAY_AND_PICK_UP("Pay & Pick Up"), //
    PAY_AND_PICK_UP_ETA_ICON("Pay & Pick Up Eta icon"), //
    HOME_DELIVERY_ETA_ICON("Home Delivery Eta ico"), //
    CANCEL_ETA_ICON("Cancel Eta icon"), //
    COMPLETED_ETA_ICON("Completed Eta icon"), //
    FULFILMENT_TYPE("fulfilmentType"), //
    HEADER_TEXT("headerText"), //
    RECEIPT_STATUS("receiptStatus"), //
    DELIVERY_STATUS("deliveryStatus"), //
    PRODUCT_STATUS("productStatus"), //
    CREATE_LEAD_STATUS("createLeadStatus"), //
    LINE_REFUND_QTY("Refund Qty"), //
    ID_S("ids"), //
    PRICE("price"), //
    COMMENT("Comment"), //
    AUTHOR("Author"), //
    COLUMN_NAME("columnName"), //
    BUTTON_TEXT("buttonText"), //
    EXPECTED_TEXT("expectedText"), //
    HEIGHT_DIMENSION("height"), //
    LENGHT_DIMENSION("lenght"), //
    WEIGHT_DIMENSION("weight"), //
    CHANGE_STORE_BUTTON_TEXT("changeStoreButtonText"), //
    CHANGE_STORE_MESSAGE_TEXT("changeStoreMessageText"), //
    WIDTH_DIMENSION("width"), //
    PACKAGE_ID_IN_TOTAL("packageIdInTotal"), //
    ROLE_WITH_ROR_PERMISSION("roleWithRorPermission"), //
    ROLE_WITH_GM_PERMISSION("roleWithGmPermission"), //
    TIRES_OR_WHEELS_TYPE("wheelsOrTires"), //
    SKU_COUNT("skusCount"), //
    STORE("store"), //
    EXAMPLES_TABLE("examplesTable"), //
    FULFILLMENT_ICON("fulfillmentIcon"), //
    IS_BULK("isBulk"), //
    MESSAGE("message"), //
    ORDER_TYPE("orderType"), //
    VPOS_RECEIPT("vposReceipt"), //
    FIELD_NAME("fieldName"), //
    FIELD_TYPE("fieldType"), //
    FIELD_VALUE("fieldValue"), //
    SUBSECTION("subsection"), //
    WHEEL_SIZE_TEXT("wheelSizeText"), //
    TIRE_SIZE_TEXT("tireSizeText"), //
    WHEEL_WIDTH("wheelWidth"), //
    TIRE_SECTION_WIDTH("tireSectionWidth"), //
    WHEEL_DIAMETER("wheelDiameter"), //
    TIRE_ASPECT_RATIO("tireAspectRatio"), //
    TIRE_DIAMETER("tireDiameter"), //
    TIRE_LOAD_INDEX("tireLoadIndex"), //
    TIRE_SPEED_RATING("tireSpeedRating"), //
    PAGE_URL("pageUrl"), //
    COMPONENT("component"), //
    PARENT("parent"), //
    NAME("name"), //
    VAL("val"), //
    ITEM_NUMBER("itemNumber"), //
    PARAM_KEY("Parameter"), //
    PARAM_VALUE("Value"), //
    TITLE("title"), //
    LABEL("label"), //
    VEHICLE_MSG("vehicleMsg"), //
    STORE_MSG("storeMsg"), //
    CHANGE_VEHICLE_LINK_TEXT("changeVehicleLinkText"), //
    ADD_VEHICLE_LINK_TEXT("addVehicleLinkText"), //
    CHANGE_TIRE_SIZE_LINK_TEXT("changeTireSizeLinkText"), //
    EXCLUSIONS("Exclusions"), //
    SERVICE("Service"), //
    CONDITION("Condition"), //
    SUBTITLE("subtitle"), //
    IMAGE_URL("imageUrl"),
    EQUITY_AUDIT_REASON("Equity Audit reason"), //
    HYBRIS_AUDIT_REASON("Hybris Audit reason"), //
    PRIORITY("Priority"), //
    USERNAME("username"), //
    PASSWORD("password"), //
    EMAIL("email"), //
    CONFIRM_PASSWORD("confirm password"),
    LOGIN("login"), //
    GROUP("group"), //
    ESCALATION_TYPE("escalationType"), //
    PACKAGE_TYPE("packageType"),
    PACKAGE_LENGTH("length"),
    PACKAGE_WIDTH("width"),
    PACKAGE_HEIGTH("height"),
    PACKAGE_WEIGHT("weight"),
    PACKAGE_MAX_WEIGHT("maxWeightToPack"),
    PACKAGE_ISACTIVE("isActive"),
    SHIPMENT_STATUSE("SHIPMENT_STATUSE"),//
    RESP_CODE("RESP_CODE"), //
    USER_GROUP("USER_GROUP"), //
    RATE_GROUP("rateGroup"), //
    SEND_SUIT_CARRIER_NAME("sendSuitCarrierName"), //
    SEND_SUIT_CARRIER_VALUE("sendSuitCarrierValue"), //
    DEFAULT_PACKAGE_TYPE_NAME("defaultPackageTypeName"), //
    DEFAULT_PACKAGE_TYPE_VALUE("defaultPackageTypeValue"), //
    DEFAULT_SERVICE_TYPE_NAME("defaultServiceTypeName"), //
    DEFAULT_SERVICE_TYPE_VALUE("defaultServiceTypeValue"), //
    STORE_CARRIER("storeCarrier"), //
    IS_SHIP_WITH_STORE_CARRIER("isShipWithStoreCarrier"),//
    PRODUCT_OR_SERVICE("productOrService"), //
    WG_SERVICE("wgService"), //
    PACKAGED_ITEMS("packagedItems"), //
    PACKAGING_TYPE("packagingType"),//
    CURRENT_STORE("CURRENT_STORE"),
    INACTIVITY_PERIOD("inactivityPeriod"), //
    TIME_OUT_VALUE("timeOutValue"), //
    SCREEN_SAVER_TIMEOUT("screenSaverTimeout"), //
    CORPORATE_QUANTITY("Corporate.Quantity"), //
    RETURN_POLICY_PERIOD("returnPolicyPeriod"), //
    RETURN_POLICY_PERIOD_TEXT("returnPolicyPeriodText"), //
    WARRANTY_DISPOSITION("warrantyDisposition"), //
    WARRANTY_DISPOSITION_TEXT("warrantyDispositionText"), //
    WARRANTY_REPAIR_PERIOD("warrantyRepairPeriod"), //
    WARRANTY_REPAIR_PERIOD_TEXT("warrantyRepairPeriodText"), //
    WARRANTY_REPLACEMENT_PERIOD("warrantyReplacementPeriod"), //
    WARRANTY_REPLACEMENT_PERIOD_TEXT("warrantyReplacementPeriodText"), //
    WARRANTY_TYPE_CODE("warrantyTypeCode"), //
    SKU_FIELD("skuField"),//
    ORDER_FIELD("orderField"),//
    MAX_WEIGHT("maxWeight"), //
    LENGTH_VALUE("lengthValue"), //
    WEIGHT_VALUE("weightValue"), //
    HEIGHT_VALUE("heightValue"), //
    WIDTH_VALUE("widthValue"), //
    WRAPPING("wrapping"), //
    ACTIVE("active"), //
    MOBILE("mobile"), //
    ATTRIBUTE_FOR("for"), //
    ORDER_RETURN_FIELD("orderReturnField"), //
    ORDER_RETURN_FIELD_VALUE("orderReturnFieldValue"), //
    IHD_AND_PACKAGING_REMOVAL("inHomeDeliveryAndPackagingRemoval"), //
    IN_HOME_DELIVERY("inHomeDelivery"), //
    LOCALE("locale"), //
    CURBSIDE("curbside"), //
    RETURNS("Returns"), //
    CANCEL_REASON("cancelReason"), //
    SELECTED_QUANTITY("selectedQuantity"), //
    IS_READY_FOR_COMPLETE("isReadyForComplete"), //
    RETURN_PARCEL_ELEGIBILITY("returnParcelEligibility"), //
    REFUND_DELIVERY_FEE("refundDeliveryFee"), //
    REFUND_DELIVERY_FEE_PERCENT("refundDeliveryFeePercent"), //
    REFUND_LINE("refundLine"),  //
    SET_OF_FOUR_PRICE("setOfFourPrice"), //
    SET_OF_FOUR_PRICE_OLD("setOfFourPriceOld"), //
    FIRST_SKU_PRICE("firstSkuPrice"), //
    FIRST_SKU_PRICE_OLD("firstSkuPriceOld"), //
    SECOND_SKU_PRICE("secondSkuPrice"), //
    SECOND_SKU_PRICE_OLD("secondSkuPriceOld"), //
    PATH("Path"), //
    ORDER_INDEX("orderIndex"),
    SUBJECT("subject"),
    REASON_CODE("reasonCode"),
    DATE_FORMAT("dateFormat"),
    CODE_EMAIL_GROUPS("codeEmailGroups"),
    NAME_EMAIL_GROUPS("nameEmailGroups"),
    STATUS_GROUP_EMAILS("statusGroupEmails"),
    CODE_TYPE("codeType"),
    NAME_TYPE("nameType"),
    NEXT_ACTIVE_TIME("nextActiveTime"),
    SCHEDULE_CONFIG("scheduleConfig"),
    WAY_BILL_NUMBER("wayBillNumber"),
    SKU_QUANTITY("sku quantity");

    public final String text;

    /**
     * Provides a string representation of given enumeration.
     * 
     */
    private TField(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
