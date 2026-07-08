package com.ss.android.ugc.aweme.skylight;

import X.C01OS;
import X.C0HWQ;
import X.C0P0T;
import X.C0PEM;
import X.C0SE9;
import X.C1243240iSQ;
import X.C1247510iZJ;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1393110mM9;
import X.C1393190mMH;
import X.C1587170rP9;
import X.C1589640rT8;
import X.C1605570rsp;
import X.C1608160rx0;
import X.C1610870s1N;
import X.C1954807lC;
import X.C19EG;
import X.C2095008Iq;
import X.C2187701Ajg;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C443090HZb;
import X.C563770M9f;
import X.C814420VxA;
import X.DialogInterfaceOnCancelListenerC1620750sHJ;
import X.EnumC1235690iGF;
import X.EnumC1392960mLu;
import X.EnumC1393020mM0;
import X.EnumC1605560rso;
import X.InterfaceC1340660kzY;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightCellLongClickAbilityImpl implements ISkylightCellLongClickAbility {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public long LL;

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final boolean Y() {
        C1610870s1N.LIZ.getClass();
        return C1610870s1N.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void a2(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        objectAnimatorOfFloat3.setDuration(350L);
        objectAnimatorOfFloat3.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        objectAnimatorOfFloat4.setDuration(350L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        animatorSet.start();
    }

    public static void LIZ(Activity activity, Map map) {
        SocMediaPickerService socMediaPickerService;
        C563770M9f c563770M9fLIZLLL;
        String str;
        if (activity != null && (socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null)) != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
            TokenCert tokenCertChooseBPEAToken = c563770M9fLIZLLL.chooseBPEAToken("bpea-story_head_plus_request_read_storage_permission_target34", "bpea-story_head_plus_request_read_storage_permission_target33", "bpea-story_head_plus_request_read_storage_permission");
            LIZJ("click", map);
            C1610870s1N.LIZ.getClass();
            int iLIZJ = C1610870s1N.LIZJ();
            String str2 = "";
            if (iLIZJ != 1) {
                if (iLIZJ != 2) {
                    str = "";
                } else {
                    str = "click_head_menu";
                }
            } else {
                str = "click_head_sheet";
            }
            String str3 = (String) map.get("enter_from");
            if (str3 != null) {
                str2 = str3;
            }
            c563770M9fLIZLLL.startStoryPublish(activity, new EnterStoryParam(null, str, str2, null, null, null, null, null, null, false, false, false, 0, 0.0f, 0, null, null, null, null, null, null, false, null, false, null, null, 67108857, null), tokenCertChooseBPEAToken);
        }
    }

    public static void LIZJ(String str, Map map) {
        String str2 = (String) map.get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C1610870s1N.LIZ.getClass();
        int iLIZJ = C1610870s1N.LIZJ();
        if (iLIZJ != 1) {
            if (iLIZJ == 2) {
                str3 = "menu";
            }
        } else {
            str3 = "sheet";
        }
        C1587170rP9.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01OS(str2, "long_press_skylight_avatar", str, str3, null), 3);
    }

    public static C1393190mMH LJI(String str, Map map) {
        int iIntValue;
        Integer numLJIIJJI;
        String str2 = (String) map.get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) map.get("follow_status");
        if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        String str5 = (String) map.get("head_type");
        if (str5 == null) {
            str5 = "";
        }
        C1610870s1N.LIZ.getClass();
        int iLIZJ = C1610870s1N.LIZJ();
        if (iLIZJ != 1) {
            if (iLIZJ == 2) {
                str3 = "menu";
            }
        } else {
            str3 = "sheet";
        }
        return new C1393190mMH(iIntValue, str2, "long_press_skylight_avatar", "", str5, str, str3);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void V4(View view, Map<String, String> map) {
        String string = view.getContext().getString(2131848311);
        C1610870s1N.LIZ.getClass();
        int iLIZJ = C1610870s1N.LIZJ();
        LIZJ("show", map);
        if (iLIZJ != 1) {
            if (iLIZJ == 2) {
                LJFF(view, string, R.raw.icon_circle_plus, new AwS425S0200000_24(this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) 44), new AwS246S0300000_2(view, (View) this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) 10));
                return;
            }
            return;
        }
        LJ(view.getContext(), string, new AwS425S0200000_24(this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) 43), new AwS368S0200000_2(this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) 56));
    }

    public static void LIZIZ(String str, String str2, Map map) {
        int iIntValue;
        Integer numLJIIJJI;
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        String str3 = (String) map.get("enter_from");
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = (String) map.get("follow_status");
        if (str5 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        String str6 = (String) map.get("head_type");
        if (str6 == null) {
            str6 = "";
        }
        C1610870s1N.LIZ.getClass();
        int iLIZJ = C1610870s1N.LIZJ();
        if (iLIZJ != 1) {
            if (iLIZJ == 2) {
                str4 = "menu";
            }
        } else {
            str4 = "sheet";
        }
        C1393110mM9 c1393110mM9 = new C1393110mM9(iIntValue, str3, "long_press_skylight_avatar", "", str, str6, str4, str2, false);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9);
    }

    public static void LJ(Context context, String str, Function0 function0, Function1 function1) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZ = str;
            c1247510iZJ.LIZ(function1);
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC1620750sHJ(function0, 0);
            c1390850mIV.LIZJ().show(supportFragmentManager, "SKYLIGHT_CELL_LONG_CLICK_ACTION_SHEET");
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void D4(View view, User user, EnumC1605560rso enumC1605560rso, Map<String, String> map) {
        String str;
        C1610870s1N.LIZ.getClass();
        int iLIZJ = C1610870s1N.LIZJ();
        C1608160rx0 c1608160rx0 = new C1608160rx0(this, view, user, enumC1605560rso, map);
        String str2 = "";
        if (C1610870s1N.LIZLLL()) {
            int i = C1605570rsp.LIZ[enumC1605560rso.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "split_2_live";
                }
            } else {
                str = "split_2_story";
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (iLIZJ != 1) {
            if (iLIZJ == 2) {
                LJFF(view, view.getContext().getString(2131848312), R.raw.icon_eye_slash, new AwS139S1200000_24(this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) str, (String) 5), c1608160rx0);
            }
        } else {
            Context context = view.getContext();
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname != null) {
                str2 = nickname;
            }
            LJ(context, context.getString(2131848309, C0SE9.LIZ(user, str2)), new AwS139S1200000_24(this, (SkylightCellLongClickAbilityImpl) map, (Map<String, String>) str, (String) 4), new AwS603S0100000_24(c1608160rx0, 282));
        }
        LIZIZ("show", str, map);
    }

    public static void LIZLLL(Context context, User user, EnumC1392960mLu enumC1392960mLu, Map map, String str) {
        C1589640rT8.LIZIZ.M2(C1388190mED.LIZ(context), null, null, LJI(str, map), EnumC1393020mM0.SKYLIGHT, enumC1392960mLu, user, new AwS390S0200000_24(user, enumC1392960mLu, 41));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.0P0T] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0rx1, android.view.ViewTreeObserver$OnScrollChangedListener, java.lang.Object] */
    public final void LJFF(final View view, String str, int i, final Function0<Unit> function0, Function0<Unit> function02) {
        Context context = view.getContext();
        final C259800zU c259800zU = new C259800zU();
        C0HWQ c0hwq = new C0HWQ(context);
        c0hwq.LJIIL(Collections.singletonList(Collections.singletonList(new C443090HZb(str, new AwS568S0100000_24(function02, (Function0<Unit>) 1148), i, null, 0, null, 0, false, false, null, 1016))));
        c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        c0hwq.LLILLJJLI.LIZIZ = view;
        c0hwq.LIZLLL();
        c0hwq.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
        c0hwq.LJII(R.attr.a1d);
        c0hwq.LLILLJJLI.LJII = -1001L;
        c259800zU.element = c0hwq.LIZIZ();
        view.getLocationInWindow(new int[2]);
        final PointF pointF = new PointF(r2[0], r2[1]);
        final ?? r2 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0rx1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = this.LL;
                View view2 = view;
                skylightCellLongClickAbilityImpl.getClass();
                view2.getLocationInWindow(new int[2]);
                if (Intrinsics.LJFF(new PointF(r3[0], r3[1]), pointF)) {
                    return;
                }
                c259800zU.element.dismiss();
            }
        };
        ((C0P0T) c259800zU.element).LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0rx3
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                function0.invoke();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = r2;
                    viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
                }
            }
        });
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != 0) {
            viewTreeObserver.addOnScrollChangedListener(r2);
            C2187701Ajg.LIZ(viewTreeObserver, r2, ViewTreeObserver.OnScrollChangedListener.class);
        }
        ((C0P0T) c259800zU.element).show();
    }
}
