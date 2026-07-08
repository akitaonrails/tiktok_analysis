package com.bytedance.pumbaa.app2app.data;

import X.C09CT;
import X.C0WSC;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class App2AppData {
    public static final /* synthetic */ int LIZIZ = 0;
    public transient C0WSC LIZ;

    @C09CT("aidl_descriptor")
    public String aidlDescriptor;

    @C09CT("aidl_package")
    public String aidlPackage;

    @C09CT("auto_dfid")
    public String autoDFID;

    @C09CT("broadcast_result_extra")
    public List<KV> broadCastResultExtra;

    @C09CT("call_site")
    public String callSite;

    @C09CT("caller_package")
    public String callerPackage;

    @C09CT("code_point_tag")
    public String[] codePointTag;

    @C09CT("content_provider_kv")
    public List<KV> contentProviderKv;

    @C09CT("content_provider_uri")
    public App2AppUri contentProviderUri;

    @C09CT("dfid")
    public String dfid;

    @C09CT("enable_auto_dfid")
    public Boolean enableAutoDFID;

    @C09CT("intent_action")
    public String intentAction;

    @C09CT("intent_categories")
    public List<String> intentCategories;

    @C09CT("intent_chooser_title")
    public String intentChooserTitle;

    @C09CT("intent_component")
    public String intentComponent;

    @C09CT("intent_data_uri")
    public App2AppUri intentDataUri;

    @C09CT("intent_extra")
    public List<KV> intentExtra;

    @C09CT("intent_package")
    public String intentPackage;

    @C09CT("intent_type")
    public String intentType;

    @C09CT("is_intent_chooser")
    public Boolean isIntentChooser;

    @C09CT("type")
    public String type;

    public App2AppData(String str, String str2, String str3, String str4, String str5, List<String> list, App2AppUri app2AppUri, String str6, List<KV> list2, Boolean bool, String str7, App2AppUri app2AppUri2, List<KV> list3, String str8, List<KV> list4, String str9, String str10, String str11, String[] strArr, String str12, Boolean bool2, C0WSC c0wsc) {
        this.type = str;
        this.dfid = str2;
        this.intentComponent = str3;
        this.intentPackage = str4;
        this.intentAction = str5;
        this.intentCategories = list;
        this.intentDataUri = app2AppUri;
        this.intentType = str6;
        this.intentExtra = list2;
        this.isIntentChooser = bool;
        this.intentChooserTitle = str7;
        this.contentProviderUri = app2AppUri2;
        this.contentProviderKv = list3;
        this.callerPackage = str8;
        this.broadCastResultExtra = list4;
        this.aidlDescriptor = str9;
        this.aidlPackage = str10;
        this.callSite = str11;
        this.codePointTag = strArr;
        this.autoDFID = str12;
        this.enableAutoDFID = bool2;
        this.LIZ = c0wsc;
    }
}
