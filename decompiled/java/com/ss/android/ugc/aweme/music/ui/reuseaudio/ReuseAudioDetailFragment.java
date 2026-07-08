package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C1251150ifB;
import X.C12ES;
import X.C15LN;
import X.C15MP;
import X.C15MQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20019813Uu;
import X.C2107308Nj;
import X.C2218408mc;
import X.C2218508md;
import X.C23250099c;
import X.C417030GWv;
import X.C417040GWw;
import X.C419910GdJ;
import X.C446980Hfs;
import X.C786410Ut5;
import X.C817503Hh;
import X.C960203pA;
import X.InterfaceC197023126r;
import X.InterfaceC20019613Us;
import X.InterfaceC344240DeY;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS210S0100000_6;
import Y.AObserverS233S0100000_31;
import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioDetailFragment;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioPlayer;
import com.ss.android.ugc.aweme.music.ui.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ReuseAudioDetailFragment extends AbsFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZjAlZzHELIOS02PTYpKDo3ISpiGyomOyANPCs6JwEpPS46JAM+KCg+LSs4";
    public ViewGroup LL;
    public SmartImageView LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public ViewGroup LLILZIL;
    public ReuseAudioViewModel LLILZLL;
    public MusicDetailViewModel LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.15MO
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                ReuseAudioDetailFragment reuseAudioDetailFragment = this.LIZ;
                if (reuseAudioDetailFragment.LLILZLL != null) {
                    String str = reuseAudioDetailFragment.LLJ;
                    String str2 = reuseAudioDetailFragment.LLIZLLLIL;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                    c2344009Gk.LJIIIIZZ("group_id", str2);
                    c2344009Gk.LJIIIIZZ("music_id", str);
                    C20684815ws.LJIILLIIL("click_original_sound_cancel", c2344009Gk.LIZ);
                }
                String str3 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LIZ, C343980De8.LIZ);
            }
        };
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ReuseAudioViewModel reuseAudioViewModel = this.LLILZLL;
        if (reuseAudioViewModel != null) {
            reuseAudioViewModel.LLILZ.setValue(C15MQ.PLAY);
        }
    }

    public final void MR(C15MQ c15mq) {
        boolean z;
        int i;
        if (c15mq != C15MQ.PLAY && c15mq != C15MQ.PAUSE) {
            z = false;
        } else {
            z = true;
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
        int i2 = C15MP.LIZ[c15mq.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = R.raw.icon_spinner_normal;
            } else {
                i = R.raw.icon_pause_fill;
            }
        } else {
            i = R.raw.icon_play_fill;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(requireContext());
        ImageView imageView2 = this.LLILLL;
        if (imageView2 != null) {
            imageView2.setImageDrawable(tuxIconDrawableLIZ);
        }
        if (!z) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.fc);
            animationLoadAnimation.setInterpolator(new LinearInterpolator());
            ImageView imageView3 = this.LLILLL;
            if (imageView3 != null) {
                imageView3.startAnimation(animationLoadAnimation);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [X.15MS] */
    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MusicDetailViewModel musicDetailViewModel;
        final ReuseAudioViewModel reuseAudioViewModel;
        C20019813Uu c20019813Uu;
        Aweme aweme;
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<C15MQ> mutableLiveData4;
        MutableLiveData<Aweme> mutableLiveData5;
        super.onViewCreated(view, bundle);
        this.LL = (ViewGroup) view.findViewById(R.id.f4y);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.ld7);
        this.LLILLL = (ImageView) view.findViewById(R.id.jv_);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.z_e);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.vz7);
        C19EG activity = getActivity();
        if (activity != null) {
            musicDetailViewModel = (MusicDetailViewModel) new ViewModelProvider(activity).get(MusicDetailViewModel.class);
        } else {
            musicDetailViewModel = null;
        }
        this.LLIZ = musicDetailViewModel;
        int iLIZ = C960203pA.LIZ(R.attr.a04, requireContext());
        C417040GWw c417040GWw = new C417040GWw(C12ES.LIZJ(4.0f, getContext()), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, getContext()), C446980Hfs.LIZ(requireContext(), R.color.kj));
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup != null) {
            viewGroup.setBackground(new C417030GWv(iLIZ, c417040GWw));
        }
        ViewGroup viewGroup2 = this.LLILZIL;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS165S0100000_31(this, 229));
        }
        MR(C15MQ.PLAY);
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new ACListenerS165S0100000_31(this, 230));
        }
        final ReuseAudioViewModel reuseAudioViewModel2 = (ReuseAudioViewModel) new ViewModelProvider(this).get(ReuseAudioViewModel.class);
        this.LLILZLL = reuseAudioViewModel2;
        if (reuseAudioViewModel2 != null) {
            reuseAudioViewModel2.LLIZ = new ReuseAudioPlayer(this, new C15LN() { // from class: X.15MS
                @Override // X.C15LN
                public final void LIZ() {
                }

                @Override // X.C15LN
                public final void LIZIZ() {
                }

                @Override // X.C15LN
                public final void LJJIJIIJIL() {
                }

                @Override // X.C15LN
                public final void onPlay() {
                    reuseAudioViewModel2.LLILZ.postValue(C15MQ.PAUSE);
                }
            });
        }
        ReuseAudioViewModel reuseAudioViewModel3 = this.LLILZLL;
        if (reuseAudioViewModel3 != null && (mutableLiveData5 = reuseAudioViewModel3.LL) != null) {
            mutableLiveData5.observe(this, new AObserverS210S0100000_6(this, 51));
        }
        ReuseAudioViewModel reuseAudioViewModel4 = this.LLILZLL;
        if (reuseAudioViewModel4 != null && (mutableLiveData4 = reuseAudioViewModel4.LLILZ) != null) {
            mutableLiveData4.observe(this, new AObserverS233S0100000_31(this, 17));
        }
        ReuseAudioViewModel reuseAudioViewModel5 = this.LLILZLL;
        if (reuseAudioViewModel5 != null && (mutableLiveData3 = reuseAudioViewModel5.LLILLL) != null) {
            mutableLiveData3.observe(this, new AObserverS233S0100000_31(this, 49));
        }
        ReuseAudioViewModel reuseAudioViewModel6 = this.LLILZLL;
        if (reuseAudioViewModel6 != null && (mutableLiveData2 = reuseAudioViewModel6.LLILLJJLI) != null) {
            mutableLiveData2.observe(this, new AObserverS233S0100000_31(this, 50));
        }
        ReuseAudioViewModel reuseAudioViewModel7 = this.LLILZLL;
        if (reuseAudioViewModel7 != null && (mutableLiveData = reuseAudioViewModel7.LLILZLL) != null) {
            mutableLiveData.observe(this, new AObserverS210S0100000_6(this, 52));
        }
        String str = this.LLIZLLLIL;
        if (str != null && (reuseAudioViewModel = this.LLILZLL) != null) {
            reuseAudioViewModel.LLILZ.setValue(C15MQ.LOADING);
            Map<String, C20019813Uu> map = C2218508md.LIZIZ;
            if (map.containsKey(str)) {
                c20019813Uu = (C20019813Uu) ((LinkedHashMap) map).get(str);
            } else {
                c20019813Uu = new C20019813Uu(str);
                map.put(str, c20019813Uu);
            }
            InterfaceC20019613Us interfaceC20019613Us = new InterfaceC20019613Us() { // from class: X.15MN
                @Override // X.InterfaceC20019613Us
                public final void LIZ() {
                }

                @Override // X.InterfaceC20019613Us
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC20019613Us
                public final void LJ() {
                }

                @Override // X.InterfaceC20019613Us
                public final void LIZIZ() {
                    reuseAudioViewModel.LLILZLL.postValue(Unit.LIZ);
                }

                @Override // X.InterfaceC20019613Us
                public final void LIZJ() {
                    reuseAudioViewModel.LLILZLL.postValue(Unit.LIZ);
                }

                @Override // X.InterfaceC20019613Us
                public final void LJFF(String str2) {
                    ReuseAudioPlayer reuseAudioPlayer;
                    if (reuseAudioViewModel.LLILZ.getValue() == C15MQ.LOADING) {
                        reuseAudioViewModel.LLILZ.postValue(C15MQ.PLAY);
                    }
                    reuseAudioViewModel.LLILLJJLI.postValue(str2);
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_reuse_original_sound_auto_play", true, false) && ((reuseAudioPlayer = reuseAudioViewModel.LLIZ) == null || !reuseAudioPlayer.LL.isPlaying())) {
                        C1524805y2.LIZIZ(0L, new AwS180S1100000_31(reuseAudioViewModel, str2, 1));
                    }
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C641450PDz(reuseAudioViewModel, str2, null), 2);
                }

                @Override // X.InterfaceC20019613Us
                public final void LJI(Aweme aweme2, UrlModel urlModel) {
                    reuseAudioViewModel.LL.postValue(aweme2);
                    reuseAudioViewModel.LLILZIL.postValue(urlModel);
                    if (urlModel == null) {
                        reuseAudioViewModel.LLILZLL.postValue(Unit.LIZ);
                    } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_reuse_original_sound_auto_play", true, false)) {
                        C1524805y2.LIZIZ(0L, new AwS432S0200000_31(reuseAudioViewModel, urlModel, 57));
                    }
                }
            };
            AnonymousClass0956 anonymousClass0956 = c20019813Uu.LIZIZ;
            if (anonymousClass0956 != null && anonymousClass0956.isCompleted() && c20019813Uu.LIZLLL != null && (aweme = c20019813Uu.LJ) != null) {
                interfaceC20019613Us.LJI(aweme, c20019813Uu.LJFF);
                interfaceC20019613Us.LJFF(c20019813Uu.LIZLLL);
            } else {
                c20019813Uu.LIZJ = interfaceC20019613Us;
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C2218408mc(c20019813Uu, null), 2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        Bundle arguments = getArguments();
        C19GS c19gs = null;
        if (arguments != null) {
            string = arguments.getString("aweme_id");
        } else {
            string = null;
        }
        this.LLIZLLLIL = string;
        if (arguments != null) {
            string2 = arguments.getString("music_id");
        } else {
            string2 = null;
        }
        this.LLJ = string2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dr6, viewGroup, false);
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
