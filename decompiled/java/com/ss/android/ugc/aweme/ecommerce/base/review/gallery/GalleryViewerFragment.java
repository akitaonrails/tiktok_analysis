package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C01GW;
import X.C034S;
import X.C04E5;
import X.C04U1;
import X.C098200Yq;
import X.C0C64;
import X.C10508049a;
import X.C1120604Zw;
import X.C13BV;
import X.C1507750pL3;
import X.C1508330pLz;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1761230vvt;
import X.C1761240vvu;
import X.C1761290vvz;
import X.C1761300vw0;
import X.C1761430vwD;
import X.C1761440vwE;
import X.C1761450vwF;
import X.C1761460vwG;
import X.C1762710vyH;
import X.C1763130vyx;
import X.C1765720w38;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2097608Jq;
import X.C452501pT;
import X.C770702zh;
import X.C786410Ut5;
import X.DialogC1761330vw3;
import X.EnumC1508940pMy;
import X.EnumC1760580vuq;
import X.InterfaceC1053404Aa;
import X.InterfaceC1164530gPT;
import X.InterfaceC1748810vbr;
import X.InterfaceC1748820vbs;
import X.InterfaceC1761370vw7;
import X.InterfaceC1761400vwA;
import Y.ARunnableS37S0101000_26;
import Y.AfS195S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS0S4302000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class GalleryViewerFragment extends BaseFragment implements InterfaceC1748820vbs, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZz02PiwpPmE0KSkgLD0qZgItJSM2OjwaICokLTcKOy40JSAiPQ==";
    public GalleryViewerViewModel LLIZ;
    public C04E5 LLJLLIL;
    public DialogC1761330vw3 LLJZ;
    public InterfaceC1761370vw7 LLJZIJLIL;
    public volatile int LLLF;
    public volatile int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 498));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 501));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 503));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 502));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 494));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 507));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 509));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 488));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 489));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 504));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 487));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 491));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 497));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 493));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 499));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 508));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 495));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 486));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 485));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 510));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 492));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 490));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 496));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 505));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 506));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 500));
    public int LLLI = -1;
    public final C1761240vvu LLLII = new InterfaceC1761400vwA() { // from class: X.0vvu
        @Override // X.InterfaceC1761400vwA
        public final void LIZ() {
        }

        @Override // X.InterfaceC1761400vwA
        public final void onPageSelected(int i) {
            String str;
            int size;
            GalleryViewerFragment galleryViewerFragment;
            GalleryViewerViewModel galleryViewerViewModel;
            String str2;
            String strValueOf;
            int iIntValue;
            int iIntValue2;
            int[] iArrLLII;
            NextLiveData<CopyOnWriteArrayList<C1761300vw0>> nextLiveData;
            CopyOnWriteArrayList<C1761300vw0> value;
            NextLiveData<Boolean> nextLiveData2;
            RecyclerView recyclerView;
            if (i < 0) {
                return;
            }
            GalleryViewerFragment galleryViewerFragment2 = this.LIZ;
            galleryViewerFragment2.LLLFF = galleryViewerFragment2.LLLF;
            this.LIZ.LLLF = i;
            boolean zLJFF = false;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_review_gallery_video_optimize_config", true, false)) {
                GalleryViewerFragment galleryViewerFragment3 = this.LIZ;
                if (galleryViewerFragment3.LLLFZ && i == galleryViewerFragment3.LLLI) {
                    DialogC1761330vw3 dialogC1761330vw3 = galleryViewerFragment3.LLJZ;
                    if (dialogC1761330vw3 != null && (recyclerView = dialogC1761330vw3.LL) != null) {
                        HandlerHook.viewPost(recyclerView, new ARunnableS37S0101000_26(galleryViewerFragment3, i, 2));
                    }
                    GalleryViewerFragment galleryViewerFragment4 = this.LIZ;
                    galleryViewerFragment4.LLLFZ = false;
                    galleryViewerFragment4.LLLI = -1;
                }
            }
            GalleryViewerViewModel galleryViewerViewModel2 = this.LIZ.LLIZ;
            if (galleryViewerViewModel2 != null && (nextLiveData2 = galleryViewerViewModel2.LLJ) != null) {
                zLJFF = Intrinsics.LJFF(nextLiveData2.getValue(), Boolean.TRUE);
            }
            if (zLJFF) {
                GalleryViewerViewModel galleryViewerViewModel3 = this.LIZ.LLIZ;
                Integer numLJIIJJI = null;
                if (galleryViewerViewModel3 != null && (nextLiveData = galleryViewerViewModel3.LLJJIII) != null && (value = nextLiveData.getValue()) != null) {
                    size = value.size() - 4;
                } else {
                    size = i;
                }
                if (size < i && (galleryViewerViewModel = (galleryViewerFragment = this.LIZ).LLIZ) != null) {
                    String str3 = (String) galleryViewerFragment.LLIZLLLIL.getValue();
                    int iUR = this.LIZ.UR();
                    String str4 = "";
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    C1760620vuu c1760620vuuLIZIZ = C1760500vui.LIZIZ(str2);
                    c1760620vuuLIZIZ.LJIIJJI = new AwS605S0100000_26(galleryViewerViewModel, 793);
                    if (galleryViewerViewModel.LLILLJJLI == null) {
                        galleryViewerViewModel.LLILLJJLI = c1760620vuuLIZIZ;
                    }
                    if (iUR == 2) {
                        if (str3 != null) {
                            str4 = str3;
                        }
                        String str5 = galleryViewerViewModel.LLJIJIL;
                        Integer num = galleryViewerViewModel.LLJI;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 1;
                        }
                        String str6 = galleryViewerViewModel.LLILZ;
                        String str7 = galleryViewerViewModel.LLJILJIL;
                        ArrayList<Integer> arrayList = galleryViewerViewModel.LLJILJILJ;
                        if (arrayList != null) {
                            iArrLLII = C13LP.LLII(arrayList);
                        } else {
                            iArrLLII = null;
                        }
                        Boolean bool = Boolean.FALSE;
                        String str8 = galleryViewerViewModel.LLJILLL;
                        if (str8 != null) {
                            numLJIIJJI = C2095008Iq.LJIIJJI(str8);
                        }
                        c1760620vuuLIZIZ.LJJIJL(new ReviewApi.ListShopReviewRequest(str4, str5, false, 10, iIntValue2, str6, str7, iArrLLII, bool, numLJIIJJI, galleryViewerViewModel.LLILZIL, Boolean.FALSE), null, null, null, 0, false, galleryViewerViewModel.LLJJIJIIJIL).LJJLJLI(new AfS195S0100000_26(galleryViewerViewModel, 8));
                    } else {
                        if (str3 != null) {
                            str4 = str3;
                        }
                        Integer num2 = galleryViewerViewModel.LLJJJJ;
                        int type = AnonymousClass0567.CREATOR_ENTRANCE.getType();
                        if (num2 != null && num2.intValue() == type) {
                            strValueOf = String.valueOf(galleryViewerViewModel.LLJJJJJIL);
                        } else {
                            strValueOf = galleryViewerViewModel.LLILZ;
                        }
                        Integer num3 = galleryViewerViewModel.LLJI;
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        c1760620vuuLIZIZ.LJJIJIL(new ReviewApi.ReviewRequest(str4, strValueOf, 10, iIntValue, false, galleryViewerViewModel.LLILZIL, null, Boolean.FALSE, null, Boolean.FALSE, galleryViewerViewModel.LLJJJJLIIL, null, null, null), null, null, null, 0, false, null).LJJLJLI(new AfS195S0100000_26(galleryViewerViewModel, 9));
                    }
                }
            }
            GalleryViewerFragment galleryViewerFragment5 = this.LIZ;
            int i2 = galleryViewerFragment5.LLLF;
            int i3 = this.LIZ.LLLFF;
            synchronized (galleryViewerFragment5) {
                GalleryViewerViewModel galleryViewerViewModel4 = galleryViewerFragment5.LLIZ;
                if (galleryViewerViewModel4 != null) {
                    if (galleryViewerFragment5.UR() == 1) {
                        str = "product_review";
                    } else {
                        str = "shop_review";
                    }
                    galleryViewerViewModel4.zQ2(galleryViewerFragment5, str, i2, i3, (String) galleryViewerFragment5.LLIZLLLIL.getValue(), true);
                }
            }
        }
    };

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final C1508330pLz SR() {
        C1763130vyx c1763130vyx;
        DialogC1761330vw3 dialogC1761330vw3 = this.LLJZ;
        if (dialogC1761330vw3 == null) {
            return null;
        }
        RecyclerView.ViewHolder viewHolder = dialogC1761330vw3.LLIZ;
        if (!(viewHolder instanceof C1763130vyx) || (c1763130vyx = (C1763130vyx) viewHolder) == null) {
            return null;
        }
        return c1763130vyx.N5();
    }

    public final int UR() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    public final int VR() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final boolean WR() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return Intrinsics.LJFF(this.LLJLILLLLZIIL.getValue(), "sea") ? "review_black_light_page" : "review_photo";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        NextLiveData<CopyOnWriteArrayList<C1761300vw0>> nextLiveData;
        CopyOnWriteArrayList<C1761300vw0> value;
        C1761300vw0 c1761300vw0;
        ReviewMedia reviewMedia;
        Video video;
        String str;
        GalleryViewerViewModel galleryViewerViewModel;
        C1761230vvt c1761230vvt;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        NextLiveData<CopyOnWriteArrayList<C1761300vw0>> nextLiveData2;
        super.onStop();
        GalleryViewerViewModel galleryViewerViewModel2 = this.LLIZ;
        CopyOnWriteArrayList<C1761300vw0> value2 = (galleryViewerViewModel2 == null || (nextLiveData2 = galleryViewerViewModel2.LLJJIII) == null) ? null : nextLiveData2.getValue();
        if (this.LLLF < (value2 != null ? value2.size() : 0)) {
            if (value2 != null && (galleryViewerViewModel = this.LLIZ) != null && (c1761230vvt = galleryViewerViewModel.LLILLL) != null) {
                int i = this.LLLF + 1;
                C1761300vw0 c1761300vw02 = value2.get(this.LLLF);
                int size = value2.size();
                Integer numValueOf = Integer.valueOf(VR());
                String str2 = (String) this.LLIZLLLIL.getValue();
                String str3 = (String) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                }
                if (((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround()) {
                    c1761230vvt.LJFF = "close";
                }
                if (c1761230vvt.LIZ) {
                    C1748720vbi.LIZIZ(this, new C10508049a(), new AwS0S4302000_26(c1761230vvt, str3, this, c1761230vvt.LIZIZ, str2, c1761230vvt.LJFF, i, c1761300vw02, size, 0));
                    c1761230vvt.LJFF = "return";
                } else {
                    c1761230vvt.LIZ(this, i, c1761300vw02, size, numValueOf, str2, str3);
                }
                c1761230vvt.LJIIJ.clear();
            }
            GalleryViewerViewModel galleryViewerViewModel3 = this.LLIZ;
            if (galleryViewerViewModel3 == null || (nextLiveData = galleryViewerViewModel3.LLJJIII) == null || (value = nextLiveData.getValue()) == null || (c1761300vw0 = value.get(this.LLLF)) == null || (reviewMedia = c1761300vw0.LIZ) == null || (video = reviewMedia.video) == null || (str = video.id) == null) {
                return;
            }
            ZR(str, String.valueOf(video.duration));
        }
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        Object context = getContext();
        if (context instanceof InterfaceC1748820vbs) {
            return (InterfaceC1748810vbr) context;
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_review_gallery_play_status", this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C1508330pLz c1508330pLzSR;
        C1765720w38 c1765720w38;
        super.onPause();
        if (!WR() || (c1508330pLzSR = SR()) == null || (c1765720w38 = c1508330pLzSR.LIZ) == null) {
            return;
        }
        c1765720w38.LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1508330pLz c1508330pLzSR;
        C1765720w38 c1765720w38;
        super.onResume();
        if (WR()) {
            C1508330pLz c1508330pLzSR2 = SR();
            if (c1508330pLzSR2 != null && (c1765720w38 = c1508330pLzSR2.LIZ) != null) {
                c1765720w38.LIZLLL();
            }
            if (C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_PAUSE || (c1508330pLzSR = SR()) == null) {
                return;
            }
            long jLIZJ = c1508330pLzSR.LIZJ();
            if (jLIZJ > 0) {
                c1508330pLzSR.LJIILL(((c1508330pLzSR.LJIIIIZZ != null ? r0.getCurrentPosition() : 0L) / jLIZJ) * 100);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        C1761230vvt c1761230vvt;
        super.onStart();
        GalleryViewerViewModel galleryViewerViewModel = this.LLIZ;
        if (galleryViewerViewModel == null || (c1761230vvt = galleryViewerViewModel.LLILLL) == null) {
            return;
        }
        c1761230vvt.LJI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC1761370vw7 c1761440vwE;
        boolean z;
        boolean z2;
        String str;
        String string;
        super.onCreate(bundle);
        InterfaceC1053404Aa interfaceC1053404Aa = (InterfaceC1053404Aa) this.LLL.getValue();
        DialogC1761330vw3 dialogC1761330vw3 = null;
        if (interfaceC1053404Aa != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString("source_btm_token");
            } else {
                string = null;
            }
            interfaceC1053404Aa.LJFF(this, string);
        }
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) ViewModelProviders.of(this).get(GalleryViewerViewModel.class);
        this.LLIZ = galleryViewerViewModel;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.LLJJL = Intrinsics.LJFF(this.LLJLILLLLZIIL.getValue(), "sea");
        }
        GalleryViewerViewModel galleryViewerViewModel2 = this.LLIZ;
        if (galleryViewerViewModel2 != null) {
            requireContext();
            GalleryViewerViewModel galleryViewerViewModel3 = this.LLIZ;
            if (galleryViewerViewModel3 != null) {
                z2 = galleryViewerViewModel3.LLJJL;
            } else {
                z2 = false;
            }
            if (UR() == 1) {
                str = "product_review";
            } else {
                str = "shop_review";
            }
            galleryViewerViewModel2.LLILLL = new C1761230vvt(z2, str, (InterfaceC1053404Aa) this.LLL.getValue());
        }
        Context context = getContext();
        if (context != null) {
            if (!((Boolean) C04U1.LIZ.getValue()).booleanValue() && !C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_review_gallery_video_optimize_config", true, false)) {
                z = false;
            } else {
                z = true;
            }
            dialogC1761330vw3 = new DialogC1761330vw3(context, z);
        }
        this.LLJZ = dialogC1761330vw3;
        if (dialogC1761330vw3 != null) {
            dialogC1761330vw3.LJJLL().LLJILJILJ = ((Boolean) this.LLJLIL.getValue()).booleanValue();
        }
        if (VR() != EnumC1760580vuq.US_REVIEW_GALLERY.getType() && VR() != EnumC1760580vuq.SHOP_TAB_REVIEW_GALLERY.getType() && VR() != EnumC1760580vuq.PDP_REVIEW_GALLERY.getType()) {
            if (WR()) {
                c1761440vwE = new C1761460vwG(this, this.LLIZ, UR());
            } else {
                c1761440vwE = new C1761450vwF(this, this.LLIZ, UR());
            }
        } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_review_gallery_video_optimize_config", true, false)) {
            c1761440vwE = new C1761430vwD(this, this.LLIZ, UR());
        } else {
            c1761440vwE = new C1761440vwE(this, this.LLIZ, UR());
        }
        this.LLJZIJLIL = c1761440vwE;
    }

    public final void ZR(String str, String str2) {
        Long l;
        Long l2;
        RecyclerView recyclerView;
        Boolean boolValueOf;
        C1761230vvt c1761230vvt;
        Map<String, Long> map;
        C1761230vvt c1761230vvt2;
        Map<String, Long> map2;
        GalleryViewerViewModel galleryViewerViewModel;
        C1761230vvt c1761230vvt3;
        C1761290vvz value;
        boolean zBooleanValue;
        NextLiveData<String> nextLiveData;
        NextLiveData<C1761290vvz> nextLiveData2;
        C1761290vvz value2;
        C1761230vvt c1761230vvt4;
        Map<String, Long> map3;
        C1761230vvt c1761230vvt5;
        Map<String, Long> map4;
        GalleryViewerViewModel galleryViewerViewModel2 = this.LLIZ;
        String value3 = null;
        if (galleryViewerViewModel2 != null && (c1761230vvt5 = galleryViewerViewModel2.LLILLL) != null && (map4 = c1761230vvt5.LJIIIIZZ) != null) {
            l = (Long) ((LinkedHashMap) map4).get(str);
        } else {
            l = null;
        }
        GalleryViewerViewModel galleryViewerViewModel3 = this.LLIZ;
        if (galleryViewerViewModel3 != null && (c1761230vvt4 = galleryViewerViewModel3.LLILLL) != null && (map3 = c1761230vvt4.LJII) != null) {
            l2 = (Long) ((LinkedHashMap) map3).get(str);
        } else {
            l2 = null;
        }
        DialogC1761330vw3 dialogC1761330vw3 = this.LLJZ;
        if (dialogC1761330vw3 != null) {
            recyclerView = dialogC1761330vw3.LL;
        } else {
            recyclerView = null;
        }
        GalleryViewerViewModel galleryViewerViewModel4 = this.LLIZ;
        if (galleryViewerViewModel4 != null && (nextLiveData2 = galleryViewerViewModel4.LLJJIJI) != null && (value2 = nextLiveData2.getValue()) != null) {
            boolValueOf = Boolean.valueOf(value2.LJIIIIZZ);
        } else {
            boolValueOf = null;
        }
        if (l2 != null && l != null && recyclerView != null && (galleryViewerViewModel = this.LLIZ) != null && (c1761230vvt3 = galleryViewerViewModel.LLILLL) != null) {
            NextLiveData<C1761290vvz> nextLiveData3 = galleryViewerViewModel.LLJJIJI;
            if (nextLiveData3 != null) {
                value = nextLiveData3.getValue();
            } else {
                value = null;
            }
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            String strValueOf = String.valueOf(l.longValue() - l2.longValue());
            GalleryViewerViewModel galleryViewerViewModel5 = this.LLIZ;
            if (galleryViewerViewModel5 != null && (nextLiveData = galleryViewerViewModel5.LLJJI) != null) {
                value3 = nextLiveData.getValue();
            }
            c1761230vvt3.LIZIZ(this, value, str, zBooleanValue, strValueOf, str2, value3, Integer.valueOf(VR()), (String) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        GalleryViewerViewModel galleryViewerViewModel6 = this.LLIZ;
        if (galleryViewerViewModel6 != null && (c1761230vvt2 = galleryViewerViewModel6.LLILLL) != null && (map2 = c1761230vvt2.LJII) != null) {
            C19719512Dh.LIZJ(map2).remove(str);
        }
        GalleryViewerViewModel galleryViewerViewModel7 = this.LLIZ;
        if (galleryViewerViewModel7 != null && (c1761230vvt = galleryViewerViewModel7.LLILLL) != null && (map = c1761230vvt.LJIIIIZZ) != null) {
            C19719512Dh.LIZJ(map).remove(str);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String string;
        GalleryViewerViewModel galleryViewerViewModel;
        C1761230vvt c1761230vvt;
        Map<String, Long> map;
        GalleryViewerViewModel galleryViewerViewModel2;
        C1761230vvt c1761230vvt2;
        Map<String, Long> map2;
        if (Intrinsics.LJFF(str, "ec_review_gallery_play_status")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("gallery_video_play_status");
                String strOptString2 = jSONObject.optString("gallery_video_model");
                if (C770702zh.LIZIZ(strOptString2)) {
                    C1762710vyH c1762710vyH = (C1762710vyH) JsonParseUtils.LIZLLL(C1762710vyH.class, strOptString2);
                    String str3 = c1762710vyH.LIZJ;
                    if (Intrinsics.LJFF(strOptString, "resume_play")) {
                        if (str3 != null && (galleryViewerViewModel2 = this.LLIZ) != null && (c1761230vvt2 = galleryViewerViewModel2.LLILLL) != null && (map2 = c1761230vvt2.LJII) != null) {
                            map2.put(str3, Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        return;
                    }
                    if (str3 != null && (galleryViewerViewModel = this.LLIZ) != null && (c1761230vvt = galleryViewerViewModel.LLILLL) != null && (map = c1761230vvt.LJIIIIZZ) != null) {
                        map.put(str3, Long.valueOf(System.currentTimeMillis()));
                    }
                    String str4 = c1762710vyH.LIZJ;
                    Double d = c1762710vyH.LJI;
                    if (d == null || (string = Double.valueOf(d.doubleValue() * 1000).toString()) == null) {
                        string = "";
                    }
                    ZR(str4, string);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x041b  */
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
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.anx, viewGroup, false);
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
}
