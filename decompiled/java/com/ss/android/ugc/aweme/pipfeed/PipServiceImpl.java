package com.ss.android.ugc.aweme.pipfeed;

import X.AbstractC1604130rqV;
import X.AbstractC738140SxQ;
import X.C07HE;
import X.C0BVS;
import X.C0C64;
import X.C109300bD;
import X.C1210960hcM;
import X.C1210990hcP;
import X.C1211000hcQ;
import X.C12YQ;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C13IQ;
import X.C13LE;
import X.C1601000rlS;
import X.C1620120sGI;
import X.C1873590yr7;
import X.C19392510tv;
import X.C19719612Di;
import X.C19EG;
import X.C2188811AlT;
import X.C299060Bns;
import X.C425020GlY;
import X.C844470XAv;
import X.EnumC429120GsA;
import X.InterfaceC19392410tu;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS144S1200000_29;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class PipServiceImpl implements IPipFeedService {
    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIJJI() {
        return C13LE.LIZ(PipFeedMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZ() {
        C19719612Di.LJJIIJ(FeedPipViewModel.LLJJJIL, AFwS257S0000000_19.get$arr$(246), true);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZLLL() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.closeWindowOnly$pipfeed_release("click_back_icon");
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJI() {
        PipFeedManager.Companion.getClass();
        return C1620120sGI.LIZ.getPlayerControllerNeedReportExtraRenderEvent$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final List<String> LJIIIZ() {
        PipFeedManager.Companion.getClass();
        return PipFeedManager.sceneWhiteList;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIIL() {
        PipFeedManager.Companion.getClass();
        return C1620120sGI.LIZ.isWindowShowing$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIILL() {
        PipFeedManager.Companion.getClass();
        return C1620120sGI.LIZ.isPipEnabled$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIJ() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.onFetchedComplianceSetting$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIJI() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.onComplianceTakeDown$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIJJLI() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.setPlayerControllerNeedReportExtraRenderEvent$pipfeed_release(true);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJJ() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.onAppQuit$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void init() {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.initPip();
        LJIILJJIL("stitch", "duet", "disable_ad_videos", "fyp_whitelist_video", "sub_aweme", "photo_sensitive");
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean md() {
        PipFeedManager.Companion.getClass();
        return C1620120sGI.LIZ.isInPipMode$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJ() {
        return C07HE.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJII() {
        if (C07HE.LIZIZ()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed_pad", false) != 2) {
                return false;
            }
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pip_feed", false) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIJJ() {
        if (!LJIILL()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return C1873590yr7.LIZ(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZJ(AFwS199S0000000_12 aFwS199S0000000_12) {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.runWhenThisWindowClose$pipfeed_release(aFwS199S0000000_12);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJFF(C1601000rlS c1601000rlS) {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.getCallbacks$pipfeed_release().remove(c1601000rlS);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIIJ(boolean z) {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.setPipEnabled$pipfeed_release(z);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILIIL(InterfaceC19392410tu interfaceC19392410tu) {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.getCallbacks$pipfeed_release().add(interfaceC19392410tu);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILJJIL(String... strArr) {
        C1210990hcP next;
        for (String str : strArr) {
            Iterator<C1210990hcP> it2 = C1210960hcM.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1210990hcP c1210990hcP = next;
            if (c1210990hcP != null) {
                CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
                C1211000hcQ.LIZIZ(c1210990hcP);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIIZILJ(String str) {
        PipFeedManager.Companion.getClass();
        C1620120sGI.LIZ.setScene$pipfeed_release(str);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIL(Context context) {
        return C1873590yr7.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIIIIZZ(C19EG c19eg, String str) throws IllegalAccessException {
        C19392510tv.LIZ.getClass();
        if (C19392510tv.LIZLLL.contains(str)) {
            PipFeedManager.Companion.getClass();
            C1620120sGI.LIZ.setPipEnabled$pipfeed_release(false);
            if (C299060Bns.LIZ()) {
                C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
                c1389880mGw.LJIIIZ(c19eg.getString(2131840064));
                c1389880mGw.LIZLLL(3000L);
                c1389880mGw.LJIIJ();
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getString(2131840064));
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current scene ");
        sbLIZ.append(str);
        sbLIZ.append(" does not match any PiP scenes!");
        throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILLIIL(C19EG c19eg, AwS572S0100000_28 awS572S0100000_28) {
        C1873590yr7.LIZIZ(c19eg, awS572S0100000_28);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJJI(String str, Aweme aweme) {
        PipFeedManager.Companion.getClass();
        return C1620120sGI.LIZ.shouldShowInLongPress(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZIZ(C19EG c19eg, final String str, final Map<String, String> map) throws IllegalAccessException {
        C19392510tv.LIZ.getClass();
        if (C19392510tv.LIZLLL.contains(str)) {
            PipFeedManager.Companion.getClass();
            Keva keva = C1620120sGI.LIZ.getKeva();
            if (C1873590yr7.LIZ(c19eg)) {
                if (!keva.getBoolean("has_opened_pip", false) && !C0BVS.LIZ()) {
                    AwS144S1200000_29 awS144S1200000_29 = new AwS144S1200000_29(c19eg, (C19EG) str, (String) map, (Map<String, String>) 10);
                    View viewLIZ = C425020GlY.LIZ(c19eg, EnumC429120GsA.TURN_ON_REQUEST, null, AFwS317S0000000_29.get$arr$(22));
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LIZ.LLJJIII = viewLIZ;
                    c1390920mIc.LJIIIIZZ(0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJLL = true;
                    tuxSheet.LLILLL = true;
                    tuxSheet.LLILLJJLI = new C12YQ(awS144S1200000_29, 2);
                    tuxSheet.show(c19eg.getSupportFragmentManager(), "pip_intro_sheet_first_time");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put("enter_from", str);
                    C109300bD.LIZ("show_floating_window_authorization_propup", linkedHashMap);
                    return;
                }
                C19392510tv.LIZ(c19eg, str, map, false);
                return;
            }
            ((AbstractC1604130rqV) C19392510tv.LIZIZ.getValue()).LJIIIZ("show permission popup");
            final AwS144S1200000_29 awS144S1200000_292 = new AwS144S1200000_29(c19eg, (C19EG) str, (String) map, (Map<String, String>) 12);
            View viewLIZ2 = C425020GlY.LIZ(c19eg, EnumC429120GsA.PERMISSION_REQUEST, AFwS290S0000000_7.get$arr$(26), AFwS317S0000000_29.get$arr$(23));
            C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
            c1390920mIc2.LIZ.LLJJIII = viewLIZ2;
            c1390920mIc2.LJIIIIZZ(0);
            TuxSheet tuxSheet2 = c1390920mIc2.LIZ;
            tuxSheet2.LLJLL = true;
            tuxSheet2.LLILLL = true;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.10tw
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str2;
                    String str3 = TuxSheet._pnsPageId;
                    if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C19392710tx) {
                        awS144S1200000_292.invoke();
                    }
                    if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C19392710tx) {
                        str2 = "confirm";
                    } else {
                        str2 = "cancel";
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    linkedHashMap2.put("enter_from", str);
                    linkedHashMap2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
                    C109300bD.LIZ("floating_window_system_authorization_propup_result", linkedHashMap2);
                }
            };
            C1391850mK7.LIZIZ(tuxSheet2, "533");
            tuxSheet2.show(c19eg.getSupportFragmentManager(), "pip_intro_sheet_first_time");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            linkedHashMap2.put("enter_from", str);
            C109300bD.LIZ("show_floating_window_system_authorization_propup", linkedHashMap2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current scene ");
        sbLIZ.append(str);
        sbLIZ.append(" does not match any PiP scenes!");
        throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
