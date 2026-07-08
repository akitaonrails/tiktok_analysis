package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic;

import X.C09JN;
import X.C11JF;
import X.C11S5;
import X.C1701940uOG;
import X.C480460Ism;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.widget.NextLiveData;
import webcast.api.sub.GetSubOnlyLiveStatResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyStatisticsEnhanceViewModel extends ViewModel {
    public C11JF LL;
    public final NextLiveData<GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData> LLILLJJLI;
    public final NextLiveData LLILLL;

    public static String vQ2(float f) {
        return f >= 80.0f ? "top20" : (f < 30.0f || f >= 80.0f) ? "others" : "top20_70";
    }

    public SubOnlyStatisticsEnhanceViewModel() {
        NextLiveData<GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData> nextLiveData = new NextLiveData<>();
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = nextLiveData;
    }

    public final void xQ2() {
        C480460Ism.LIZ().getClass();
        this.LL = (C11JF) ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).subAnchorLiveStatistic(1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Jal
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
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubOnlyStatisticsEnhanceViewModel@b708.requestFeedbackPart$1");
                T t = ((BaseResponse) obj).data;
                GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData getSubOnlyLiveStatData = (GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData) t;
                if (getSubOnlyLiveStatData.titleType >= 0 && getSubOnlyLiveStatData.descriptionType >= 0) {
                    this.LL.LLILLJJLI.setValue(t);
                }
                C1C7U.LIZIZ("SubOnlyStatisticsEnhanceViewModel@b708.requestFeedbackPart$1");
            }
        }, new C09JN() { // from class: X.0JZZ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SubOnlyStatisticsEnhanceViewModel@b708.requestFeedbackPart$2");
                C1C7U.LIZIZ("SubOnlyStatisticsEnhanceViewModel@b708.requestFeedbackPart$2");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wQ2(java.lang.String r8, java.lang.String r9, webcast.api.sub.GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData r10) {
        /*
            int r0 = r10.titleType
            r3 = 4
            r7 = 3
            r6 = 2
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L94
            if (r0 == r4) goto L87
            if (r0 == r6) goto L7a
            if (r0 == r7) goto L6d
            if (r0 == r3) goto L60
            r0 = 0
            r1 = r0
        L13:
            int r2 = r10.titleType
            if (r2 != r3) goto L5e
            int r3 = r10.descriptionType
            r2 = 5
            if (r3 != r2) goto L5e
            r5 = 1
        L1d:
            int r2 = r10.descriptionType
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L58
            if (r2 == r6) goto L55
            if (r2 != r7) goto L5b
            java.lang.String r4 = "both"
        L29:
            java.lang.String r2 = "livesdk_sub_only_live_data_section_preview_show"
            X.0IjA r3 = X.C0IJT.LIZ(r2)
            java.lang.String r2 = "show_entrance"
            r3.LJJII(r8, r2)
            java.lang.String r2 = "anchor_id"
            r3.LJJII(r9, r2)
            java.lang.String r2 = "title_wording_type"
            r3.LJJII(r0, r2)
            java.lang.String r0 = "title_percentage_level"
            r3.LJJII(r1, r0)
            java.lang.String r1 = "has_live_duration"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.LJJII(r0, r1)
            java.lang.String r0 = "has_sub_revenue"
            r3.LJJII(r4, r0)
            r3.LIZ()
            return
        L55:
            java.lang.String r4 = "only_subscription_extension"
            goto L29
        L58:
            java.lang.String r4 = "only_new_subscription"
            goto L29
        L5b:
            java.lang.String r4 = "none"
            goto L29
        L5e:
            r5 = 0
            goto L1d
        L60:
            webcast.data.SubOnlyLiveGeneralStat r0 = r10.generalStat
            if (r0 == 0) goto L66
            float r1 = r0.subOnlyLiveTimeRank
        L66:
            java.lang.String r1 = vQ2(r1)
            java.lang.String r0 = "live_duration"
            goto L13
        L6d:
            webcast.data.SubOnlyLiveGeneralStat r0 = r10.generalStat
            if (r0 == 0) goto L73
            float r1 = r0.subViewerRank
        L73:
            java.lang.String r1 = vQ2(r1)
            java.lang.String r0 = "subscription_viewer"
            goto L13
        L7a:
            webcast.data.SubOnlyLiveGeneralStat r0 = r10.generalStat
            if (r0 == 0) goto L80
            float r1 = r0.extendSubRank
        L80:
            java.lang.String r1 = vQ2(r1)
            java.lang.String r0 = "subscription_extension"
            goto L13
        L87:
            webcast.data.SubOnlyLiveGeneralStat r0 = r10.generalStat
            if (r0 == 0) goto L8d
            float r1 = r0.newSubRank
        L8d:
            java.lang.String r1 = vQ2(r1)
            java.lang.String r0 = "new_subscription"
            goto L13
        L94:
            java.lang.String r1 = vQ2(r1)
            java.lang.String r0 = "fallback"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel.wQ2(java.lang.String, java.lang.String, webcast.api.sub.GetSubOnlyLiveStatResponse$GetSubOnlyLiveStatData):void");
    }
}
