package com.ss.android.ugc.aweme.live.livehostimpl.livereply.music;

import X.C098200Yq;
import X.C0HZQ;
import X.C1295960jpS;
import X.C1324840ka2;
import X.C1341850l1T;
import X.C13BV;
import X.C13LE;
import X.C14JX;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1834580xqC;
import X.C1848410yCV;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20244614Jg;
import X.C20244814Ji;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C291001Au;
import X.C338490DOt;
import X.C344080DeI;
import X.C344090DeJ;
import X.C344100DeK;
import X.C344130DeN;
import X.C346340Dhw;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC344070DeH;
import X.InterfaceC1320380kSq;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS22S0500000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import mf.a;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes5.dex */
public final class HighlightChooseMusicDialogFragment extends Fragment {
    public static final C344130DeN LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyHELIOSohLTUgMGE+PTYlKmEbISIkJSY0IDEPISA8OyABPDw6KwElKCM8LwM+KCg+LSs4";
    public final C1834580xqC LL;
    public final FragmentManager LLILLJJLI;
    public final Map<String, String> LLILLL;
    public ViewGroup LLILZ;
    public C0HZQ LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final List<MusicSong> LLJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DeN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightChooseMusicDialogFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new Object() { // from class: X.0DeN
        };
    }

    public final LiveHighlightViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (LiveHighlightViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Long l = (Long) ((LinkedHashMap) MR().LLILZ).get(Long.valueOf(this.LL.LLILZ));
        if (l != null && l.longValue() > 0) {
            MR().LLILZ.put(Long.valueOf(this.LL.LLILZ), -99L);
        }
        MR().setState(new AwS583S0100000_4(new C291001Au(null), (C291001Au<C1341850l1T>) 322));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C344090DeJ c344090DeJ;
        EnumC344070DeH enumC344070DeH;
        Window window;
        int i;
        C20244814Ji c20244814JiLIZ;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            C20244614Jg c20244614JgLIZ = C14JX.LIZ(window.getDecorView());
            if (c20244614JgLIZ != null && (c20244814JiLIZ = c20244614JgLIZ.LIZ(2)) != null) {
                i = c20244814JiLIZ.LIZLLL;
            } else {
                i = 0;
            }
            View view2 = this.LLIZ;
            if (view2 != null) {
                Integer numValueOf = Integer.valueOf(view2.getPaddingBottom());
                if (numValueOf.intValue() >= i) {
                    int iIntValue = numValueOf.intValue() - i;
                    View view3 = this.LLIZ;
                    if (view3 != null) {
                        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), iIntValue);
                    }
                }
            }
        }
        this.LLILZ = (ViewGroup) view.findViewById(R.id.ovq);
        this.LLILZIL = (C0HZQ) view.findViewById(R.id.use_original);
        View viewFindViewById = view.findViewById(R.id.volume_container);
        this.LLILZLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 34), viewFindViewById);
        }
        C0HZQ c0hzq = this.LLILZIL;
        if (c0hzq != null) {
            c0hzq.setChecked(MR().getState().LLJJI.LIZ.booleanValue());
        }
        C0HZQ c0hzq2 = this.LLILZIL;
        if (c0hzq2 != null) {
            C786410Ut5.D7(c0hzq2, new C346340Dhw(this, 0));
        }
        ((ArrayList) this.LLJ).clear();
        List<MusicSong> list = this.LLJ;
        Object obj = (Collection) ((LinkedHashMap) MR().LLILZLL).get(String.valueOf(this.LL.LLILZ));
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        ((ArrayList) list).addAll(obj);
        for (MusicSong musicSong : (ArrayList) this.LLJ) {
            View viewSd = C786410Ut5.Sd(R.layout.ddq, C786410Ut5.ne(getContext()), null);
            if ((viewSd instanceof C344090DeJ) && (c344090DeJ = (C344090DeJ) viewSd) != null) {
                C1834580xqC c1834580xqC = this.LL;
                LiveHighlightViewModel liveHighlightViewModelMR = MR();
                Map<String, String> map = this.LLILLL;
                c344090DeJ.LLIZ = musicSong;
                c344090DeJ.LLIZLLLIL = Long.valueOf(c1834580xqC.LLILZ);
                C344100DeK c344100DeK = (C344100DeK) c344090DeJ.findViewById(R.id.jl0);
                c344090DeJ.LLILLJJLI = c344100DeK;
                if (c344100DeK != null) {
                    C1324840ka2.LIZJ(c344100DeK.LLILLJJLI, musicSong.coverUrl, InterfaceC1320380kSq.LJI);
                }
                c344090DeJ.LLILLL = (C1295960jpS) c344090DeJ.findViewById(R.id.nro);
                TuxTextView tuxTextView = (TuxTextView) c344090DeJ.findViewById(R.id.voz);
                c344090DeJ.LLILZ = tuxTextView;
                if (tuxTextView != null) {
                    tuxTextView.setText(musicSong.title);
                }
                TuxTextView tuxTextView2 = (TuxTextView) c344090DeJ.findViewById(R.id.vos);
                c344090DeJ.LLILZIL = tuxTextView2;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(musicSong.author);
                }
                TuxTextView tuxTextView3 = (TuxTextView) c344090DeJ.findViewById(R.id.vov);
                c344090DeJ.LLILZLL = tuxTextView3;
                if (tuxTextView3 != null) {
                    int i2 = musicSong.duration / LSPassThroughRecordSizeConfig.DEFAULT;
                    if (i2 > 3600) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The music is too long. ");
                        sbLIZ.append(c344090DeJ.LLIZ);
                        C20441214yg.LJ("HighlightChooseMusicItemView", C2188811AlT.LIZIZ(sbLIZ));
                        i2 = ((i2 % 3600) + 3600) % 3600;
                    }
                    tuxTextView3.setText(C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2)));
                }
                if (c1834580xqC.LLJLLIL == musicSong.id) {
                    enumC344070DeH = EnumC344070DeH.SELECTED;
                } else {
                    enumC344070DeH = EnumC344070DeH.DEFAULT;
                }
                c344090DeJ.LIZ(enumC344070DeH);
                AssemViewModel.selectSubscribe$default(liveHighlightViewModelMR, new C2217381BqS() { // from class: X.0DeM
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C1834780xqW) obj2).LLJILLL;
                    }
                }, null, this, null, new AwS583S0100000_4(new AwS583S0100000_4(c344090DeJ, 354), 324), 10, null);
                View.OnClickListener aCListenerS22S0500000_4 = new ACListenerS22S0500000_4(c344090DeJ, map, musicSong, liveHighlightViewModelMR, c1834580xqC, 2);
                if (C1848410yCV.LIZ) {
                    aCListenerS22S0500000_4 = new f(aCListenerS22S0500000_4);
                }
                a aVar = new a(aCListenerS22S0500000_4);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c344090DeJ);
                }
                c344090DeJ.setOnClickListener(aVar);
                ViewGroup viewGroup = this.LLILZ;
                if (viewGroup != null) {
                    viewGroup.addView(c344090DeJ);
                }
            }
        }
        C344080DeI c344080DeI = C344080DeI.LIZ;
        Map<String, String> map2 = this.LLILLL;
        c344080DeI.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map2);
        C20684815ws.LJIILLIIL("livesdk_highlight_music_setting_popup", linkedHashMap);
    }

    public HighlightChooseMusicDialogFragment(C1834580xqC c1834580xqC, FragmentManager fragmentManager, Map<String, String> map) {
        this.LL = c1834580xqC;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = map;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        this.LLIZLLLIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS548S0100000_4(c19719912DlLIZ, 163), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 164), AFwS232S0000000_4.get$arr$(44));
        this.LLJ = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddp, viewGroup, false);
        this.LLIZ = viewTd;
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
