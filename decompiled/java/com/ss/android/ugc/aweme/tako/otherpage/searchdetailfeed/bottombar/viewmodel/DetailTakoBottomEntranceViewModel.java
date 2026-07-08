package com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.viewmodel;

import X.C07CQ;
import X.C09U0;
import X.C1214550hi9;
import X.C13LE;
import X.C14TF;
import X.C1558520qew;
import X.C1807670x8n;
import X.C1E5F;
import X.C20268314Sj;
import X.C20268514Sl;
import X.C20268914Sp;
import X.C20269114Sr;
import X.C2097608Jq;
import X.C2189821An6;
import X.C2217381BqS;
import X.C23250099c;
import X.EnumC1864410ycJ;
import X.InterfaceC0148002o;
import X.InterfaceC1350190lEv;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC679410Qkt;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.communication.IBottomTakoEntranceVM;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public final class DetailTakoBottomEntranceViewModel extends IBottomTakoEntranceVM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public C20268514Sl LL;
    public volatile C09U0 LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailTakoBottomEntranceViewModel.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C09U0 yQ2() {
        C09U0 c09u0 = this.LLILLJJLI;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLILLJJLI;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LLILLJJLI = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1214550hi9("", null);
    }

    public static Map xQ2(C20268514Sl c20268514Sl) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c20268514Sl.LJIIIZ;
        if (str != null && str.length() > 0) {
            linkedHashMap.put("word_id", str);
        }
        String str2 = c20268514Sl.LJIIJ;
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("impr_id", str2);
        }
        String str3 = c20268514Sl.LJIIJJI;
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("recall_info", str3);
        }
        String str4 = c20268514Sl.LJIIL;
        if (str4 != null && str4.length() > 0) {
            linkedHashMap.put("search_intent", str4);
        }
        String str5 = c20268514Sl.LJIILIIL;
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("tako_intent", str5);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.communication.IBottomTakoEntranceVM
    public final void vQ2(Aweme aweme, C2189821An6 c2189821An6) {
        if (aweme == null || c2189821An6 == null) {
            return;
        }
        C23250099c.LIZLLL(getAssemVMScope(), yQ2().LIZJ, null, new C20268314Sj(this, aweme, c2189821An6, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.14So] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.14Sq] */
    @Override // com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.communication.IBottomTakoEntranceVM
    public final void wQ2(Context context, Fragment fragment) {
        C20268514Sl c20268514Sl;
        VideoShrinkAbility videoShrinkAbility;
        if (context == null || fragment == null || (c20268514Sl = this.LL) == null) {
            return;
        }
        C1E5F c1e5f = C1E5F.LIZIZ;
        Long lLJI = c1e5f.LJI(fragment);
        if (C07CQ.LIZ()) {
            C14TF.LIZIZ.LJJJLL().mobTikbotEntranceClick(c20268514Sl.LIZLLL, "inflow_bottom_bar", c20268514Sl.LJFF, null, null, null, c20268514Sl.LJII, null, null, null, null, null, null, C2097608Jq.LJIIJ(new Pair("words_source", c20268514Sl.LJIIIIZZ)), c20268514Sl.LJ, null, null, null, new SuggestionWordInfo(null, null, null, null, c20268514Sl.LJIIIZ, c20268514Sl.LJIIJ, c20268514Sl.LJIIJJI, c20268514Sl.LJIIL, c20268514Sl.LJIILIIL), new FeedEnterAwemeInfo(c20268514Sl.LJFF, c20268514Sl.LJI, null, null), null, null, null, null, null, null, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = c1e5f.LJIIIZ(fragment);
        if (interfaceC665370Q7zLJIIIZ != null) {
            videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIIZ, VideoShrinkAbility.class, null);
        } else {
            videoShrinkAbility = null;
        }
        final C20268914Sp c20268914Sp = new C20268914Sp(videoShrinkAbility);
        final ?? r0 = new InterfaceC1350190lEv(c20268914Sp) { // from class: X.14So
            public final VideoShrinkAbility LIZ;

            @Override // X.InterfaceC1350190lEv
            public final Boolean LIZIZ() {
                VideoShrinkAbility videoShrinkAbility2 = this.LIZ;
                if (videoShrinkAbility2 != null) {
                    return Boolean.valueOf(videoShrinkAbility2.dA0());
                }
                return null;
            }

            {
                this.LIZ = c20268914Sp.LIZ;
            }

            @Override // X.InterfaceC1350190lEv
            public final void LIZ(int i, int i2) {
                VideoShrinkAbility videoShrinkAbility2 = this.LIZ;
                if (videoShrinkAbility2 != null) {
                    videoShrinkAbility2.t1(i, i2);
                }
            }
        };
        InterfaceC19396010uU interfaceC19396010uU = new InterfaceC19396010uU() { // from class: X.14Sn
            @Override // X.InterfaceC19396010uU
            public final void LIZ(int i, int i2) {
                r0.LIZ(i, i2);
            }
        };
        final ?? r02 = new InterfaceC679410Qkt(c20268914Sp) { // from class: X.14Sq
            public final VideoShrinkAbility LL;

            {
                this.LL = c20268914Sp.LIZ;
            }

            @Override // X.InterfaceC679410Qkt
            public final void LLJLL(float f, float f2) {
                VideoShrinkAbility videoShrinkAbility2 = this.LL;
                if (videoShrinkAbility2 != null) {
                    videoShrinkAbility2.ob(f, f2, new C20571215eY(false, 0, 1023));
                }
            }
        };
        InterfaceC19395910uT interfaceC19395910uT = new InterfaceC19395910uT() { // from class: X.14Sm
            @Override // X.InterfaceC19395910uT
            public final void LLJLL(float f, float f2) {
                r02.LLJLL(f, f2);
            }
        };
        Aweme aweme = c20268514Sl.LJIILJJIL;
        C2189821An6 c2189821An6 = c20268514Sl.LJIILL;
        EnumC1864410ycJ enumC1864410ycJ = EnumC1864410ycJ.SEVEN_SPLIT_SCREEN;
        String str = c20268514Sl.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = c20268514Sl.LJII;
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 != null) {
            linkedHashMap.put("words_content", str2);
        }
        String str3 = c20268514Sl.LJIIIIZZ;
        if (str3.length() > 0) {
            linkedHashMap.put("words_source", str3);
        }
        linkedHashMap.putAll(xQ2(c20268514Sl));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str4 = c20268514Sl.LJIIJ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap2.put("impr_id", str4);
        String str6 = c20268514Sl.LJIIIZ;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap2.put("word_id", str6);
        String str7 = c20268514Sl.LJII;
        if (str7 != null) {
            str5 = str7;
        }
        linkedHashMap2.put("words_content", str5);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.putAll(xQ2(c20268514Sl));
        C20269114Sr.LJ(context, aweme, c2189821An6, "click_inflow_bottom_bar", lLJI, str, null, null, null, null, null, enumC1864410ycJ, interfaceC19396010uU, interfaceC19395910uT, null, linkedHashMap, linkedHashMap2, linkedHashMap3, null, null, 1624000);
    }
}
