package com.ss.android.ugc.aweme;

import X.AbstractC1536860q60;
import X.AbstractC1538690q8x;
import X.C0AGC;
import X.C0CCZ;
import X.C0VZ0;
import X.C13BK;
import X.C13BV;
import X.C1536840q5y;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548690qP5;
import X.C1845307Kp;
import X.C19719612Di;
import X.C1BCF;
import X.C2188811AlT;
import X.C2277711EDh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.feed.survey.ISurveyConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
@C1BCF(distinctId = 104, taskType = "preload")
public final class EcosystemTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "EcosystemTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        List<String> listLIZLLL;
        new Object() { // from class: X.0qP7
        }.getClass();
        String[] strArr = C1845307Kp.LIZ;
        ISurveyConfigService iSurveyConfigService = (ISurveyConfigService) PluggableExtentionKt.pluggableSpi$default(ISurveyConfigService.class, false, false, false, 14, null);
        if (iSurveyConfigService == null || (listLIZLLL = iSurveyConfigService.LIZLLL()) == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        List<String> listLJII = C2277711EDh.LIZIZ.LJII();
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C0AGC.LIZ.getValue()).booleanValue()) {
            C19719612Di.LJJII(arrayList, strArr);
            arrayList.addAll(listLIZLLL);
        }
        arrayList.addAll(listLJII);
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preCodeCache urlList=");
        StringBuilder sb = new StringBuilder(7);
        C13BK.LIZJ(new String[][]{strArr2}, sb, new ArrayList());
        sbLIZ.append(sb.toString());
        C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList<String> arrayList2 = new ArrayList();
        for (String str : strArr2) {
            if (str.length() > 0) {
                arrayList2.add(str);
            }
        }
        for (final String str2 : arrayList2) {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str2);
            Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            builderBuildUpon.appendQueryParameter("enable_pre_code_cache", "1");
            sparkContext.LJJIIZ(builderBuildUpon.toString());
            C1536840q5y.LIZ(sparkContext, new AbstractC1536860q60() { // from class: X.0qP4
                @Override // X.AbstractC1536860q60
                public final void LJFF() {
                    C1548690qP5.LIZ("onPreloadSuccess");
                }

                @Override // X.AbstractC1536860q60
                public final void LIZIZ() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPreCodeCachePosted, msg: ");
                    sbLIZ2.append("post js cache generating");
                    C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    C1548670qP3.LIZIZ.put(str2, Boolean.TRUE);
                }

                @Override // X.AbstractC1536860q60
                public final void LIZ(String str3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPreCodeCacheFailed, msg: ");
                    sbLIZ2.append(str3);
                    C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.AbstractC1536860q60
                public final void LIZJ(String str3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPreDecodeFailed, msg: ");
                    sbLIZ2.append(str3);
                    C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.AbstractC1536860q60
                public final void LIZLLL(TemplateBundle templateBundle) {
                    C1548690qP5.LIZ("onPreDecodeSuccess");
                    C1548670qP3.LIZ.put(str2, Boolean.TRUE);
                }

                @Override // X.AbstractC1536860q60
                public final void LJ(String str3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPreloadFailed, msg: ");
                    sbLIZ2.append(str3);
                    C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }, null, 12);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.0qP6
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "ecosystem";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext2, String str3) {
                super.LJ(sparkContext2, str3);
                String strLJJIL = sparkContext2.LJJIL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handle fullUrl = ");
                sbLIZ2.append(strLJJIL);
                C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (C1845307Kp.LIZIZ.getValue().get(strLJJIL) != null) {
                    SparkContext sparkContext3 = new SparkContext();
                    sparkContext3.LJJLIIJ(strLJJIL);
                    Uri.Builder builderBuildUpon2 = UriProtector.parse(strLJJIL).buildUpon();
                    builderBuildUpon2.appendQueryParameter("enable_memory_cache", "1");
                    builderBuildUpon2.appendQueryParameter("enable_pre_code_cache", "1");
                    sparkContext3.LJJIIZ(builderBuildUpon2.toString());
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fullUrl = ");
                    sbLIZ3.append(strLJJIL);
                    sbLIZ3.append(", find sparkContext");
                    C1548690qP5.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        };
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
    }
}
