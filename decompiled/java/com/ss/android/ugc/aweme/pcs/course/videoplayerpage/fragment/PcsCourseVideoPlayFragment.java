package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0DRA;
import X.C0JMJ;
import X.C0JMN;
import X.C0JMR;
import X.C0QSJ;
import X.C0TVI;
import X.C1161920gLG;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C14K9;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1826730xdX;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1A6V;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C489680JIg;
import X.C490580JLs;
import X.C490770JMl;
import X.C500260Jjc;
import X.C517510KRh;
import X.C517520KRi;
import X.C521580Kcu;
import X.C673150Qan;
import X.C687700QyG;
import X.C717610SCx;
import X.C717620SCy;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsCourseVideoAntiScreenshotSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerControllerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerLoadMoreAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0001000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoPlayFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final C489680JIg LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9PiwoLCAjJCHELIOSQ1LD0jKSIpZykhKSIhLCEnZhUvOgw8PTc/LBk6LCAjGSMyMQM+KCg+LSs4";
    public final AssemVMLazy LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0JMJ LLILLL;
    public final AFwS193S0000000_7 LLILZ;
    public volatile VideoPlayerControllerAbility LLILZIL;
    public volatile VideoPlayerPagerAbility LLILZLL;
    public VideoPlayerControllerAbility LLIZ;
    public VideoPlayerLoadMoreAbility LLIZLLLIL;
    public VideoPlayerPagerAbility LLJ;
    public InterfaceC665370Q7z LLJI;
    public C0QSJ LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0JIg] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCourseVideoPlayFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/viewmodel/PcsCourseVideoPlayerVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PcsCourseVideoPlayFragment.class, "videoControllerAbility", "getVideoControllerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerControllerAbility;", 0), new C2217381BqS(PcsCourseVideoPlayFragment.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0)};
        LLJILJIL = new Object() { // from class: X.0JIg
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == VideoPlayerControllerAbility.class) {
            this.LLIZ = (VideoPlayerControllerAbility) obj;
        } else if (cls == VideoPlayerLoadMoreAbility.class) {
            this.LLIZLLLIL = (VideoPlayerLoadMoreAbility) obj;
        } else if (cls == VideoPlayerPagerAbility.class) {
            this.LLJ = (VideoPlayerPagerAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoPlayerFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == VideoPlayerControllerAbility.class) {
            return this.LLIZ;
        }
        if (cls == VideoPlayerLoadMoreAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == VideoPlayerPagerAbility.class) {
            return this.LLJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == VideoPlayerControllerAbility.class) {
            this.LLIZ = null;
        } else if (cls == VideoPlayerLoadMoreAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == VideoPlayerPagerAbility.class) {
            this.LLJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PcsCourseVideoPlayFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseVideoPlayerVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 400);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(170);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 401), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 402), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 403), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        this.LLILZ = AFwS193S0000000_7.get$arr$(168);
    }

    public final C0QSJ NR() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{VideoPlayerFragmentScope.class});
        this.LLJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C0JMJ OR() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C0JMJ c0jmj = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JMJ.class, null)) != null) {
                c0jmj = (C0JMJ) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c0jmj;
        }
        return this.LLILLL;
    }

    public final VideoPlayerControllerAbility PR() {
        VideoPlayerControllerAbility videoPlayerControllerAbility = this.LLILZIL;
        if (videoPlayerControllerAbility == null) {
            synchronized (this) {
                videoPlayerControllerAbility = this.LLILZIL;
                if (videoPlayerControllerAbility == null) {
                    C0QSJ c0qsjNR = NR();
                    VideoPlayerControllerAbility videoPlayerControllerAbility2 = c0qsjNR != null ? (VideoPlayerControllerAbility) c0qsjNR.getAbility(VideoPlayerControllerAbility.class) : null;
                    this.LLILZIL = videoPlayerControllerAbility2;
                    return videoPlayerControllerAbility2;
                }
            }
        }
        return videoPlayerControllerAbility;
    }

    public final PcsCourseVideoPlayerVM RR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (PcsCourseVideoPlayerVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((LinkedHashMap) C490770JMl.LIZ).clear();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Ca0(this.LLILZ);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
        int iHashCode = hashCode();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(iHashCode, new LinkedHashMap(C490770JMl.LIZIZ())));
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        VideoPlayerControllerAbility videoPlayerControllerAbilityPR = PR();
        if (videoPlayerControllerAbilityPR != null) {
            videoPlayerControllerAbilityPR.Kc1();
        }
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        VideoPlayerControllerAbility videoPlayerControllerAbilityPR = PR();
        if (videoPlayerControllerAbilityPR != null) {
            videoPlayerControllerAbilityPR.AM0();
        }
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(-16777216);
        window.setNavigationBarColor(-16777216);
        new C1A6V(window, window.getDecorView()).LIZJ(false);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        Window window;
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            } else {
                i = 0;
            }
        } else {
            i = 1;
        }
        RR().setState(new AwS22S0001000_7(i, 1));
        boolean zLJJII = C500260Jjc.LJJII(i);
        VideoPlayerPagerAbility videoPlayerPagerAbility = this.LLILZLL;
        if (videoPlayerPagerAbility == null) {
            synchronized (this) {
                videoPlayerPagerAbility = this.LLILZLL;
                if (videoPlayerPagerAbility == null) {
                    C0QSJ c0qsjNR = NR();
                    if (c0qsjNR != null) {
                        videoPlayerPagerAbility = (VideoPlayerPagerAbility) c0qsjNR.getAbility(VideoPlayerPagerAbility.class);
                    } else {
                        videoPlayerPagerAbility = null;
                    }
                    this.LLILZLL = videoPlayerPagerAbility;
                    if (videoPlayerPagerAbility != null) {
                    }
                }
            }
            videoPlayerPagerAbility.Yf0(!zLJJII);
        } else {
            videoPlayerPagerAbility.Yf0(!zLJJII);
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            if (zLJJII) {
                window.getDecorView().setSystemUiVisibility(4102);
                C0DRA.LIZ(window, false);
            } else {
                window.getDecorView().setSystemUiVisibility(0);
                C0DRA.LIZ(window, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        long j;
        int i;
        List listLJJLJLI;
        List list;
        Long lValueOf;
        Long lValueOf2;
        String str;
        Long lValueOf3;
        String str2;
        Object obj;
        String str3;
        C490580JLs c490580JLs;
        Long l;
        Long l2;
        long[] longArray;
        Window window;
        super.onCreate(bundle);
        if (LivePcsCourseVideoAntiScreenshotSetting.INSTANCE.getValue()) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setFlags(8192, 8192);
            }
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).v72(this.LLILZ);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        this.LLILLJJLI = interfaceC665370Q7zLJFF;
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVMRR = RR();
        pcsCourseVideoPlayerVMRR.LLILLJJLI = interfaceC665370Q7zLJFF;
        AssemViewModel.selectSubscribe$default(pcsCourseVideoPlayerVMRR, pcsCourseVideoPlayerVMRR, new C2217381BqS() { // from class: X.0JMK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C0JMP) obj2).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0JML
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0JMP) obj2).LLILLL;
            }
        }, null, null, null, new AwS621S0100000_7(pcsCourseVideoPlayerVMRR, 57), 56, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        String str4 = "";
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        long j2 = -1;
        if (arguments2 != null) {
            j = arguments2.getLong("anchor_id");
        } else {
            j = -1;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            j2 = arguments3.getLong("course_id");
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i = arguments4.getInt("selected_position");
        } else {
            i = 0;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (longArray = arguments5.getLongArray("video_id_list")) == null || (listLJJLJLI = C13LQ.LJJLJLI(longArray)) == null) {
            listLJJLJLI = C13BV.INSTANCE;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C490580JLs.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c490580JLs = (C490580JLs) interfaceC1555100qZQLIZIZ.getSource()) == null || (l = c490580JLs.LL) == null || l.longValue() != j || (l2 = c490580JLs.LLILLJJLI) == null || l2.longValue() != j2 || (list = c490580JLs.LLILLL) == null) {
            list = C13BV.INSTANCE;
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0JMJ(i, j, UserService.getInstance().user().getCurrentUserId(), j2, string), C0JMJ.class, "source_default_key");
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVMRR2 = RR();
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            Pair pair = new Pair(Long.valueOf(((SMBCourseVideo) indexedValue.LIZIZ).videoId), Integer.valueOf(indexedValue.LIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLJLI, 10));
        Iterator it3 = listLJJLJLI.iterator();
        while (it3.hasNext()) {
            long jLongValue = ((Number) it3.next()).longValue();
            C0JMN c0jmn = C0JMN.NOT_AVAILABLE;
            Integer num = (Integer) linkedHashMap.get(Long.valueOf(jLongValue));
            if (num != null) {
                obj = ListProtector.get(list, num.intValue());
                if (obj != null && (str3 = ((SMBCourseVideo) obj).awemeStructStr) != null && str3.length() > 0) {
                    c0jmn = C0JMN.AVAILABLE;
                }
            } else {
                obj = null;
            }
            arrayList.add(new C0JMR(jLongValue, (SMBCourseVideo) obj, c0jmn));
        }
        pcsCourseVideoPlayerVMRR2.setState(new AwS373S0200000_7(arrayList, (List<C0JMR>) listLJJLJLI, (List<Long>) 27));
        Pair[] pairArr = new Pair[4];
        C0JMJ c0jmjOR = OR();
        if (c0jmjOR != null) {
            lValueOf = Long.valueOf(c0jmjOR.LLILLJJLI);
        } else {
            lValueOf = null;
        }
        pairArr[0] = new Pair("anchor_id", lValueOf);
        C0JMJ c0jmjOR2 = OR();
        if (c0jmjOR2 != null) {
            lValueOf2 = Long.valueOf(c0jmjOR2.LLILLL);
        } else {
            lValueOf2 = null;
        }
        pairArr[1] = new Pair("user_id", lValueOf2);
        C0JMJ c0jmjOR3 = OR();
        if (c0jmjOR3 != null) {
            str = c0jmjOR3.LL;
        } else {
            str = null;
        }
        pairArr[2] = new Pair("enter_from", str);
        C0JMJ c0jmjOR4 = OR();
        if (c0jmjOR4 != null) {
            lValueOf3 = Long.valueOf(c0jmjOR4.LLILZ);
        } else {
            lValueOf3 = null;
        }
        pairArr[3] = new Pair("course_id", lValueOf3);
        C490770JMl.LIZ.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVMRR3 = RR();
        int iHashCode = hashCode();
        pcsCourseVideoPlayerVMRR3.LLILLL = iHashCode;
        C0JMJ c0jmjVQ2 = pcsCourseVideoPlayerVMRR3.vQ2();
        if (c0jmjVQ2 != null && (str2 = c0jmjVQ2.LL) != null) {
            str4 = str2;
        }
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIIIZZ("PcsCourseVideoPlayer", new C517510KRh(iHashCode, 1015, str4, new LinkedHashMap(C490770JMl.LIZIZ())));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DMB
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 691), 3);
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), new C521580Kcu(this, 1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd8, viewGroup, false);
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
