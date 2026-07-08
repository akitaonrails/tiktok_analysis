package com.bytedance.android.livesdk.guide;

import X.C09JM;
import X.C0IPN;
import X.C1121340fHo;
import X.C1143680frq;
import X.C11NJ;
import X.C1295960jpS;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2268791DrB;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ALAdapterS0S0200002_5;
import Y.ALAdapterS0S0400002_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFanHammerSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBagGuideWidget extends LiveWidget {
    public C1295960jpS LL;
    public C1295960jpS LLILLJJLI;
    public final C11NJ LLILLL = new C11NJ();
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h2l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        this.LLILLL.LJ();
        super.onDestroy();
    }

    public final void y1() {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        if (!this.LLILZ || !this.LLILZIL) {
            C20441214yg.LJ("LiveBagGuideWidget", "checkAndPlaySwitchAnimation Not Ready");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAndPlaySwitchAnimation Go, isRightCardHammer=");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("LiveBagGuideWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILZLL) {
            C1295960jpS c1295960jpS3 = this.LL;
            if (c1295960jpS3 == null || (c1295960jpS = this.LLILLJJLI) == null) {
                return;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            C2268791DrB c2268791DrB = new C2268791DrB(0.33f, 0.0f, 0.67f, 1.0f);
            C786410Ut5.Pc(c1295960jpS3, 0.0f);
            C786410Ut5.Wb(c1295960jpS3, 0.8f);
            C786410Ut5.vc(c1295960jpS3, 0.8f);
            C786410Ut5.Pc(c1295960jpS, 0.0f);
            C786410Ut5.Wb(c1295960jpS, 0.8f);
            C786410Ut5.vc(c1295960jpS, 0.8f);
            c1295960jpS3.removeAllAnimatorListeners();
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS3.addAnimatorListener(new ALAdapterS0S0200002_5(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), c1295960jpS3, c2268791DrB, 1));
            c1295960jpS.addAnimatorListener(new ALAdapterS0S0200002_5(fLIZIZ, fLIZIZ2, c1295960jpS, c2268791DrB, 0));
            c1295960jpS3.playAnimation();
            c1295960jpS.playAnimation();
            return;
        }
        C1295960jpS c1295960jpS4 = this.LL;
        if (c1295960jpS4 == null || (c1295960jpS2 = this.LLILLJJLI) == null) {
            return;
        }
        float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-7));
        float fLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37));
        float fLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        C2268791DrB c2268791DrB2 = new C2268791DrB(0.33f, 0.0f, 0.67f, 1.0f);
        C2268791DrB c2268791DrB3 = new C2268791DrB(0.37f, 0.0f, 0.65f, 1.0f);
        C2268791DrB c2268791DrB4 = new C2268791DrB(0.33f, 0.0f, 0.67f, 1.0f);
        C786410Ut5.Pc(c1295960jpS4, 0.0f);
        C786410Ut5.Wb(c1295960jpS4, 0.8f);
        C786410Ut5.vc(c1295960jpS4, 0.8f);
        C786410Ut5.f5(c1295960jpS4, 1.0f);
        C786410Ut5.Pc(c1295960jpS2, 0.0f);
        C786410Ut5.Wb(c1295960jpS2, 0.8f);
        C786410Ut5.vc(c1295960jpS2, 0.8f);
        C786410Ut5.f5(c1295960jpS2, 0.0f);
        c1295960jpS4.removeAllAnimatorListeners();
        c1295960jpS2.removeAllAnimatorListeners();
        c1295960jpS4.addAnimatorListener(new ALAdapterS0S0400002_17(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37)), fLIZIZ3, c1295960jpS4, c2268791DrB2, c2268791DrB4, this, 0));
        c1295960jpS2.addAnimatorListener(new ALAdapterS0S0400002_17(fLIZIZ4, fLIZIZ5, c1295960jpS2, c2268791DrB3, c2268791DrB4, this, 1));
        c1295960jpS4.playAnimation();
        c1295960jpS2.playAnimation();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = (C1295960jpS) findViewById(R.id.nrc);
        this.LLILLJJLI = (C1295960jpS) findViewById(R.id.nrd);
        if (C500260Jjc.LJIJI(this.dataChannel)) {
            C1295960jpS c1295960jpS = this.LL;
            if (c1295960jpS != null) {
                C786410Ut5.LLD(8, c1295960jpS);
            }
            C1295960jpS c1295960jpS2 = this.LLILLJJLI;
            if (c1295960jpS2 != null) {
                C786410Ut5.LLD(8, c1295960jpS2);
            }
        }
        this.LLILLL.LIZ(C09JM.LIZ(C784440Upu.LIZ().LJ(C1121340fHo.class), new AfS186S0100000_17(this, 42)));
    }

    public static List z1(List list) {
        String str;
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            if (iIntValue != 7) {
                                if (iIntValue != 8) {
                                    if (iIntValue != 9) {
                                        str = "unknown";
                                    } else {
                                        str = "vault_gloves";
                                    }
                                } else {
                                    str = "no3_booster";
                                }
                            } else {
                                str = "no2_booster";
                            }
                        } else {
                            str = "special_effect";
                        }
                    } else {
                        str = "extra_time";
                    }
                } else {
                    str = "magic_smokes";
                }
            } else {
                str = "boosting_gloves";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static String A1(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return "";
            }
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 7 && i != 8) {
                        if (i == 9) {
                            return "tiktok_live_interaction_demand_4";
                        }
                        return "";
                    }
                    return "tiktok_live_interaction_demand_15";
                }
                if (LiveMatchFanHammerSetting.INSTANCE.isEnabled()) {
                    return "tiktok_live_interaction_demand_27";
                }
                return "tiktok_live_interaction_demand_15";
            }
            return "tiktok_live_interaction_demand_14";
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i == 9) {
                                    return "tiktok_live_interaction_demand_4";
                                }
                                return "";
                            }
                            return "tiktok_live_interaction_demand_13";
                        }
                        return "tiktok_live_interaction_demand_12";
                    }
                    if (LiveMatchFanHammerSetting.INSTANCE.isEnabled()) {
                        return "tiktok_live_interaction_demand_27";
                    }
                    return "tiktok_live_interaction_demand_6";
                }
                return "tiktok_live_interaction_demand_5";
            }
            return "tiktok_live_revenue_demand_2";
        }
        return "tiktok_live_revenue_demand_3";
    }

    public static String B1(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return "";
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "right_match_item_card_hammer.zip";
                        }
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return "";
                                }
                                return "right_match_item_card_vault_gloves.zip";
                            }
                            return "right_match_item_card_top3.zip";
                        }
                        return "right_match_item_card_top2.zip";
                    }
                    return "right_match_item_card_extra_time.zip";
                }
                return "right_match_item_card_smoke.zip";
            }
            return "right_match_item_card_critical.zip";
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return "";
                                }
                                return "award_match_item_card_vault_gloves.zip";
                            }
                            return "award_match_item_card_top3.zip";
                        }
                        return "award_match_item_card_top2.zip";
                    }
                    if (LiveMatchFanHammerSetting.INSTANCE.isEnabled()) {
                        return "right_match_item_card_hammer.zip";
                    }
                    return "ttlive_match_award_hammer.zip";
                }
                return "award_match_item_card_extra_time_1.zip";
            }
            return "award_match_item_card_smoke_1.zip";
        }
        return "award_match_item_card_baoji_1.zip";
    }

    public static void C1(int i, C1295960jpS c1295960jpS) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i == 9) {
                                    C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_12", "award_match_item_card_vault_golves.zip", "images", true, null, Boolean.FALSE, null);
                                    return;
                                }
                                return;
                            }
                            C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_13", "award_match_item_card_top3.zip", "images", true, null, Boolean.FALSE, null);
                            return;
                        }
                        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_12", "award_match_item_card_top2.zip", "images", true, null, Boolean.FALSE, null);
                        return;
                    }
                    if (LiveMatchFanHammerSetting.INSTANCE.isEnabled()) {
                        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_27", "right_match_item_card_hammer.zip", "images", true, null, Boolean.FALSE, null);
                        return;
                    } else {
                        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_6", "ttlive_match_award_hammer.zip", "images", true, null, Boolean.FALSE, null);
                        return;
                    }
                }
                C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_5", "award_match_item_card_extra_time_1.zip", "images", true, null, Boolean.FALSE, null);
                return;
            }
            C1143680frq.LJIIL(c1295960jpS, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_demand_2"), "award_match_item_card_smoke_1.zip", "images", true, null, Boolean.FALSE, null);
            return;
        }
        C1143680frq.LJIIL(c1295960jpS, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_demand_3"), "award_match_item_card_baoji_1.zip", "images", true, null, Boolean.FALSE, null);
    }

    public static AnimatorSet x1(C1295960jpS c1295960jpS, float f, float f2, C2268791DrB c2268791DrB, C2268791DrB c2268791DrB2, float f3, float f4) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(c1295960jpS, (Property<C1295960jpS, Float>) View.TRANSLATION_X, 0.0f, f).setDuration(470L);
        duration.setInterpolator(c2268791DrB);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(c1295960jpS, (Property<C1295960jpS, Float>) View.SCALE_X, f3, f4).setDuration(470L);
        duration2.setInterpolator(c2268791DrB);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(c1295960jpS, (Property<C1295960jpS, Float>) View.SCALE_Y, f3, f4).setDuration(470L);
        duration3.setInterpolator(c2268791DrB);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        ValueAnimator duration4 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1430L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(c1295960jpS, (Property<C1295960jpS, Float>) View.TRANSLATION_X, f, f2).setDuration(430L);
        duration5.setInterpolator(c2268791DrB2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(animatorSet, duration4, duration5);
        animatorSet2.setStartDelay(730L);
        return animatorSet2;
    }
}
