package com.ss.android.ugc.aweme.api.component.slide;

import X.C1019070ccr;
import X.C1055360dZO;
import X.C1055370dZP;
import X.C1055380dZQ;
import X.C1055390dZR;
import X.C1055400dZS;
import X.C1055420dZU;
import X.C1388190mED;
import X.C21599719g3;
import X.C21600219g8;
import X.C360660ECa;
import X.C714400S0o;
import X.C786410Ut5;
import X.InterfaceC1055440dZW;
import X.RunnableC989880brm;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ad.experiment.AdScrollToJumpExperiment;
import com.ss.android.ugc.aweme.api.component.slide.CommerceSlideConfigAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.ad.LeftSlideConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceSlideConfigAssem extends BaseCellContentComponent<CommerceSlideConfigAssem> {
    public C21600219g8 LLJJJJLIIL;
    public C714400S0o LLJJL;
    public C21599719g3 LLJJLIIIJLLLLLLLZ;
    public RunnableC989880brm LLJLIL;
    public C21600219g8 LLJLL;
    public C1055420dZU LLJLLIL;
    public final BPEAHandler LLJL = new BPEAHandler(Looper.getMainLooper());
    public final C1055390dZR LLJLILLLLZIIL = C1055390dZR.LIZ;
    public final C1055400dZS LLJLLL = new C1055400dZS(this);
    public final C1055370dZP LLJZ = new C360660ECa() { // from class: X.0dZP
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            CommerceSlideConfigAssem commerceSlideConfigAssem = this.LL;
            commerceSlideConfigAssem.sp(commerceSlideConfigAssem.mp(), i);
        }
    };
    public final C1055380dZQ LLJZIJLIL = new C360660ECa() { // from class: X.0dZQ
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            CommerceSlideConfigAssem commerceSlideConfigAssem = this.LL;
            commerceSlideConfigAssem.sp(commerceSlideConfigAssem.op(), i);
        }
    };
    public final C1055360dZO LLL = new C360660ECa() { // from class: X.0dZO
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            CommerceSlideConfigAssem commerceSlideConfigAssem = this.LL;
            commerceSlideConfigAssem.sp(commerceSlideConfigAssem.lp(), i);
        }
    };

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        ip(null, false);
        hp(false);
        RunnableC989880brm runnableC989880brm = this.LLJLIL;
        if (runnableC989880brm != null) {
            this.LLJL.removeCallbacks(runnableC989880brm);
        }
        this.LLJLIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ip(null, false);
        hp(false);
        RunnableC989880brm runnableC989880brm = this.LLJLIL;
        if (runnableC989880brm != null) {
            this.LLJL.removeCallbacks(runnableC989880brm);
        }
        this.LLJLIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public final void ep() {
        RunnableC989880brm runnableC989880brm = this.LLJLIL;
        if (runnableC989880brm != null) {
            if (runnableC989880brm.LLILLJJLI) {
                return;
            } else {
                this.LLJL.removeCallbacks(runnableC989880brm);
            }
        }
        RunnableC989880brm runnableC989880brm2 = new RunnableC989880brm(this);
        this.LLJLIL = runnableC989880brm2;
        C786410Ut5.LJLIIL(200L, this.LLJL, runnableC989880brm2);
    }

    public final C21600219g8 lp() {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            View viewFindViewById = LJJIJL().findViewById(R.id.aa9);
            this.LLJJLIIIJLLLLLLLZ = (viewFindViewById == null || !(viewFindViewById instanceof C21599719g3)) ? null : (C21599719g3) viewFindViewById;
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C21600219g8 mp() {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = (C21600219g8) kp(LJJIJL(), AFwS252S0000000_16.get$arr$(94));
        }
        return this.LLJJJJLIIL;
    }

    public final C21600219g8 op() {
        if (this.LLJJL == null) {
            View viewFindViewById = LJJIJL().findViewById(R.id.player_view_pager);
            this.LLJJL = (viewFindViewById == null || !(viewFindViewById instanceof C714400S0o)) ? null : (C714400S0o) viewFindViewById;
        }
        return this.LLJJL;
    }

    public final void hp(boolean z) {
        Activity activityLIZ;
        Window.Callback callback;
        C1055420dZU c1055420dZU = null;
        if (z) {
            Context context = LJJIJL().getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                Map<Activity, C1055420dZU> map = C1055420dZU.LLJILLL;
                C1055420dZU c1055420dZU2 = (C1055420dZU) ((LinkedHashMap) map).get(activityLIZ);
                if (c1055420dZU2 != null) {
                    c1055420dZU = c1055420dZU2;
                } else {
                    Window window = activityLIZ.getWindow();
                    if (window != null && (callback = window.getCallback()) != null) {
                        if (callback instanceof C1055420dZU) {
                            map.put(activityLIZ, (C1055420dZU) callback);
                            c1055420dZU = (C1055420dZU) callback;
                        } else {
                            c1055420dZU = new C1055420dZU(activityLIZ, callback);
                            window.setCallback(c1055420dZU);
                            map.put(activityLIZ, c1055420dZU);
                        }
                    }
                }
            }
            this.LLJLLIL = c1055420dZU;
            if (c1055420dZU != null) {
                c1055420dZU.LLILLL = true;
                c1055420dZU.LLJIJIL = ((Number) AdScrollToJumpExperiment.LIZLLL.getValue()).intValue();
            }
            C1055420dZU c1055420dZU3 = this.LLJLLIL;
            if (c1055420dZU3 != null) {
                c1055420dZU3.LLJ = ((Number) AdScrollToJumpExperiment.LJ.getValue()).intValue();
            }
            C1055420dZU c1055420dZU4 = this.LLJLLIL;
            if (c1055420dZU4 != null) {
                c1055420dZU4.LLJILJILJ = this.LLJLLL;
            }
            C21600219g8 c21600219g8Mp = mp();
            if (c21600219g8Mp != null) {
                c21600219g8Mp.LIZLLL(this.LLJZ);
            }
            C21600219g8 c21600219g8Mp2 = mp();
            if (c21600219g8Mp2 != null) {
                c21600219g8Mp2.setOptForceDetermineTargetPage(false);
            }
            C21600219g8 c21600219g8Op = op();
            if (c21600219g8Op != null) {
                c21600219g8Op.LIZLLL(this.LLJZIJLIL);
            }
            C21600219g8 c21600219g8Op2 = op();
            if (c21600219g8Op2 != null) {
                c21600219g8Op2.setOptForceDetermineTargetPage(false);
            }
            C21600219g8 c21600219g8Lp = lp();
            if (c21600219g8Lp != null) {
                c21600219g8Lp.LIZLLL(this.LLL);
            }
            C21600219g8 c21600219g8Lp2 = lp();
            if (c21600219g8Lp2 != null) {
                c21600219g8Lp2.setOptForceDetermineTargetPage(false);
                return;
            }
            return;
        }
        C1055420dZU c1055420dZU5 = this.LLJLLIL;
        if (c1055420dZU5 != null) {
            c1055420dZU5.LLILLL = false;
            C1055420dZU.LLJILLL.remove(c1055420dZU5.LLILLJJLI);
        }
        C1055420dZU c1055420dZU6 = this.LLJLLIL;
        if (c1055420dZU6 != null) {
            c1055420dZU6.LLILLL = false;
            if (c1055420dZU6 != null) {
                c1055420dZU6.LLJIJIL = -1.0f;
                c1055420dZU6.LLJ = -1.0f;
                c1055420dZU6.LLJILJILJ = null;
            }
        }
        C21600219g8 c21600219g8Mp3 = mp();
        if (c21600219g8Mp3 != null) {
            c21600219g8Mp3.LJJIIJZLJL(this.LLJZ);
        }
        C21600219g8 c21600219g8Mp4 = mp();
        if (c21600219g8Mp4 != null) {
            c21600219g8Mp4.setOptForceDetermineTargetPage(false);
        }
        C21600219g8 c21600219g8Op3 = op();
        if (c21600219g8Op3 != null) {
            c21600219g8Op3.LJJIIJZLJL(this.LLJZIJLIL);
        }
        C21600219g8 c21600219g8Op4 = op();
        if (c21600219g8Op4 != null) {
            c21600219g8Op4.setOptForceDetermineTargetPage(false);
        }
        C21600219g8 c21600219g8Lp3 = lp();
        if (c21600219g8Lp3 != null) {
            c21600219g8Lp3.LJJIIJZLJL(this.LLL);
        }
        C21600219g8 c21600219g8Lp4 = lp();
        if (c21600219g8Lp4 == null) {
            return;
        }
        c21600219g8Lp4.setOptForceDetermineTargetPage(false);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ep();
    }

    public static Object kp(View view, AFwS252S0000000_16 aFwS252S0000000_16) {
        View view2;
        if (view.getId() == R.id.viewpager && ((Boolean) aFwS252S0000000_16.invoke(view)).booleanValue()) {
            return view;
        }
        Object parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            return null;
        }
        return kp(view2, aFwS252S0000000_16);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        ep();
    }

    public final void ip(Aweme aweme, boolean z) {
        LeftSlideConfig leftSlideConfig;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            leftSlideConfig = awemeRawAd.getLeftSlideConfig();
        } else {
            leftSlideConfig = null;
        }
        if (z) {
            if (leftSlideConfig != null) {
                Float distanceThreshold = leftSlideConfig.getDistanceThreshold();
                if (distanceThreshold != null) {
                    float fFloatValue = distanceThreshold.floatValue();
                    C21600219g8 c21600219g8Mp = mp();
                    if (c21600219g8Mp != null) {
                        c21600219g8Mp.setOptPageChangeOffset(1 - fFloatValue);
                    }
                }
                Float minDistanceRito = leftSlideConfig.getMinDistanceRito();
                if (minDistanceRito != null) {
                    float fFloatValue2 = minDistanceRito.floatValue();
                    C21600219g8 c21600219g8Mp2 = mp();
                    if (c21600219g8Mp2 != null) {
                        c21600219g8Mp2.setOptFlingDistanceByRatio(fFloatValue2);
                    }
                }
                Float minVelocityRatio = leftSlideConfig.getMinVelocityRatio();
                if (minVelocityRatio != null) {
                    float fFloatValue3 = minVelocityRatio.floatValue();
                    C21600219g8 c21600219g8Mp3 = mp();
                    if (c21600219g8Mp3 != null) {
                        c21600219g8Mp3.setOptMinimumVelocityByRatio(fFloatValue3);
                    }
                }
                C1019070ccr.LIZ = null;
                C21600219g8 c21600219g8Mp4 = mp();
                if (c21600219g8Mp4 != null) {
                    C1055390dZR c1055390dZR = this.LLJLILLLLZIIL;
                    if (c21600219g8Mp4.LLLLLLLZIL == null) {
                        c21600219g8Mp4.LLLLLLLZIL = new CopyOnWriteArrayList<>();
                    }
                    c21600219g8Mp4.LLLLLLLZIL.add(c1055390dZR);
                    return;
                }
                return;
            }
        } else if (leftSlideConfig != null) {
            Float distanceThreshold2 = leftSlideConfig.getDistanceThreshold();
            if (distanceThreshold2 != null) {
                distanceThreshold2.floatValue();
                C21600219g8 c21600219g8Mp5 = mp();
                if (c21600219g8Mp5 != null) {
                    c21600219g8Mp5.setOptPageChangeOffset(0.0f);
                }
            }
            Float minDistanceRito2 = leftSlideConfig.getMinDistanceRito();
            if (minDistanceRito2 != null) {
                minDistanceRito2.floatValue();
                C21600219g8 c21600219g8Mp6 = mp();
                if (c21600219g8Mp6 != null) {
                    c21600219g8Mp6.setOptFlingDistanceByRatio(0.0f);
                }
            }
            Float minVelocityRatio2 = leftSlideConfig.getMinVelocityRatio();
            if (minVelocityRatio2 != null) {
                minVelocityRatio2.floatValue();
                C21600219g8 c21600219g8Mp7 = mp();
                if (c21600219g8Mp7 != null) {
                    c21600219g8Mp7.setOptMinimumVelocityByRatio(0.0f);
                }
            }
        }
        C1019070ccr.LIZ = null;
        C21600219g8 c21600219g8Mp8 = mp();
        if (c21600219g8Mp8 == null) {
            return;
        }
        C1055390dZR c1055390dZR2 = this.LLJLILLLLZIIL;
        CopyOnWriteArrayList<InterfaceC1055440dZW> copyOnWriteArrayList = c21600219g8Mp8.LLLLLLLZIL;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(c1055390dZR2);
    }

    public final void sp(C21600219g8 c21600219g8, int i) {
        if (i == 1) {
            this.LLJLL = c21600219g8;
            if (Intrinsics.LJFF(c21600219g8, lp())) {
                C1055420dZU c1055420dZU = this.LLJLLIL;
                if (c1055420dZU != null) {
                    c1055420dZU.LLJ = AdScrollToJumpExperiment.LIZ(110);
                }
            } else if (Intrinsics.LJFF(c21600219g8, op())) {
                C1055420dZU c1055420dZU2 = this.LLJLLIL;
                if (c1055420dZU2 != null) {
                    c1055420dZU2.LLJ = AdScrollToJumpExperiment.LIZ(110);
                }
            } else {
                C1055420dZU c1055420dZU3 = this.LLJLLIL;
                if (c1055420dZU3 != null) {
                    c1055420dZU3.LLJ = ((Number) AdScrollToJumpExperiment.LJ.getValue()).intValue();
                }
            }
            C1055420dZU c1055420dZU4 = this.LLJLLIL;
            if (c1055420dZU4 != null) {
                c1055420dZU4.LLILZ = true;
            }
        }
    }
}
