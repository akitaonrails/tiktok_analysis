package com.ss.android.ugc.aweme.detail.api;

import X.C0CQT;
import X.C0X9S;
import X.C2188811AlT;
import X.C7740030o;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class DetailApi {
    public static final String LIZ;
    public static final IDetailApi LIZIZ;

    public interface IDetailApi {
        @InterfaceC1501160pAQ("/aweme/v1/aweme/detail/")
        C0X9S<String> queryAweme(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("origin_type") String str2, @InterfaceC1501070pAH("request_source") int i, @InterfaceC1501070pAH("notice_source") int i2, @InterfaceC1501070pAH("translator_id") String str3, @InterfaceC1501070pAH("share_scene") int i3, @InterfaceC1501070pAH("preload_type") int i4, @InterfaceC1501070pAH("is_topview") int i5, @InterfaceC1501070pAH("friend_relation_status") int i6);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/ad/experience/ad/history/detail/")
        C0X9S<String> queryAwemeFromInbox(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("msg_extra") String str2);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/multi/aweme/detail/")
        C0X9S<BatchDetailList> queryBatchAweme(@InterfaceC1501050pAF("aweme_ids") String str, @InterfaceC1501050pAF("origin_type") String str2, @InterfaceC1501050pAF("push_params") String str3, @InterfaceC1501050pAF("request_source") int i, @InterfaceC1501070pAH("share_url") String str4, @InterfaceC1501070pAH("share_link_mode") int i2, @InterfaceC1501070pAH("share_scene") int i3);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        sbLIZ.append("/aweme/v1/aweme/detail/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = (IDetailApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str).create(IDetailApi.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Aweme LIZ(int i, int i2, String str, String str2) {
        boolean zEquals = "message".equals(str2);
        FeedInsertRelationManager feedInsertRelationManager = FeedInsertRelationManager.INSTANCE;
        int iConsume = feedInsertRelationManager.consume(str);
        String str3 = LIZIZ.queryAweme(str, str2, zEquals ? 1 : 0, 0, null, 0, i, i2, iConsume).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str3);
        Api.LIZIZ(str3, LIZ, jSONObject);
        Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), jSONObject.optString("aweme_detail"), Aweme.class);
        feedInsertRelationManager.appendMobParam(aweme, iConsume);
        return aweme;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Pair LIZIZ(int i, String str, String str2, String str3) {
        boolean zEquals = "message".equals(str2);
        FeedInsertRelationManager feedInsertRelationManager = FeedInsertRelationManager.INSTANCE;
        int iConsume = feedInsertRelationManager.consume(str);
        String str4 = LIZIZ.queryAweme(str, str2, zEquals ? 1 : 0, i, str3, 1, 0, 0, iConsume).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str4);
        Api.LIZIZ(str4, LIZ, jSONObject);
        int iOptInt = jSONObject.optInt("filter_reason", -1);
        Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), jSONObject.optString("aweme_detail"), Aweme.class);
        if (aweme != null) {
            feedInsertRelationManager.appendMobParam(aweme, iConsume);
        }
        return new Pair(Integer.valueOf(iOptInt), aweme);
    }

    public static BatchDetailList LIZJ(int i, String str, int i2, String str2, String str3, int i3, String str4) throws Exception {
        int i4 = i;
        if (i4 < 0) {
            i4 = 0;
        }
        String str5 = "";
        if ("chat".equals(str3)) {
            i4 = 3;
        } else if ("chat_view_ad".equals(str3)) {
            i4 = 23;
        } else {
            str5 = str3;
        }
        IDetailApi iDetailApi = LIZIZ;
        if (iDetailApi != null) {
            return iDetailApi.queryBatchAweme(str, str5, str2, i4, str4, i2, i3).execute().LIZIZ;
        }
        throw new Exception("S_API Null Pointer");
    }
}
