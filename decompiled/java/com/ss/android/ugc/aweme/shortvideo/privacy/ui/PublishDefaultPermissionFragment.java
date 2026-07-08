package com.ss.android.ugc.aweme.shortvideo.privacy.ui;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C06LR;
import X.C098200Yq;
import X.C0C64;
import X.C0CHQ;
import X.C0LOK;
import X.C0OM1;
import X.C10BZ;
import X.C10CC;
import X.C10CD;
import X.C10CK;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C1389880mGw;
import X.C1391190mJ3;
import X.C13LQ;
import X.C1413370msp;
import X.C1428470nHB;
import X.C1444600nhC;
import X.C1556730qc3;
import X.C1644450stX;
import X.C1685300txQ;
import X.C1843500y4a;
import X.C189200o6;
import X.C19292410dm;
import X.C19322710if;
import X.C19331610k6;
import X.C197020126o;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C298250BmZ;
import X.C298680BnG;
import X.C343970De7;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C431260Gvc;
import X.C444910HcX;
import X.C444920HcY;
import X.C452501pT;
import X.C547860LeC;
import X.C548590LfN;
import X.C786410Ut5;
import X.C814420VxA;
import X.C857690Xkl;
import X.InterfaceC1294060jmO;
import X.InterfaceC344240DeY;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import uxk.a;

