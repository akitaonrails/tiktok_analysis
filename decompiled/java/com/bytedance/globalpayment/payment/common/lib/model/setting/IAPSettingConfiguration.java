package com.bytedance.globalpayment.payment.common.lib.model.setting;

import X.C09CT;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes28.dex */
public class IAPSettingConfiguration {

    @C09CT("iap_amazon_product_mapping")
    public Map<String, AmazonParsingConfig> amazonProductMapping;

    @C09CT("biz_track_param_white_list")
    public List<String> bizTrackWhiteList;

    @C09CT("iap_error_refactored_mapping")
    public Map<String, Map<String, Map<String, Integer>>> channelErrorRefactoredMapping;

    @C09CT("iap_enable_standard_error_code_mapping")
    public Boolean enableStandardMapping;

    @C09CT("iap_external_payment_country_switch")
    public Map<String, Boolean> externalPaymentCountrySwitch;

    @C09CT("iap_error_message_map")
    public Map<String, String> iapExternalErrorMsgMapping;

    @C09CT("iap_activity_delay_timestamp")
    public Long iap_activity_delay_timestamp;

    @C09CT("iap_mid_migration_bypass_list")
    public List<String> iap_mid_bypass_list;

    @C09CT("iap_standard_error_code_mapping")
    public Map<String, Map<String, List<String>>> standardMappingConfig;

    @C09CT("wallet_iap_mp_host")
    public String iapHost = "https://webcast-mp-sg.tiktokv.com";

    @C09CT("iap_message_mapping_configuration")
    public Map<Integer, Map<String, Integer>> messageMappingConfig = Collections.emptyMap();

    public IAPSettingConfiguration() {
        Boolean bool = Boolean.TRUE;
        this.enableStandardMapping = bool;
        this.standardMappingConfig = Collections.emptyMap();
        this.iap_mid_bypass_list = Collections.emptyList();
        HashMap map = new HashMap();
        map.put("US", new AmazonParsingConfig("USD", e3.d, e3.c));
        map.put("CA", new AmazonParsingConfig("CAD", e3.d, "CDN$"));
        map.put("JP", new AmazonParsingConfig("JPY", "", "￥"));
        map.put("BR", new AmazonParsingConfig("BRL", ",", "R$"));
        map.put("GB", new AmazonParsingConfig("GBP", e3.d, "£"));
        map.put("ES", new AmazonParsingConfig("EUR", ",", "€"));
        map.put("MX", new AmazonParsingConfig("USD", e3.d, "USD"));
        map.put("DE", new AmazonParsingConfig("EUR", ",", "€"));
        map.put("FR", new AmazonParsingConfig("EUR", ",", "€"));
        map.put("AU", new AmazonParsingConfig("AUD", e3.d, e3.c));
        map.put("IT", new AmazonParsingConfig("EUR", ",", "€"));
        map.put("NL", new AmazonParsingConfig("USD", ",", "US$"));
        this.amazonProductMapping = map;
        this.iap_activity_delay_timestamp = 10000L;
        this.bizTrackWhiteList = Collections.emptyList();
        this.iapExternalErrorMsgMapping = Collections.emptyMap();
        this.channelErrorRefactoredMapping = Collections.emptyMap();
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("US", bool)};
        HashMap map2 = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map2.put(key, value) == null) {
            this.externalPaymentCountrySwitch = Collections.unmodifiableMap(map2);
        } else {
            throw new IllegalArgumentException("duplicate key: " + key);
        }
    }
}
