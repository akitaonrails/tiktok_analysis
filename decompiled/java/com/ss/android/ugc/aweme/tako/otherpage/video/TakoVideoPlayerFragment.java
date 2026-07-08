package com.ss.android.ugc.aweme.tako.otherpage.video;

import X.AbstractC2361009My;
import X.C01GW;
import X.C07QI;
import X.C098200Yq;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C1845270y7R;
import X.C1845290y7T;
import X.C1862330yYx;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C339190DRl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1484830ok5;
import Y.ACListenerS108S0200000_4;
import Y.ACListenerS71S0300000_4;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoVideoPlayerFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLDHELIOS0jKSIpZzk6LCAjZxsyIyoaICs2JxUgKDY2OgM+KCg+LSs4";
    public Long LLIZ;
    public C1845270y7R LLIZLLLIL;
    public C1845290y7T LLJ;
    public FrameLayout LLJI;
    public LinearLayout LLJIJIL;
    public SeekBar LLJILJIL;
    public FrameLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public C1390410mHn LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2049));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1845290y7T c1845290y7T = this.LLJ;
        if (c1845290y7T != null) {
            c1845290y7T.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLJJIJI.getValue();
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        final Map<String, String> map;
        IScreenshotService iScreenshotService;
        String str;
        super.onResume();
        C1845270y7R c1845270y7R = this.LLIZLLLIL;
        if (c1845270y7R == null || (map = c1845270y7R.params) == null || (iScreenshotService = (IScreenshotService) this.LLJJIJI.getValue()) == null) {
            return;
        }
        C1845270y7R c1845270y7R2 = this.LLIZLLLIL;
        if (c1845270y7R2 == null || (str = c1845270y7R2.msgId) == null) {
            str = "";
        }
        iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.0DQB
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                String str2;
                Pair[] pairArr = new Pair[6];
                String str3 = map.get("enter_from");
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                pairArr[0] = new Pair("enter_from", str3);
                String str5 = map.get("enter_method");
                if (str5 == null) {
                    str5 = "";
                }
                pairArr[1] = new Pair("enter_method", str5);
                String str6 = map.get("process_id");
                if (str6 == null) {
                    str6 = "";
                }
                pairArr[2] = new Pair("process_id", str6);
                String str7 = map.get("tako_session_id");
                if (str7 == null) {
                    str7 = "";
                }
                pairArr[3] = new Pair("tako_session_id", str7);
                String str8 = map.get("tako_chat_id");
                if (str8 == null) {
                    str8 = "";
                }
                pairArr[4] = new Pair("tako_chat_id", str8);
                C1845270y7R c1845270y7R3 = this.LLIZLLLIL;
                if (c1845270y7R3 != null && (str2 = c1845270y7R3.msgId) != null) {
                    str4 = str2;
                }
                pairArr[5] = new Pair("message_id", str4);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        C1845290y7T c1845290y7T;
        super.onStart();
        C1845290y7T c1845290y7T2 = this.LLJ;
        if (c1845290y7T2 == null || !c1845290y7T2.LIZJ() || (c1845290y7T = this.LLJ) == null) {
            return;
        }
        c1845290y7T.LJFF();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C1845290y7T c1845290y7T;
        super.onStop();
        C1845290y7T c1845290y7T2 = this.LLJ;
        if (c1845290y7T2 == null || !c1845290y7T2.LIZLLL() || (c1845290y7T = this.LLJ) == null) {
            return;
        }
        TuxIconView tuxIconView = c1845290y7T.LLJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1845290y7T.LL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
    }

    public static String SR(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        this.LLIZ = Long.valueOf(System.currentTimeMillis());
        NR(AFwS232S0000000_4.get$arr$(89));
        Bundle arguments = getArguments();
        C1845270y7R c1845270y7R = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("video_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof C1845270y7R) {
            c1845270y7R = (C1845270y7R) serializable;
        }
        this.LLIZLLLIL = c1845270y7R;
    }

    public final void t4(boolean z) {
        if (z) {
            C1390410mHn c1390410mHn = this.LLJJIII;
            if (c1390410mHn != null) {
                C339190DRl.LIZLLL(c1390410mHn);
            }
            C1390410mHn c1390410mHn2 = this.LLJJIII;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZJ();
                return;
            }
            return;
        }
        C1390410mHn c1390410mHn3 = this.LLJJIII;
        if (c1390410mHn3 != null) {
            c1390410mHn3.LIZLLL();
        }
        C1390410mHn c1390410mHn4 = this.LLJJIII;
        if (c1390410mHn4 == null) {
            return;
        }
        C339190DRl.LIZIZ(c1390410mHn4);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        int i;
        Map<String, String> map;
        String str;
        FrameLayout frameLayout;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        this.LLJJIII = (C1390410mHn) view.findViewById(R.id.x6c);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        Context context = tuxNavBar.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxNavBar.setNavBackground(iIntValue);
        tuxNavBar.LJIIZILJ(false);
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            i = R.raw.icon_x_mark;
        } else {
            i = R.raw.icon_chevron_left_ltr;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 277));
        tuxNavBar.LIZIZ(c1251150ifB);
        this.LLJI = (FrameLayout) view.findViewById(R.id.exr);
        if (C07QI.LIZ() && (frameLayout = this.LLJI) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 50331648, 83886080, 117440512, 218103808, 335544320, 436207616, 587202560, 855638016});
            if (Build.VERSION.SDK_INT >= 29) {
                gradientDrawable.setColors(new int[]{0, 50331648, 83886080, 117440512, 218103808, 335544320, 436207616, 587202560, 855638016}, new float[]{0.0f, 0.1144f, 0.2316f, 0.3098f, 0.427f, 0.5442f, 0.681f, 0.8254f, 0.974f});
            }
            frameLayout.setBackground(gradientDrawable);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.exs);
        C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0DS6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        this.LLJIJIL = linearLayout;
        C1845290y7T c1845290y7T = (C1845290y7T) view.findViewById(R.id.o53);
        c1845290y7T.setPlayResultCallback(new AwS583S0100000_4(this, 144));
        C1845270y7R c1845270y7R = this.LLIZLLLIL;
        if (c1845270y7R != null) {
            c1845290y7T.setData(c1845270y7R);
        }
        c1845290y7T.setProgressListener(new AwS583S0100000_4(this, 145));
        this.LLJ = c1845290y7T;
        this.LLJILLL = (LinearLayout) view.findViewById(R.id.gc0);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.fb0);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.yfn);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.hkx);
        final SeekBar seekBar = (SeekBar) view.findViewById(R.id.ujh);
        C786410Ut5.wb(seekBar, new SeekBar.OnSeekBarChangeListener() { // from class: X.0DS5
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar2) {
                if (Build.VERSION.SDK_INT >= 29 && seekBar2 != null) {
                    seekBar2.setProgressDrawable(C800330VaR.LIZIZ(seekBar.getContext(), R.drawable.dfp));
                    seekBar2.setThumb(C800330VaR.LIZIZ(seekBar.getContext(), R.drawable.dfq));
                    seekBar2.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar2) {
                int progress;
                if (seekBar2 != null) {
                    progress = seekBar2.getProgress();
                } else {
                    progress = 0;
                }
                C1845290y7T c1845290y7T2 = this.LL.LLJ;
                if (c1845290y7T2 != null) {
                    float f = progress;
                    InterfaceC1484830ok5 interfaceC1484830ok5 = c1845290y7T2.LL;
                    if (interfaceC1484830ok5 != null) {
                        interfaceC1484830ok5.seek(f);
                    }
                    if (c1845290y7T2.LIZJ()) {
                        c1845290y7T2.LJFF();
                    }
                }
                LinearLayout linearLayout2 = this.LL.LLJILLL;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(4, linearLayout2);
                }
                if (Build.VERSION.SDK_INT >= 29 && seekBar2 != null) {
                    seekBar2.setProgressDrawable(C800330VaR.LIZIZ(seekBar.getContext(), R.drawable.dfo));
                    seekBar2.setThumb(C800330VaR.LIZIZ(seekBar.getContext(), R.drawable.dfr));
                    seekBar2.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar2, int i2, boolean z) {
                Long l;
                long jLongValue;
                Long l2;
                if (z) {
                    LinearLayout linearLayout2 = this.LL.LLJILLL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    TakoVideoPlayerFragment takoVideoPlayerFragment = this.LL;
                    TuxTextView tuxTextView = takoVideoPlayerFragment.LLJJ;
                    long jLongValue2 = 0;
                    if (tuxTextView != null) {
                        C1845270y7R c1845270y7R2 = takoVideoPlayerFragment.LLIZLLLIL;
                        if (c1845270y7R2 != null && (l2 = c1845270y7R2.duration) != null) {
                            jLongValue = l2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        tuxTextView.setText(TakoVideoPlayerFragment.SR((int) (jLongValue * (i2 / 100.0f))));
                    }
                    TakoVideoPlayerFragment takoVideoPlayerFragment2 = this.LL;
                    TuxTextView tuxTextView2 = takoVideoPlayerFragment2.LLJJI;
                    if (tuxTextView2 != null) {
                        C1845270y7R c1845270y7R3 = takoVideoPlayerFragment2.LLIZLLLIL;
                        if (c1845270y7R3 != null && (l = c1845270y7R3.duration) != null) {
                            jLongValue2 = l.longValue();
                        }
                        tuxTextView2.setText(TakoVideoPlayerFragment.SR((int) jLongValue2));
                        return;
                    }
                    return;
                }
                if (seekBar2 == null || seekBar2.getVisibility() != 4) {
                    return;
                }
                C786410Ut5.LLIILZL(seekBar2, 0);
                FrameLayout frameLayout2 = this.LL.LLJILJILJ;
                if (frameLayout2 == null) {
                    return;
                }
                C786410Ut5.LJZ(8, frameLayout2);
            }
        });
        this.LLJILJIL = seekBar;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.tzb);
        if (c197039127h != null) {
            c197039127h.LJJJJL(new AwS583S0100000_4(c197039127h, 146));
            C786410Ut5.U8(c197039127h, new ACListenerS108S0200000_4(this, c197039127h, 2));
        }
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.rj2);
        c197039127h2.LJJJJL(AFwS232S0000000_4.get$arr$(90));
        C786410Ut5.U8(c197039127h2, new ACListenerS71S0300000_4(c197039127h2, this, view, 2));
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1845270y7R c1845270y7R2 = this.LLIZLLLIL;
        if (c1845270y7R2 != null) {
            map = c1845270y7R2.params;
        } else {
            map = null;
        }
        if (c1845270y7R2 != null) {
            str = c1845270y7R2.msgId;
        } else {
            str = null;
        }
        C1862330yYx.LJLJJLL(20, c1862330yYx, "video_generation", null, str, map);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fog, viewGroup, false);
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
