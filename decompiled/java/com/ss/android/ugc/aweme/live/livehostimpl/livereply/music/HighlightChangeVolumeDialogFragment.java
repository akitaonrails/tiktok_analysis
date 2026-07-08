package com.ss.android.ugc.aweme.live.livehostimpl.livereply.music;

import X.C098200Yq;
import X.C0GX7;
import X.C13IQ;
import X.C13LE;
import X.C14JX;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20244614Jg;
import X.C20244814Ji;
import X.C20684815ws;
import X.C2217381BqS;
import X.C338490DOt;
import X.C344080DeI;
import X.C344140DeO;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C786820Utk;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.music.HighlightChangeVolumeDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS19S0001000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class HighlightChangeVolumeDialogFragment extends Fragment {
    public static final C344140DeO LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohHELIOSLTUgMGE+PTYlKmEbISIkJSY0IDEPIS49LyAaJiMmJSAIIC4/JyIKOy40JSAiPQ==";
    public final Map<String, String> LL;
    public final AssemVMLazy LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public C0GX7 LLILZLL;
    public TuxTextView LLIZ;
    public C0GX7 LLIZLLLIL;
    public TuxTextView LLJ;
    public int LLJI;
    public int LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DeO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightChangeVolumeDialogFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0DeO
        };
    }

    public final LiveHighlightViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (LiveHighlightViewModel) assemVMLazy.getValue();
    }

    public HighlightChangeVolumeDialogFragment(Map map) {
        this.LL = map;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 539), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 526), AFwS232S0000000_4.get$arr$(250));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        View viewFindViewById;
        C0GX7 c0gx7;
        TuxTextView tuxTextView2;
        C0GX7 c0gx72;
        int iIntValue;
        Window window;
        int i;
        C20244814Ji c20244814JiLIZ;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        TuxTextView tuxTextView3 = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            C20244614Jg c20244614JgLIZ = C14JX.LIZ(window.getDecorView());
            if (c20244614JgLIZ != null && (c20244814JiLIZ = c20244614JgLIZ.LIZ(2)) != null) {
                i = c20244814JiLIZ.LIZLLL;
            } else {
                i = 0;
            }
            View view2 = this.LLILLL;
            if (view2 != null) {
                Integer numValueOf = Integer.valueOf(view2.getPaddingBottom());
                if (numValueOf.intValue() >= i) {
                    int iIntValue2 = numValueOf.intValue() - i;
                    View view3 = this.LLILLL;
                    if (view3 != null) {
                        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), iIntValue2);
                    }
                }
            }
        }
        View view4 = this.LLILLL;
        if (view4 != null) {
            tuxTextView = (TuxTextView) view4.findViewById(R.id.g31);
        } else {
            tuxTextView = null;
        }
        this.LLILZ = tuxTextView;
        View view5 = this.LLILLL;
        if (view5 != null) {
            viewFindViewById = view5.findViewById(R.id.pu7);
        } else {
            viewFindViewById = null;
        }
        this.LLILZIL = viewFindViewById;
        View view6 = this.LLILLL;
        if (view6 != null) {
            c0gx7 = (C0GX7) view6.findViewById(R.id.ptg);
        } else {
            c0gx7 = null;
        }
        this.LLILZLL = c0gx7;
        View view7 = this.LLILLL;
        if (view7 != null) {
            tuxTextView2 = (TuxTextView) view7.findViewById(R.id.ptj);
        } else {
            tuxTextView2 = null;
        }
        this.LLIZ = tuxTextView2;
        View view8 = this.LLILLL;
        if (view8 != null) {
            view8.findViewById(R.id.pu6);
        }
        View view9 = this.LLILLL;
        if (view9 != null) {
            c0gx72 = (C0GX7) view9.findViewById(R.id.vqp);
        } else {
            c0gx72 = null;
        }
        this.LLIZLLLIL = c0gx72;
        View view10 = this.LLILLL;
        if (view10 != null) {
            tuxTextView3 = (TuxTextView) view10.findViewById(R.id.vp3);
        }
        this.LLJ = tuxTextView3;
        TuxTextView tuxTextView4 = this.LLILZ;
        if (tuxTextView4 != null) {
            C786410Ut5.h9(tuxTextView4, new ACListenerS139S0100000_4(this, 102));
        }
        if (!MR().getState().LLJJI.LIZ.booleanValue()) {
            C0GX7 c0gx73 = this.LLILZLL;
            if (c0gx73 != null) {
                c0gx73.setEnabled(false);
            }
            View view11 = this.LLILZIL;
            if (view11 != null) {
                C786410Ut5.T4(view11, 0.5f);
            }
            iIntValue = 0;
        } else {
            iIntValue = MR().getState().LLJJIII.LIZ.intValue();
        }
        C0GX7 c0gx74 = this.LLILZLL;
        if (c0gx74 != null) {
            c0gx74.setProgress(iIntValue);
        }
        this.LLJI = iIntValue;
        TuxTextView tuxTextView5 = this.LLIZ;
        if (tuxTextView5 != null) {
            tuxTextView5.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
        }
        int iIntValue3 = MR().getState().LLJJIJI.LIZ.intValue();
        C0GX7 c0gx75 = this.LLIZLLLIL;
        if (c0gx75 != null) {
            c0gx75.setProgress(iIntValue3);
        }
        this.LLJIJIL = iIntValue3;
        TuxTextView tuxTextView6 = this.LLJ;
        if (tuxTextView6 != null) {
            tuxTextView6.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue3)}, 1)));
        }
        C0GX7 c0gx76 = this.LLILZLL;
        if (c0gx76 != null) {
            final int i2 = 0;
            SeekBar.OnSeekBarChangeListener c786820Utk = new SeekBar.OnSeekBarChangeListener(this, i2) { // from class: X.0Dhz
                public final int $t;
                public Object l0;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i3, boolean z) {
                    switch (this.$t) {
                        case 0:
                            onProgressChanged$0(this, seekBar, i3, z);
                            break;
                        case 1:
                            onProgressChanged$1(this, seekBar, i3, z);
                            break;
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    switch (this.$t) {
                        case 0:
                            onStartTrackingTouch$0(this, seekBar);
                            break;
                        case 1:
                            onStartTrackingTouch$1(this, seekBar);
                            break;
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    switch (this.$t) {
                        case 0:
                            onStopTrackingTouch$0(this, seekBar);
                            break;
                        case 1:
                            onStopTrackingTouch$1(this, seekBar);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = this;
                }

                public static final void onStartTrackingTouch$0(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx77;
                    if ((seekBar instanceof C0GX7) && (c0gx77 = (C0GX7) seekBar) != null) {
                        c0gx77.LJI();
                    }
                }

                public static final void onStartTrackingTouch$1(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx77;
                    if ((seekBar instanceof C0GX7) && (c0gx77 = (C0GX7) seekBar) != null) {
                        c0gx77.LJI();
                    }
                }

                public static final void onStopTrackingTouch$0(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx77;
                    if ((seekBar instanceof C0GX7) && (c0gx77 = (C0GX7) seekBar) != null) {
                        c0gx77.LJI();
                    }
                    C344080DeI c344080DeI = C344080DeI.LIZ;
                    HighlightChangeVolumeDialogFragment highlightChangeVolumeDialogFragment = (HighlightChangeVolumeDialogFragment) c346370Dhz.l0;
                    Map<String, String> map = highlightChangeVolumeDialogFragment.LL;
                    int i3 = highlightChangeVolumeDialogFragment.LLJI;
                    c344080DeI.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    linkedHashMap.put("volume_type", "original_sound");
                    linkedHashMap.put("volume_size", String.valueOf(i3));
                    C20684815ws.LJIILLIIL("livesdk_highlight_music_volume_click", linkedHashMap);
                }

                public static final void onStopTrackingTouch$1(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx77;
                    if ((seekBar instanceof C0GX7) && (c0gx77 = (C0GX7) seekBar) != null) {
                        c0gx77.LJI();
                    }
                    C344080DeI c344080DeI = C344080DeI.LIZ;
                    HighlightChangeVolumeDialogFragment highlightChangeVolumeDialogFragment = (HighlightChangeVolumeDialogFragment) c346370Dhz.l0;
                    Map<String, String> map = highlightChangeVolumeDialogFragment.LL;
                    int i3 = highlightChangeVolumeDialogFragment.LLJIJIL;
                    c344080DeI.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    linkedHashMap.put("volume_type", "added_sound");
                    linkedHashMap.put("volume_size", String.valueOf(i3));
                    C20684815ws.LJIILLIIL("livesdk_highlight_music_volume_click", linkedHashMap);
                }

                public static final void onProgressChanged$0(C346370Dhz c346370Dhz, SeekBar seekBar, int i3, boolean z) {
                    if (z) {
                        TuxTextView tuxTextView7 = ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLIZ;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
                        }
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).MR().setState(new AwS19S0001000_4(i3, 2));
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJI = i3;
                    }
                }

                public static final void onProgressChanged$1(C346370Dhz c346370Dhz, SeekBar seekBar, int i3, boolean z) {
                    if (z) {
                        TuxTextView tuxTextView7 = ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJ;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
                        }
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).MR().setState(new AwS19S0001000_4(i3, 1));
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJIJIL = i3;
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                c786820Utk = new C786820Utk(c786820Utk);
            }
            c0gx76.setOnSeekBarChangeListener(c786820Utk);
        }
        C0GX7 c0gx77 = this.LLIZLLLIL;
        if (c0gx77 != null) {
            final int i3 = 1;
            SeekBar.OnSeekBarChangeListener c786820Utk2 = new SeekBar.OnSeekBarChangeListener(this, i3) { // from class: X.0Dhz
                public final int $t;
                public Object l0;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i32, boolean z) {
                    switch (this.$t) {
                        case 0:
                            onProgressChanged$0(this, seekBar, i32, z);
                            break;
                        case 1:
                            onProgressChanged$1(this, seekBar, i32, z);
                            break;
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    switch (this.$t) {
                        case 0:
                            onStartTrackingTouch$0(this, seekBar);
                            break;
                        case 1:
                            onStartTrackingTouch$1(this, seekBar);
                            break;
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    switch (this.$t) {
                        case 0:
                            onStopTrackingTouch$0(this, seekBar);
                            break;
                        case 1:
                            onStopTrackingTouch$1(this, seekBar);
                            break;
                    }
                }

                {
                    this.$t = i3;
                    this.l0 = this;
                }

                public static final void onStartTrackingTouch$0(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx772;
                    if ((seekBar instanceof C0GX7) && (c0gx772 = (C0GX7) seekBar) != null) {
                        c0gx772.LJI();
                    }
                }

                public static final void onStartTrackingTouch$1(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx772;
                    if ((seekBar instanceof C0GX7) && (c0gx772 = (C0GX7) seekBar) != null) {
                        c0gx772.LJI();
                    }
                }

                public static final void onStopTrackingTouch$0(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx772;
                    if ((seekBar instanceof C0GX7) && (c0gx772 = (C0GX7) seekBar) != null) {
                        c0gx772.LJI();
                    }
                    C344080DeI c344080DeI = C344080DeI.LIZ;
                    HighlightChangeVolumeDialogFragment highlightChangeVolumeDialogFragment = (HighlightChangeVolumeDialogFragment) c346370Dhz.l0;
                    Map<String, String> map = highlightChangeVolumeDialogFragment.LL;
                    int i32 = highlightChangeVolumeDialogFragment.LLJI;
                    c344080DeI.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    linkedHashMap.put("volume_type", "original_sound");
                    linkedHashMap.put("volume_size", String.valueOf(i32));
                    C20684815ws.LJIILLIIL("livesdk_highlight_music_volume_click", linkedHashMap);
                }

                public static final void onStopTrackingTouch$1(C346370Dhz c346370Dhz, SeekBar seekBar) {
                    C0GX7 c0gx772;
                    if ((seekBar instanceof C0GX7) && (c0gx772 = (C0GX7) seekBar) != null) {
                        c0gx772.LJI();
                    }
                    C344080DeI c344080DeI = C344080DeI.LIZ;
                    HighlightChangeVolumeDialogFragment highlightChangeVolumeDialogFragment = (HighlightChangeVolumeDialogFragment) c346370Dhz.l0;
                    Map<String, String> map = highlightChangeVolumeDialogFragment.LL;
                    int i32 = highlightChangeVolumeDialogFragment.LLJIJIL;
                    c344080DeI.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    linkedHashMap.put("volume_type", "added_sound");
                    linkedHashMap.put("volume_size", String.valueOf(i32));
                    C20684815ws.LJIILLIIL("livesdk_highlight_music_volume_click", linkedHashMap);
                }

                public static final void onProgressChanged$0(C346370Dhz c346370Dhz, SeekBar seekBar, int i32, boolean z) {
                    if (z) {
                        TuxTextView tuxTextView7 = ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLIZ;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i32)}, 1)));
                        }
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).MR().setState(new AwS19S0001000_4(i32, 2));
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJI = i32;
                    }
                }

                public static final void onProgressChanged$1(C346370Dhz c346370Dhz, SeekBar seekBar, int i32, boolean z) {
                    if (z) {
                        TuxTextView tuxTextView7 = ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJ;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(C786410Ut5.k4(Locale.US, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i32)}, 1)));
                        }
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).MR().setState(new AwS19S0001000_4(i32, 1));
                        ((HighlightChangeVolumeDialogFragment) c346370Dhz.l0).LLJIJIL = i32;
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                c786820Utk2 = new C786820Utk(c786820Utk2);
            }
            c0gx77.setOnSeekBarChangeListener(c786820Utk2);
        }
        C344080DeI c344080DeI = C344080DeI.LIZ;
        Map<String, String> map = this.LL;
        c344080DeI.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        C20684815ws.LJIILLIIL("livesdk_highlight_music_volume_popup", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddo, viewGroup, false);
        this.LLILLL = viewTd;
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