/* JADX INFO: loaded from: classes29.dex */
public class PublishDefaultPermissionFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9ODclPyHELIOS4wMWs5IGEDPScgIDw7DCAqKDo/PBUpOyI6OzYlJiEVOiQrJCo9PA==";
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public C197039127h LLILZIL;
    public TuxTextView LLILZLL;
    public C127K LLIZ;
    public C127K LLIZLLLIL;
    public C127K LLJ;
    public C127K LLJI;
    public Function1<? super Integer, Unit> LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public C10CC LLJJ;
    public SoftReference<Fragment> LLJJJIL;
    public C10CK LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public VideoPublishEditModel LLJL;
    public boolean LLJLL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 331));
    public final C11NJ LLJILLL = new C11NJ();
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 562));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 560));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 561));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 563));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 559));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 557));
    public final Map<Integer, C127K> LLJJJJ = new LinkedHashMap();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 330));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(379));

    public String WR() {
        return "video_post_page";
    }

    public String ZR() {
        return "video_publish_page";
    }

    public void clearFromXmlViewCache() {
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    public void MR() {
        ViewGroup viewGroup = (ViewGroup) this.LLJJJ.getValue();
        if (viewGroup != null) {
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            VideoPublishEditModel videoPublishEditModel = this.LLJL;
            iPrivacyServiceLJIJJ.LJIILIIL((videoPublishEditModel == null || !C1428470nHB.LJJZZI(videoPublishEditModel)) ? "video_publish" : "photo_publish", viewGroup);
        }
    }

    public int RR() {
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        if (videoPublishEditModel != null) {
            if (C298680BnG.LIZ()) {
                a.LIZ.getClass();
                if (a.LIZ() == 4) {
                    return a.LIZJ();
                }
            } else if (C857690Xkl.LIZ(videoPublishEditModel)) {
                a.LIZ.getClass();
                if (a.LIZ() == 4) {
                    return a.LIZJ();
                }
            }
        }
        a.LIZ.getClass();
        return a.LIZ();
    }

    public final int SR() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    public final PermissionConfigure aS() {
        return (PermissionConfigure) this.LLJIJIL.getValue();
    }

    public final C127K bS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q9x) : null;
            this.LLJI = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final TuxTextView cS() {
        return (TuxTextView) this.LLJJIJIIJIL.getValue();
    }

    public final C127K dS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q_4) : null;
            this.LLJ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final CharSequence gS() {
        C548590LfN.LIZ.getClass();
        PublishService publishServiceLIZLLL = C548590LfN.LIZLLL();
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        if (publishServiceLIZLLL.LIZ(videoPublishEditModel != null ? videoPublishEditModel.creativeModel : null)) {
            C547860LeC.LIZ.getClass();
            return C547860LeC.LJI().LIZLLL(C0LOK.LIZ, 2131826083, null);
        }
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        return (privacySettingsAgreementRecordLJJIJ == null || 1 != privacySettingsAgreementRecordLJJIJ.status) ? getString(2131844946) : getString(2131845582);
    }

    public final C197039127h hS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ula) : null;
            this.LLILZIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final boolean mS() {
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        CommerceToolsTcmModel tcmModel;
        CreativeModel creativeModel2;
        CommerceToolsModel commerceToolsModel2;
        CommerceToolsTcmModel tcmModel2;
        CreativeModel creativeModel3;
        CommerceToolsModel commerceToolsModel3;
        CommerceToolsTcmModel tcmModel3;
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (commerceToolsModel3 = creativeModel3.commerceModel) != null && (tcmModel3 = commerceToolsModel3.getTcmModel()) != null && tcmModel3.getAdsAuthorizationSwitch()) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLJL;
        String sparkAdsAuth = null;
        if (videoPublishEditModel2 == null || (creativeModel = videoPublishEditModel2.creativeModel) == null || (commerceToolsModel = creativeModel.commerceModel) == null || (tcmModel = commerceToolsModel.getTcmModel()) == null || tcmModel.getSparkAdsAuth() == null) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLJL;
        if (videoPublishEditModel3 != null && (creativeModel2 = videoPublishEditModel3.creativeModel) != null && (commerceToolsModel2 = creativeModel2.commerceModel) != null && (tcmModel2 = commerceToolsModel2.getTcmModel()) != null) {
            sparkAdsAuth = tcmModel2.getSparkAdsAuth();
        }
        return !Intrinsics.LJFF(sparkAdsAuth, "{}");
    }

    public final void oS() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "publish");
        VideoPublishEditModel videoPublishEditModel = aS().getVideoPublishEditModel();
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel != null ? videoPublishEditModel.getCreationId() : null);
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LIZJ(SR(), "muf_cnt");
        C20684815ws.LJIILLIIL("click_mutual_friends_list", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Fragment fragment;
        this.LLJILLL.LJ();
        C10CC c10cc = this.LLJJ;
        if (c10cc != null) {
            SoftReference<Fragment> softReference = c10cc.LJIIIZ;
            if (softReference != null && (fragment = softReference.get()) != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
            }
            SoftReference<Fragment> softReference2 = c10cc.LJIIIZ;
            if (softReference2 != null) {
                softReference2.clear();
            }
        }
        super.onDestroy();
    }

    public final void qS() {
        C1444600nhC.LIZ.getClass();
        boolean z = C1444600nhC.LIZ() && !mS();
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        String strWR = WR();
        int currentPermission = aS().getCurrentPermission();
        int i = this.LLJJL;
        int iSR = SR();
        C1556730qc3 c1556730qc3 = z ? new C1556730qc3(RR(), this.LLJJLIIIJLLLLLLLZ) : null;
        c10cd.getClass();
        C10CD.LJ(videoPublishEditModel, strWR, currentPermission, i, iSR, c1556730qc3);
    }

    public int yS() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public static boolean HS() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "post_process_ui_optimize", true) == 1;
    }

    public C0OM1 Sn() {
        Context context;
        String string;
        Context context2;
        Integer numPR;
        View view = getView();
        if (view == null || (context = view.getContext()) == null) {
            context = getContext();
        }
        int iIntValue = (context == null || (numPR = PR(context)) == null) ? 0 : numPR.intValue();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZIZ(NR(getString(2131823353), new AwS572S0100000_28(this, 558)));
        C1250250idj c1250250idj = new C1250250idj();
        if (C10BZ.LIZ()) {
            View view2 = getView();
            if ((view2 == null || (context2 = view2.getContext()) == null) && (context2 = getContext()) == null) {
                string = "";
            } else {
                VideoPublishEditModel videoPublishEditModel = this.LLJL;
                CreativeModel creativeModel = videoPublishEditModel != null ? videoPublishEditModel.creativeModel : null;
                C548590LfN.LIZ.getClass();
                if (C548590LfN.LIZLLL().LIZ(creativeModel)) {
                    C547860LeC.LIZ.getClass();
                    string = C547860LeC.LJI().LIZLLL(C0LOK.LIZ, 2131826083, null);
                    if (string == null) {
                        string = context2.getString(2131844946);
                    }
                } else {
                    PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
                    string = (privacySettingsAgreementRecordLJJIJ == null || 1 != privacySettingsAgreementRecordLJJIJ.status) ? context2.getString(2131844946) : context2.getString(2131845582);
                }
            }
        } else {
            string = getString(2131858432);
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        c0om1.LIZJ(iIntValue);
        return c0om1;
    }

    public final TuxTextView UR() {
        int i = C10BZ.LIZ() ? R.id.yak : R.id.jok;
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(i) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public void iS() {
        PostBtnConfigure postBtnConfigure = aS().getPostBtnConfigure();
        if (postBtnConfigure != null) {
            C197039127h c197039127hHS = hS();
            C786410Ut5.LLLLLLJ(c197039127hHS, postBtnConfigure.getEnable() ? 0 : 8);
            C786410Ut5.U8(c197039127hHS, new ACListenerS162S0100000_28(this, 75));
            if (this.LLJJL != -1) {
                c197039127hHS.setEnabled(true);
            }
            String btnText = postBtnConfigure.getBtnText();
            if (btnText.length() > 0) {
                c197039127hHS.setText(btnText);
            }
        }
    }

    public final boolean nS() {
        ICreativeSAAService iCreativeSAAService;
        C19EG activity = getActivity();
        Scene currentScene = null;
        if (activity != null && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
            currentScene = iCreativeSAAService.getCurrentScene(activity);
        }
        return currentScene instanceof VideoEditContainerScene;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C10CD c10cd = C10CD.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJL;
        String strWR = WR();
        int currentPermission = aS().getCurrentPermission();
        int iRR = RR();
        boolean zBooleanValue = ((Boolean) this.LLJLIL.getValue()).booleanValue();
        int iSR = SR();
        c10cd.getClass();
        C10CD.LJFF(videoPublishEditModel, strWR, currentPermission, iRR, zBooleanValue, iSR);
    }

    public int uS() {
        return C10BZ.LIZ() ? R.style.al4 : R.style.my;
    }

    public int wS() {
        return C10BZ.LIZ() ? R.drawable.d8c : R.drawable.aqj;
    }

    public static Integer PR(Context context) {
        int i;
        if (C10BZ.LIZ()) {
            i = R.attr.a1b;
        } else {
            i = R.attr.a1e;
        }
        return C1308910kAL.LIZJ(i, context);
    }

    public void JS(View view) {
        if (C10BZ.LIZ()) {
            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), 23);
        }
        View viewFindViewById = view.findViewById(R.id.q99);
        viewFindViewById.setBackgroundResource(wS());
        C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(yS()), null, Integer.valueOf(yS()), null, false, 26);
    }

    public void OR(int i) {
        if (i == 4) {
            View view = (View) this.LLJJI.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            View view2 = (View) this.LLJJI.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        C10CK c10ck = this.LLJJJJJIL;
        if (c10ck != null) {
            c10ck.LIZJ(i);
        }
        if (hS().getVisibility() == 0) {
            hS().setEnabled(true);
        }
    }

    public String VR(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return "";
                    }
                    return "publish_privacy_visibility_options_subscriber";
                }
                return "publish_privacy_visibility_options_friend_visible";
            }
            if (mS()) {
                return "publish_privacy_visibility_options_available_for_ads";
            }
            return "publish_privacy_visibility_options_private";
        }
        return "publish_privacy_visibility_options_public";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void kS(android.content.Context r13) {
        /*
            r12 = this;
            boolean r0 = X.C298680BnG.LIZ()
            r5 = 8
            r6 = r12
            if (r0 == 0) goto L27
            boolean r0 = r6.mS()
            if (r0 != 0) goto L1d
            com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure r0 = r6.aS()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getVideoPublishEditModel()
            boolean r0 = X.C1453840nw6.LJ(r0)
            if (r0 == 0) goto L3d
        L1d:
            X.127K r0 = r6.bS()
            if (r0 == 0) goto L26
            X.C786410Ut5.LLZLL(r0, r5)
        L26:
            return
        L27:
            boolean r0 = r6.nS()
            if (r0 != 0) goto L33
            boolean r0 = r6.mS()
            if (r0 == 0) goto L3d
        L33:
            X.127K r0 = r6.bS()
            if (r0 == 0) goto L3c
            X.C786410Ut5.LLZLL(r0, r5)
        L3c:
            return
        L3d:
            com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure r0 = r6.aS()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.getVideoPublishEditModel()
            if (r4 != 0) goto L48
            return
        L48:
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r2 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIJJ()
            r1 = 2
            java.lang.String r0 = "visibility"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r3 = r2.LJIIIZ(r1, r0)
            X.127K r7 = r6.bS()
            if (r7 == 0) goto L8d
            boolean r0 = X.C857690Xkl.LIZ(r4)
            r2 = 0
            if (r0 == 0) goto L90
            X.C786410Ut5.LLZLL(r7, r5)
        L63:
            r11 = 0
        L64:
            r8 = 4
            if (r3 == 0) goto L8e
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption r10 = X.C856230XiP.LIZ(r3, r0)
        L70:
            r9 = r13
            r6.FS(r7, r8, r9, r10, r11)
            X.127M r2 = r7.getAccessory()
            X.11GO r2 = (X.C11GO) r2
            kotlin.jvm.internal.AwS429S0200000_28 r1 = new kotlin.jvm.internal.AwS429S0200000_28
            r0 = 60
            r1.<init>(r6, r7, r0)
            r2.LJIILL(r1)
            java.util.Map<java.lang.Integer, X.127K> r1 = r6.LLJJJJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.put(r0, r7)
        L8d:
            return
        L8e:
            r10 = 0
            goto L70
        L90:
            X.0XhF r0 = X.C855510XhF.LIZ
            r0.getClass()
            boolean r0 = X.C0L44.LIZ()
            r1 = 1
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.MusicObject r0 = r0.music
            if (r0 == 0) goto Lb0
            boolean r0 = r0.isCommerceMusic
            if (r0 != 0) goto Lb0
            X.C786410Ut5.LLZLL(r7, r2)
            r7.setCellEnabled(r2)
            r11 = 1
            goto L64
        Lb0:
            X.C786410Ut5.LLZLL(r7, r2)
            r7.setCellEnabled(r1)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment.kS(android.content.Context):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJL = aS().getVideoPublishEditModel();
        this.LLJJL = aS().getCurrentPermission();
    }

    public void sS(View view) {
        int i;
        Integer numValueOf;
        C127K c127k;
        this.LLJJLIIIJLLLLLLLZ = true;
        int iRR = RR();
        a aVar = a.LIZ;
        int i2 = this.LLJJL;
        aVar.getClass();
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i2), new Integer[]{0, 2, 1, 4}) >= 0) {
            a.LJIIIIZZ.storeInt(a.LJ(a.LIZJ), i2);
        }
        int i3 = this.LLJJL;
        this.LLJJJJLIIL = i3;
        if (iRR != i3) {
            Context context = view.getContext();
            C127K c127k2 = (C127K) ((LinkedHashMap) this.LLJJJJ).get(Integer.valueOf(iRR));
            if (c127k2 != null && (c127k = (C127K) ((LinkedHashMap) this.LLJJJJ).get(Integer.valueOf(i3))) != null) {
                zS(c127k2, iRR, context);
                zS(c127k, i3, context);
                return;
            }
            return;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        return;
                    } else {
                        numValueOf = 2131829733;
                    }
                } else {
                    numValueOf = 2131829735;
                }
            } else {
                numValueOf = 2131829736;
            }
        } else {
            C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
            if (currentUser != null && currentUser.LJIIJJI()) {
                i = 2131829737;
            } else {
                i = 2131829734;
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LJIIIIZZ(iIntValue);
        c1389880mGw.LJIIJ();
    }

    public static AbstractC1250290idn NR(String str, Function0 function0) {
        if (C10BZ.LIZ()) {
            C197020126o c197020126o = new C197020126o();
            c197020126o.LJFF = Integer.valueOf(R.attr.a03);
            c197020126o.LIZ(function0);
            return c197020126o;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = str;
        c1251150ifB.LIZJ(function0);
        return c1251150ifB;
    }

    @InterfaceC1294060jmO
    public final void ES(CMPreviewInfo cMPreviewInfo, boolean z) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Keva keva = C1413370msp.LIZ;
        int iIntValue = 0;
        if (keva.getBoolean("IS_FIRST_TIME_PERMISSION_PREVIEW_HIGHLIGHT", true)) {
            keva.storeBoolean("IS_FIRST_TIME_PERMISSION_PREVIEW_HIGHLIGHT", false);
            C06LR.LIZIZ((View) this.LLJJI.getValue());
        }
        if (cMPreviewInfo != null && Long.valueOf(cMPreviewInfo.previewDurationTimeInMs) != null) {
            String strLIZ = C06LR.LIZ(cMPreviewInfo.previewDurationTimeInMs, getContext());
            TuxTextView tuxTextViewCS = cS();
            if (tuxTextViewCS != null) {
                tuxTextViewCS.setText(strLIZ);
                return;
            }
            return;
        }
        if (z) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            }
            TuxTextView tuxTextViewCS2 = cS();
            if (tuxTextViewCS2 != null) {
                tuxTextViewCS2.setTextColor(iIntValue);
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLJJIJIL.getValue();
            if (tuxIconView != null) {
                tuxIconView.setTintColor(iIntValue);
            }
        } else {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            TuxTextView tuxTextViewCS3 = cS();
            if (tuxTextViewCS3 != null) {
                tuxTextViewCS3.setTextColor(iIntValue);
            }
            TuxIconView tuxIconView2 = (TuxIconView) this.LLJJIJIL.getValue();
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(iIntValue);
            }
        }
        TuxTextView tuxTextViewCS4 = cS();
        if (tuxTextViewCS4 == null) {
            return;
        }
        tuxTextViewCS4.setText(getString(R.string.mf6));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ad  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void rS(int i, boolean z) {
        Integer numValueOf;
        int iIntValue;
        Pair pair;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_tag", ZR());
        c2344009Gk.LJIIIIZZ("item_name", VR(i));
        c2344009Gk.LJIIIIZZ("item_type", "Radio");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_enabled");
        c2344009Gk.LIZJ(i, "option_value");
        C10CK c10ck = this.LLJJJJJIL;
        if (c10ck != null) {
            C1644450stX<Integer, Boolean> value = c10ck.LIZJ.getValue();
            if (value != null && (pair = (Pair) value.LIZ) != null) {
                iIntValue = ((Number) pair.getFirst()).intValue();
            } else {
                iIntValue = -1;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "from_value");
        c2344009Gk.LIZJ(i, "to_value");
        C20684815ws.LJIILLIIL("pns_tpsc_item_click", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        Integer numPR;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = getContext();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, uS());
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(contextThemeWrapper), R.layout.c9h, viewGroup, false);
        if (C10BZ.LIZ() && (numPR = PR(contextThemeWrapper)) != null) {
            viewTd.setBackgroundColor(numPR.intValue());
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public final void zS(C127K c127k, int i, Context context) {
        String string;
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        string = "";
                    } else {
                        string = C0CHQ.LIZ.getString(2131829730);
                    }
                } else {
                    string = getResources().getString(2131829278);
                }
            } else if (mS()) {
                string = getResources().getString(2131838048);
            } else {
                Resources resources = getResources();
                if (C298250BmZ.LIZ()) {
                    i2 = 2131829281;
                } else {
                    i2 = 2131829280;
                }
                string = resources.getString(i2);
            }
        } else {
            C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
            if (currentUser != null && currentUser.LJIIJJI()) {
                string = getResources().getString(2131829277);
            } else {
                string = getResources().getString(2131829276);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        if (!this.LLJLL && i == 2 && C0C64.LJIILLIIL().LJIJ(31744, 0, "pns_display_number_of_friends", false) == 2) {
            spannableStringBuilder.append((CharSequence) "*");
            C786410Ut5.q2(spannableStringBuilder, new C19322710if(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) C1843500y4a.LIZIZ(SR()));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length, spannableStringBuilder.length(), 33);
            }
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(101, false), 0, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) "*");
            C786410Ut5.q2(spannableStringBuilder, new C19322710if(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
            spannableStringBuilder.append((CharSequence) "*");
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            C786410Ut5.q2(spannableStringBuilder, new C19331610k6(context, this, 4), length, spannableStringBuilder.length(), 33);
            ((TextView) c127k.findViewById(R.id.y3j)).setMovementMethod(C431260Gvc.LIZ);
        }
        if (!this.LLJLL) {
            C1444600nhC.LIZ.getClass();
            if (C1444600nhC.LIZ() && !mS() && i == this.LLJJJJLIIL) {
                String string2 = context.getString(2131829729);
                spannableStringBuilder.append((CharSequence) "*");
                C786410Ut5.q2(spannableStringBuilder, new C19322710if(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) string2);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
                if (numLIZJ2 != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), length2, spannableStringBuilder.length(), 33);
                }
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(101, false), 0, spannableStringBuilder.length(), 33);
                c127k.setTitle(spannableStringBuilder);
                return;
            }
        }
        C444910HcX c444910HcX = new C444910HcX(spannableStringBuilder);
        c444910HcX.LIZ(101);
        c127k.setTitle(c444910HcX);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7 A[PHI: r15
      0x01b7: PHI (r15v6 boolean) = (r15v19 boolean), (r15v8 boolean) binds: [B:12:0x0027, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219 A[PHI: r15
      0x0219: PHI (r15v1 boolean) = (r15v9 boolean), (r15v13 boolean), (r15v16 boolean), (r15v17 boolean), (r15v0 boolean), (r15v7 boolean) binds: [B:64:0x020a, B:66:0x020e, B:54:0x01cb, B:6:0x0015, B:8:0x001b, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FS(X.C127K r21, int r22, android.content.Context r23, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment.FS(X.127K, int, android.content.Context, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption, boolean):void");
    }

    public static void BS(PublishDefaultPermissionFragment publishDefaultPermissionFragment, int i, C127K c127k, PrivacySettingsRestrictionOption privacySettingsRestrictionOption, boolean z, boolean z2, int i2) {
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        publishDefaultPermissionFragment.getClass();
        if ((privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.showType == 1) || z3 || z2) {
            c127k.setCellEnabled(false);
            C786410Ut5.F5(c127k, 0.4f);
            C127M accessory = c127k.getAccessory();
            if (accessory != null) {
                accessory.LJI(new AwS9S0211000_28(publishDefaultPermissionFragment, i, z3, privacySettingsRestrictionOption, 3));
                return;
            }
            return;
        }
        C786410Ut5.F5(c127k, 1.0f);
        c127k.setCellEnabled(true);
    }
}
