package com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces;

import X.C0TPB;
import X.C1917080zzG;
import X.C1917100zzI;
import X.C1917110zzJ;
import X.C1917120zzK;
import X.C19EG;
import X.C20656615sK;
import X.C746210TOx;
import X.InterfaceC1009590cNZ;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS265S0300000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface IComplianceService {
    int LIZIZ();

    boolean LJ();

    void LJFF(JSONObject jSONObject);

    void LJI(boolean z);

    boolean LJII();

    boolean LJIIIIZZ();

    void LJIIIZ(String str, String str2, C1917100zzI c1917100zzI, C19EG c19eg);

    void LJIIJ(C19EG c19eg, AwemeRawAd awemeRawAd, String str);

    boolean LJIIJJI();

    boolean LJIIL();

    InterfaceC1009590cNZ LJIILIIL();

    boolean LJIILJJIL();

    int LJIILL();

    Object LJIILLIIL();

    void LJIIZILJ(C19EG c19eg, C20656615sK c20656615sK);

    void LJIJ();

    boolean LJIJI();

    String LJIJJ();

    boolean LJIJJLI();

    Object LJIL(Object obj);

    Object LJJ();

    void LJJI(C19EG c19eg, C1917080zzG c1917080zzG);

    void LJJIFFI(C19EG c19eg, AwemeRawAd awemeRawAd, String str);

    void LJJII(JSONObject jSONObject);

    Fragment LJJIII(C1917110zzJ c1917110zzJ, PickYourAdPlanPage pickYourAdPlanPage);

    boolean LJJIIJ();

    boolean LJJIIJZLJL();

    boolean LJJIIZ(PickYourAdPlanPage pickYourAdPlanPage, int i);

    String LJJIIZI(Context context);

    View LJJIJ(Context context);

    void LJJIJIIJI(C19EG c19eg, C20656615sK c20656615sK);

    void LJJIJIIJIL(Context context, C746210TOx c746210TOx);

    boolean LJJIJIL();

    void LJJIJL(Context context, String str);

    String LJJIJLIJ(Context context);

    void LJJIL(Context context, String str);

    String LJJIZ();

    boolean LJJJ(Aweme aweme);

    boolean LJJJI();

    void LJJJIL();

    void LJJJJ(Context context, Aweme aweme);

    boolean LJJJJI();

    boolean LJJJJIZL();

    C0TPB LJJJJJ();

    boolean LJJJJJL();

    Fragment LJJJJL(C1917120zzK c1917120zzK, AdFreeTrialPageInfo adFreeTrialPageInfo);

    TuxSheet LJJJJLI(C19EG c19eg, Aweme aweme, boolean z, AwS265S0300000_21 awS265S0300000_21, AwS265S0300000_21 awS265S0300000_212);

    boolean LJJJJLL();

    void LJJJJZ(C19EG c19eg, C20656615sK c20656615sK);

    boolean LJJJJZI();
}
