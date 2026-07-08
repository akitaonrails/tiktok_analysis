package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.C01GW;
import X.C098200Yq;
import X.C0JBN;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1474420oTI;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C16F5;
import X.C1819620xS4;
import X.C1885650zAZ;
import X.C1885660zAa;
import X.C1885670zAb;
import X.C189200o6;
import X.C19749112Or;
import X.C19749212Os;
import X.C19749312Ot;
import X.C19EG;
import X.C19GS;
import X.C1AMD;
import X.C1AME;
import X.C20441214yg;
import X.C2178681AOk;
import X.C2187701Ajg;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1474390oTF;
import X.InterfaceC1881340z3c;
import X.InterfaceC469360Ias;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.VideoDetailFragment;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.videoshop.context.VideoContext;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoDetailFragment extends Fragment implements InterfaceC469360Ias {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITHELIOSViJCYrJCQ1JjonZic5OiY9LTY/ZywyOiFiLi4+LSwiPT08ZhMlLSo8DCA4KCY/DjctLiI2JjE=";
    public String LL;
    public ViewPager LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public InterfaceC1881340z3c LLILZIL;
    public GameStationGameInfo.Video LLIZ;
    public C1AME LLJI;
    public C1324720kZq LLJIJIL;
    public LiveIconView LLJILJIL;
    public View LLJILJILJ;
    public C16F5 LLJILLL;
    public C19749112Or LLJJ;
    public LiveIconView LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public final float LLILZLL = C418440Gaw.LIZIZ(13);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1885660zAa(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1885650zAZ(this));
    public final C1885670zAb LLJJIJIIJIL = new C2178681AOk() { // from class: X.0zAb
        @Override // X.C2178681AOk, X.InterfaceC1474240oT0
        public final void LJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
            String str;
            C1324720kZq c1324720kZq = this.LL.LLJIJIL;
            if (c1324720kZq != null) {
                C500260Jjc.LJIILIIL(c1324720kZq);
            }
            C20441214yg.LIZIZ("VideoDetailFragment", "onVideoCompleted  seekTo 0");
            C1AME c1ame = this.LL.LLJI;
            if (c1ame != null) {
                c1ame.LJIIIZ(0L);
            }
            C1AME c1ame2 = this.LL.LLJI;
            if (c1ame2 != null) {
                c1ame2.LJI();
            }
            VideoDetailFragment videoDetailFragment = this.LL;
            InterfaceC1881340z3c interfaceC1881340z3c = videoDetailFragment.LLILZIL;
            GameStationGameInfo.Video video = videoDetailFragment.LLIZ;
            String string = null;
            if (video != null) {
                str = video.vid;
                string = Double.valueOf(video.duration).toString();
            } else {
                str = null;
            }
            String str2 = this.LL.LL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_gamedetail_video_finish");
            c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3c))));
            c474500IjALIZ.LJJII(str, "game_video_id");
            c474500IjALIZ.LJJII(string, "game_video_duration");
            c474500IjALIZ.LJJII(str2, "tab_name");
            c474500IjALIZ.LIZ();
        }

        @Override // X.C2178681AOk, X.InterfaceC1474240oT0
        public final void LJJIIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
            this.LL.PR(false);
        }

        @Override // X.C2178681AOk, X.InterfaceC1474240oT0
        public final void LJJJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
            String str;
            this.LL.PR(true);
            VideoDetailFragment videoDetailFragment = this.LL;
            InterfaceC1881340z3c interfaceC1881340z3c = videoDetailFragment.LLILZIL;
            GameStationGameInfo.Video video = videoDetailFragment.LLIZ;
            String string = null;
            if (video != null) {
                str = video.vid;
                string = Double.valueOf(video.duration).toString();
            } else {
                str = null;
            }
            String str2 = this.LL.LL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_gamedetail_video_play");
            c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3c))));
            c474500IjALIZ.LJJII(str, "game_video_id");
            c474500IjALIZ.LJJII(string, "game_video_duration");
            c474500IjALIZ.LJJII(str2, "tab_name");
            c474500IjALIZ.LIZ();
        }

        @Override // X.C2178681AOk, X.InterfaceC1474240oT0
        public final void LJIILIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
            VideoDetailFragment videoDetailFragment = this.LL;
            C16F5 c16f5 = videoDetailFragment.LLJILLL;
            if (c16f5 != null) {
                c16f5.setText(videoDetailFragment.MR(i / LSPassThroughRecordSizeConfig.DEFAULT));
            }
            int i3 = (int) ((i / i2) * 100);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current =");
            sbLIZ.append(i);
            sbLIZ.append(", duration =");
            sbLIZ.append(i2);
            sbLIZ.append(",process = ");
            sbLIZ.append(i3);
            C20441214yg.LIZIZ("VideoDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
            C19749112Or c19749112Or = this.LL.LLJJ;
            if (c19749112Or != null) {
                c19749112Or.setProgress(i3);
            }
        }
    };

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final int NR() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20441214yg.LIZIZ("VideoDetailFragment", "on destroy");
        super.onDestroy();
        C1AME c1ame = this.LLJI;
        if (c1ame != null) {
            c1ame.LJFF();
        }
        C1AME c1ame2 = this.LLJI;
        if (c1ame2 != null) {
            c1ame2.LJIIIIZZ();
        }
        C1AME c1ame3 = this.LLJI;
        if (c1ame3 != null) {
            C1885670zAb c1885670zAb = this.LLJJIJIIJIL;
            VideoContext videoContext = c1ame3.LLILZIL;
            if (videoContext != null && c1885670zAb != null) {
                ((CopyOnWriteArrayList) videoContext.LLJI).remove(c1885670zAb);
            }
        }
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1AME c1ame = this.LLJI;
        if (c1ame != null) {
            c1ame.LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1AME c1ame;
        super.onResume();
        if (this.LLJJIJI || (c1ame = this.LLJI) == null) {
            return;
        }
        c1ame.LJI();
    }

    public final String MR(int i) {
        return C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 2));
    }

    public final void PR(boolean z) {
        TuxIconDrawable tuxIconDrawableLIZ;
        int i;
        if (z) {
            C1324720kZq c1324720kZq = this.LLJIJIL;
            if (c1324720kZq != null) {
                C500260Jjc.LJIILIIL(c1324720kZq);
            }
            LiveIconView liveIconView = this.LLJILJIL;
            if (liveIconView != null) {
                C500260Jjc.LJIILIIL(liveIconView);
            }
        } else {
            LiveIconView liveIconView2 = this.LLJILJIL;
            if (liveIconView2 != null) {
                C500260Jjc.LLFFF(liveIconView2);
            }
        }
        LiveIconView liveIconView3 = this.LLJJI;
        if (liveIconView3 != null) {
            liveIconView3.setIconTint(NR());
        }
        LiveIconView liveIconView4 = this.LLJJI;
        if (liveIconView4 != null) {
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (!z) {
                    i = R.raw.icon_play_fill;
                } else {
                    i = R.raw.icon_pause_fill;
                }
                c419910GdJ.LIZ = i;
                c419910GdJ.LIZLLL = Integer.valueOf(NR());
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            } else {
                tuxIconDrawableLIZ = null;
            }
            liveIconView4.setIcon(tuxIconDrawableLIZ);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C1AME c1ame;
        C1AME c1ame2;
        if (this.LLJJIII == i) {
            if (!this.LLJJIJI && (c1ame2 = this.LLJI) != null) {
                c1ame2.LJI();
                return;
            }
            return;
        }
        C1AME c1ame3 = this.LLJI;
        if (c1ame3 == null || !c1ame3.LIZLLL() || (c1ame = this.LLJI) == null) {
            return;
        }
        c1ame.LJFF();
    }

    public final void OR(LiveIconView liveIconView, boolean z) {
        TuxIconDrawable tuxIconDrawableLIZ;
        int i;
        if (liveIconView != null) {
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (z) {
                    i = R.raw.icon_speaker_2_slash_ltr;
                } else {
                    i = R.raw.icon_speaker_2_ltr;
                }
                c419910GdJ.LIZ = i;
                C1AME c1ame = this.LLJI;
                if (c1ame != null) {
                    c1ame.setMute(z);
                }
                c419910GdJ.LIZLLL = Integer.valueOf(NR());
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            } else {
                tuxIconDrawableLIZ = null;
            }
            liveIconView.setIcon(tuxIconDrawableLIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        final int i;
        int i2;
        String str2;
        TuxIconDrawable tuxIconDrawableLIZ;
        boolean z;
        float f;
        int i3;
        boolean z2;
        boolean z3;
        ImageModel imageModel;
        List urls;
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        ViewPager viewPager = this.LLILLJJLI;
        if (viewPager != null && (viewTreeObserver = viewPager.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0zAV
                /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onGlobalLayout() {
                    /*
                        r9 = this;
                        com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.VideoDetailFragment r2 = r9.LL
                        androidx.viewpager.widget.ViewPager r1 = r2.LLILLJJLI
                        if (r1 == 0) goto L20
                        int r0 = r1.getWidth()
                        r2.LLILLL = r0
                        int r0 = r1.getHeight()
                        r2.LLILZ = r0
                        android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                        if (r1 == 0) goto L20
                        r1.removeOnGlobalLayoutListener(r9)
                        java.lang.Class<android.view.ViewTreeObserver$OnGlobalLayoutListener> r0 = android.view.ViewTreeObserver.OnGlobalLayoutListener.class
                        X.C2187701Ajg.LIZIZ(r1, r9, r0)
                    L20:
                        com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.VideoDetailFragment r6 = r9.LL
                        com.bytedance.android.livesdk.game.model.GameStationGameInfo$Video r0 = r6.LLIZ
                        r1 = 1
                        if (r0 == 0) goto Lba
                        com.bytedance.android.live.base.model.ImageModel r0 = r0.cover
                        if (r0 == 0) goto Lba
                        int r2 = r0.getImageType()
                    L2f:
                        r5 = 3
                        android.view.View[] r4 = new android.view.View[r5]
                        X.1AME r0 = r6.LLJI
                        r3 = 0
                        r4[r3] = r0
                        X.0kZq r0 = r6.LLJIJIL
                        r4[r1] = r0
                        r1 = 2
                        android.view.View r0 = r6.LLJILJILJ
                        r4[r1] = r0
                        X.0z3c r0 = r6.LLILZIL
                        r7 = 0
                        if (r0 == 0) goto L6f
                        X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
                        if (r1 == 0) goto L6f
                        X.0z3c r0 = r1.LIZ
                        java.lang.String r1 = r1.LIZIZ
                        if (r0 == 0) goto Lb8
                        X.0z5U r0 = r0.LJJIIZI()
                        java.lang.Object r1 = r0.LIZ(r1)
                        boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
                        if (r0 != 0) goto L5e
                        r1 = r7
                    L5e:
                        java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                        if (r1 == 0) goto Lb8
                        java.lang.String r0 = "scene"
                        java.lang.Object r1 = r1.get(r0)
                    L68:
                        boolean r0 = r1 instanceof java.lang.Integer
                        if (r0 == 0) goto L6d
                        r7 = r1
                    L6d:
                        java.lang.Integer r7 = (java.lang.Integer) r7
                    L6f:
                        boolean r0 = X.C1884080z82.LIZ(r7)
                        if (r0 == 0) goto La8
                        int r8 = r6.LLILZ
                        int r7 = X.C1884730z95.LIZIZ(r2, r8)
                        int r0 = r6.LLILLL
                        if (r7 <= r0) goto L84
                        int r8 = X.C1884730z95.LIZ(r2, r0)
                        r7 = r0
                    L84:
                        X.0zAX r6 = X.C1885630zAX.LL
                        r2 = 0
                    L87:
                        r1 = r4[r2]
                        if (r1 == 0) goto L92
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                        r6.invoke(r1, r0)
                    L92:
                        int r2 = r2 + 1
                        if (r2 < r5) goto L87
                        X.0zAY r2 = X.C1885640zAY.LL
                    L98:
                        r1 = r4[r3]
                        if (r1 == 0) goto La3
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                        r2.invoke(r1, r0)
                    La3:
                        int r3 = r3 + 1
                        if (r3 < r5) goto L98
                        return
                    La8:
                        int r7 = r6.LLILLL
                        int r8 = X.C1884730z95.LIZ(r2, r7)
                        int r0 = r6.LLILZ
                        if (r8 <= r0) goto L84
                        int r7 = X.C1884730z95.LIZIZ(r2, r0)
                        r8 = r0
                        goto L84
                    Lb8:
                        r1 = r7
                        goto L68
                    Lba:
                        r2 = 1
                        goto L2f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1885610zAV.onGlobalLayout():void");
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        GameStationGameInfo.Video video = this.LLIZ;
        this.LLJJI = (LiveIconView) view.findViewById(R.id.video_play_icon);
        this.LLJIJIL = (C1324720kZq) view.findViewById(R.id.iro);
        this.LLJILJIL = (LiveIconView) view.findViewById(R.id.iq7);
        this.LLJILJILJ = view.findViewById(R.id.iq8);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        if (video != null && (imageModel = video.cover) != null && (urls = imageModel.getUrls()) != null) {
            str = (String) C13LP.LJJJLL(urls);
        } else {
            str = null;
        }
        C1324610kZf url = c0jbnLIZ.setUrl(str);
        url.LJIL = true;
        url.LJJI(this.LLJIJIL);
        PR(false);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.xpj);
        this.LLJILLL = c16f5;
        if (c16f5 != null) {
            c16f5.setText("00:00");
        }
        this.LLJJ = (C19749112Or) view.findViewById(R.id.isd);
        TextView textView = (TextView) view.findViewById(R.id.xl5);
        final LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.ban);
        if (video != null) {
            i = (int) video.duration;
            i2 = (int) video.duration;
        } else {
            i = 0;
            i2 = 0;
        }
        textView.setText(MR(i2));
        C1AME c1ame = (C1AME) view.findViewById(R.id.irp);
        this.LLJI = c1ame;
        if (c1ame != null) {
            C1885670zAb c1885670zAb = this.LLJJIJIIJIL;
            VideoContext videoContext = c1ame.LLILZIL;
            if (videoContext != null && c1885670zAb != null && !((CopyOnWriteArrayList) videoContext.LLJI).contains(c1885670zAb)) {
                ((CopyOnWriteArrayList) videoContext.LLJI).add(c1885670zAb);
            }
        }
        C1474420oTI c1474420oTI = new C1474420oTI();
        GameStationGameInfo.Video video2 = this.LLIZ;
        if (video2 != null) {
            str2 = video2.url;
        } else {
            str2 = null;
        }
        c1474420oTI.LJ = str2;
        C1AME c1ame2 = this.LLJI;
        if (c1ame2 != null) {
            c1ame2.setPlayEntity(c1474420oTI);
        }
        C1AME c1ame3 = this.LLJI;
        if (c1ame3 != null) {
            c1ame3.setPlayUrlConstructor(new InterfaceC1474390oTF() { // from class: X.0zAq
                @Override // X.InterfaceC1474390oTF
                public final void LIZ() {
                }
            });
        }
        C1AME c1ame4 = this.LLJI;
        if (c1ame4 != null) {
            c1ame4.LJI();
        }
        C1AME c1ame5 = this.LLJI;
        if (c1ame5 != null) {
            c1ame5.setAttachListener(new C1AMD() { // from class: X.0zAk
                @Override // X.C1AMD
                public final void LIZIZ(C1AME c1ame6) {
                }

                @Override // X.C1AMD
                public final void LIZJ(C1AME c1ame6) {
                }

                @Override // X.C1AMD
                public final void LIZ(C1AME c1ame6, boolean z4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("video onScrollVisibilityChange visible=");
                    sbLIZ.append(z4);
                    C20441214yg.LIZIZ("VideoDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
        final C19749112Or c19749112Or = this.LLJJ;
        if (c19749112Or != null) {
            Integer numValueOf = Integer.valueOf(NR());
            Integer numValueOf2 = Integer.valueOf(((Number) this.LLJ.getValue()).intValue());
            final Float fValueOf = Float.valueOf(C418440Gaw.LIZIZ(3));
            final Float fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(2));
            C19749212Os c19749212Os = c19749112Or.LLILLL;
            final float f2 = c19749212Os.LIZLLL;
            final float f3 = c19749212Os.LJ;
            final float f4 = c19749212Os.LJFF;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                C19749212Os c19749212Os2 = c19749112Or.LLILLL;
                if (c19749212Os2.LIZIZ != iIntValue) {
                    z = true;
                } else {
                    z = false;
                }
                c19749212Os2.LIZIZ = iIntValue;
            } else {
                z = false;
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                C19749212Os c19749212Os3 = c19749112Or.LLILLL;
                if (c19749212Os3.LIZJ != iIntValue2) {
                    z = true;
                }
                c19749212Os3.LIZJ = iIntValue2;
            }
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                C19749212Os c19749212Os4 = c19749112Or.LLILLL;
                if (c19749212Os4.LIZLLL != fFloatValue) {
                    z = true;
                }
                c19749212Os4.LIZLLL = fFloatValue;
            }
            if (fValueOf2 != null) {
                float fFloatValue2 = fValueOf2.floatValue();
                C19749212Os c19749212Os5 = c19749112Or.LLILLL;
                if (c19749212Os5.LJ != fFloatValue2) {
                    z = true;
                }
                c19749212Os5.LJ = fFloatValue2;
            }
            C19749212Os c19749212Os6 = c19749112Or.LLILLL;
            if (c19749212Os6.LJFF != 0.0f) {
                z = true;
            }
            c19749212Os6.LJFF = 0.0f;
            if (z) {
                c19749112Or.requestLayout();
                c19749112Or.LLJILJIL.removeAllUpdateListeners();
                c19749112Or.LLJILJIL.setInterpolator(C1619980sG4.LJIILIIL());
                c19749112Or.LLJILJIL.setDuration(100L);
                final float f5 = 0.0f;
                f = 0.0f;
                i3 = 2;
                c19749112Or.LLJILJIL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zAj
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue3;
                        C19749112Or c19749112Or2 = c19749112Or;
                        C19749212Os c19749212Os7 = c19749112Or2.LLILLL;
                        float f6 = f3;
                        Float f7 = fValueOf2;
                        float fFloatValue4 = 0.0f;
                        if (f7 != null) {
                            fFloatValue3 = f7.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        c19749212Os7.LJ = c19749112Or2.LJI(valueAnimator, f6, fFloatValue3);
                        C19749112Or c19749112Or3 = c19749112Or;
                        C19749212Os c19749212Os8 = c19749112Or3.LLILLL;
                        float f8 = f2;
                        Float f9 = fValueOf;
                        if (f9 != null) {
                            fFloatValue4 = f9.floatValue();
                        }
                        c19749212Os8.LIZLLL = c19749112Or3.LJI(valueAnimator, f8, fFloatValue4);
                        C19749112Or c19749112Or4 = c19749112Or;
                        c19749112Or4.LLILLL.LJFF = c19749112Or4.LJI(valueAnimator, f4, f5);
                        C19749112Or c19749112Or5 = c19749112Or;
                        c19749112Or5.LLJIJIL = true;
                        c19749112Or5.invalidate();
                    }
                });
                c19749112Or.LLJILJIL.start();
            } else {
                f = 0.0f;
                i3 = 2;
            }
            final Float fValueOf3 = Float.valueOf(this.LLILZLL);
            final Float fValueOf4 = Float.valueOf(this.LLILZLL);
            final Float fValueOf5 = Float.valueOf(this.LLILZLL / i3);
            Integer numValueOf3 = Integer.valueOf(NR());
            C19749312Ot c19749312Ot = c19749112Or.LLILLJJLI;
            final float f6 = c19749312Ot.LJIIJJI;
            final float f7 = c19749312Ot.LJFF;
            final float f8 = c19749312Ot.LJ;
            final float f9 = c19749312Ot.LJI;
            if (fValueOf3 != null) {
                float fFloatValue3 = fValueOf3.floatValue();
                C19749312Ot c19749312Ot2 = c19749112Or.LLILLJJLI;
                if (c19749312Ot2.LJ == fFloatValue3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = !z3;
                c19749312Ot2.LJ = fFloatValue3;
            } else {
                z2 = false;
            }
            if (fValueOf4 != null) {
                float fFloatValue4 = fValueOf4.floatValue();
                C19749312Ot c19749312Ot3 = c19749112Or.LLILLJJLI;
                if (c19749312Ot3.LJFF != fFloatValue4) {
                    z2 = true;
                }
                c19749312Ot3.LJFF = fFloatValue4;
            }
            if (fValueOf5 != null) {
                float fFloatValue5 = fValueOf5.floatValue();
                C19749312Ot c19749312Ot4 = c19749112Or.LLILLJJLI;
                if (c19749312Ot4.LJI != fFloatValue5) {
                    z2 = true;
                }
                c19749312Ot4.LJI = fFloatValue5;
            }
            if (numValueOf3 != null) {
                int iIntValue3 = numValueOf3.intValue();
                C19749312Ot c19749312Ot5 = c19749112Or.LLILLJJLI;
                if (c19749312Ot5.LIZIZ != iIntValue3) {
                    z2 = true;
                }
                c19749312Ot5.LIZIZ = iIntValue3;
            }
            C19749312Ot c19749312Ot6 = c19749112Or.LLILLJJLI;
            if (c19749312Ot6.LJIIJJI != f) {
                z2 = true;
            }
            c19749312Ot6.LJIIJJI = f;
            if (z2) {
                c19749112Or.LLJILJILJ.removeAllUpdateListeners();
                c19749112Or.LLJILJILJ.setInterpolator(C1619980sG4.LJIILIIL());
                c19749112Or.LLJILJILJ.setDuration(100L);
                final float f10 = 0.0f;
                c19749112Or.LLJILJILJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zAi
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue6;
                        float fFloatValue7;
                        C19749112Or c19749112Or2 = c19749112Or;
                        c19749112Or2.LLILLJJLI.LJIIJJI = c19749112Or2.LJI(valueAnimator, f6, f10);
                        C19749112Or c19749112Or3 = c19749112Or;
                        C19749312Ot c19749312Ot7 = c19749112Or3.LLILLJJLI;
                        float f11 = f7;
                        Float f12 = fValueOf4;
                        float fFloatValue8 = 0.0f;
                        if (f12 != null) {
                            fFloatValue6 = f12.floatValue();
                        } else {
                            fFloatValue6 = 0.0f;
                        }
                        c19749312Ot7.LJFF = c19749112Or3.LJI(valueAnimator, f11, fFloatValue6);
                        C19749112Or c19749112Or4 = c19749112Or;
                        C19749312Ot c19749312Ot8 = c19749112Or4.LLILLJJLI;
                        float f13 = f8;
                        Float f14 = fValueOf3;
                        if (f14 != null) {
                            fFloatValue7 = f14.floatValue();
                        } else {
                            fFloatValue7 = 0.0f;
                        }
                        c19749312Ot8.LJ = c19749112Or4.LJI(valueAnimator, f13, fFloatValue7);
                        C19749112Or c19749112Or5 = c19749112Or;
                        C19749312Ot c19749312Ot9 = c19749112Or5.LLILLJJLI;
                        float f15 = f9;
                        Float f16 = fValueOf5;
                        if (f16 != null) {
                            fFloatValue8 = f16.floatValue();
                        }
                        c19749312Ot9.LJI = c19749112Or5.LJI(valueAnimator, f15, fFloatValue8);
                        C19749112Or c19749112Or6 = c19749112Or;
                        c19749112Or6.LLJIJIL = true;
                        c19749112Or6.invalidate();
                    }
                });
                c19749112Or.LLJILJILJ.start();
            }
        }
        C19749112Or c19749112Or2 = this.LLJJ;
        if (c19749112Or2 != null) {
            c19749112Or2.setCustomOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.0zAl
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    int progress;
                    if (seekBar != null) {
                        progress = seekBar.getProgress();
                    } else {
                        progress = 0;
                    }
                    float f11 = progress;
                    C1AME c1ame6 = this.LLJI;
                    if (c1ame6 != null) {
                        c1ame6.LJIIIZ((long) ((f11 / 100) * i * LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
                    float f11 = (i4 / 100) * i;
                    VideoDetailFragment videoDetailFragment = this;
                    C16F5 c16f52 = videoDetailFragment.LLJILLL;
                    if (c16f52 != null) {
                        c16f52.setText(videoDetailFragment.MR((int) f11));
                    }
                }
            });
        }
        LiveIconView liveIconView2 = this.LLJJI;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new View.OnClickListener() { // from class: X.0zAm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (this.LL.LLJI != null && (!r0.LIZLLL())) {
                        VideoDetailFragment videoDetailFragment = this.LL;
                        videoDetailFragment.LLJJIJI = false;
                        C1AME c1ame6 = videoDetailFragment.LLJI;
                        if (c1ame6 != null) {
                            c1ame6.LJI();
                            return;
                        }
                        return;
                    }
                    VideoDetailFragment videoDetailFragment2 = this.LL;
                    videoDetailFragment2.LLJJIJI = true;
                    C1AME c1ame7 = videoDetailFragment2.LLJI;
                    if (c1ame7 == null) {
                        return;
                    }
                    c1ame7.LJFF();
                }
            });
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zAo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LiveIconView liveIconView3 = this.LL.LLJJI;
                    if (liveIconView3 != null) {
                        liveIconView3.callOnClick();
                    }
                }
            }, view2);
        }
        LiveIconView liveIconView3 = this.LLJILJIL;
        if (liveIconView3 != null) {
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_play_fill;
                c419910GdJ.LIZLLL = Integer.valueOf(NR());
                tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            } else {
                tuxIconDrawableLIZ = null;
            }
            liveIconView3.setIcon(tuxIconDrawableLIZ);
        }
        if (liveIconView != null) {
            liveIconView.setIconTint(NR());
        }
        OR(liveIconView, false);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0zAn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    VideoDetailFragment videoDetailFragment = this.LL;
                    boolean z4 = false;
                    if (videoDetailFragment.LLJI != null && (!r0.LLILLJJLI.LIZLLL)) {
                        z4 = true;
                    }
                    videoDetailFragment.OR(liveIconView, z4);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gn3, viewGroup, false);
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
