package kotlin.jvm.internal;

import X.AbstractC19651711ud;
import X.C09AY;
import X.C0FTJ;
import X.C11FW;
import X.C11FX;
import X.C1528405yc;
import X.C19642011t4;
import X.C19643011tE;
import X.C19651211uY;
import X.C19651811ue;
import X.C19651911uf;
import X.C19652211ui;
import X.C19652311uj;
import X.C19653311ut;
import X.C20467080b;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1153560g7m;
import X.EnumC19646311tl;
import X.EnumC19651411ua;
import android.content.Context;
import com.ss.android.ugc.aweme.capcutpromotion.ButtonAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishViewModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public class AwS112S1200000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS112S1200000_29 awS112S1200000_29, Object obj) throws JSONException {
        C1528405yc.LIZ((Integer) awS112S1200000_29.l1, "group_onboarding_card_comment_guide", "choose_post", awS112S1200000_29.s0);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS112S1200000_29.l2;
        String str = awS112S1200000_29.s0;
        c11fw.getClass();
        C11FW.LIZLLL(context, str, "group_onboarding_card_comment_guide");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        C11FX c11fx = (C11FX) obj;
        c11fx.LIZ = ((Context) awS112S1200000_29.l1).getString(2131838716);
        c11fx.LIZLLL = ((Context) awS112S1200000_29.l1).getString(2131838717);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS112S1200000_29.l1;
        c11fw.getClass();
        c11fx.LJI = C11FW.LIZJ(context, "public_group_create_onboarding/share_in_comment_light_lottie.json", "public_group_create_onboarding/share_in_comment_dark_lottie.json");
        c11fx.LJ = ((Context) awS112S1200000_29.l1).getString(2131838715);
        c11fx.LIZIZ = Integer.valueOf(R.raw.icon_tick_circle_fill);
        c11fx.LIZJ = Integer.valueOf(R.attr.a1v);
        c11fx.LJIIJ = new AwS178S1100000_29(awS112S1200000_29.s0, (Integer) awS112S1200000_29.l2, 0);
        c11fx.LJFF = new AwS112S1200000_29((Context) awS112S1200000_29.l1, awS112S1200000_29.s0, (Integer) awS112S1200000_29.l2, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        C1528405yc.LIZ((Integer) awS112S1200000_29.l1, "group_onboarding_card_creation_guide", "open_camera", awS112S1200000_29.s0);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS112S1200000_29.l2;
        String str = awS112S1200000_29.s0;
        c11fw.getClass();
        IMCameraBridgeApi iMCameraBridgeApi = (IMCameraBridgeApi) PluggableExtentionKt.pluggableSpiForReal(IMCameraBridgeApi.class);
        if (iMCameraBridgeApi != null) {
            iMCameraBridgeApi.LJIIZILJ(context, str, "group_onboarding_card_creation_guide");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        C11FX c11fx = (C11FX) obj;
        c11fx.LIZ = ((Context) awS112S1200000_29.l1).getString(2131838713);
        C11FW c11fw = C11FW.LIZ;
        Context context = (Context) awS112S1200000_29.l1;
        c11fw.getClass();
        c11fx.LJI = C11FW.LIZJ(context, "public_group_create_onboarding/share_in_post_light_lottie.json", "public_group_create_onboarding/share_in_post_dark_lottie.json");
        c11fx.LJ = ((Context) awS112S1200000_29.l1).getString(2131838710);
        c11fx.LJIIJ = new AwS178S1100000_29(awS112S1200000_29.s0, (Integer) awS112S1200000_29.l2, 1);
        c11fx.LJFF = new AwS112S1200000_29((Context) awS112S1200000_29.l1, awS112S1200000_29.s0, (Integer) awS112S1200000_29.l2, 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$4(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        boolean z;
        EnumC19646311tl enumC19646311tl;
        String strLIZIZ;
        String str;
        C19652211ui c19652211ui = (C19652211ui) obj;
        C19651211uY c19651211uY = (C19651211uY) awS112S1200000_29.l1;
        c19651211uY.LIZLLL.LIZIZ(EnumC19651411ua.FINISHED);
        c19651211uY.LJ.LIZIZ((R) c19652211ui);
        c19651211uY.LIZ.invoke();
        if (c19652211ui != null) {
            NewsAnchorPublishViewModel newsAnchorPublishViewModel = (NewsAnchorPublishViewModel) awS112S1200000_29.l2;
            String str2 = awS112S1200000_29.s0;
            AbstractC19651711ud abstractC19651711ud = c19652211ui.LIZJ;
            if (abstractC19651711ud != null && abstractC19651711ud.LIZ == EnumC1153560g7m.ERROR) {
                z = true;
            } else {
                z = false;
            }
            if (!c19652211ui.LIZIZ) {
                enumC19646311tl = EnumC19646311tl.ERROR;
            } else if (str2.length() == 0) {
                enumC19646311tl = EnumC19646311tl.NONE;
            } else if (C19651811ue.LIZIZ(str2).length() == 0) {
                enumC19646311tl = EnumC19646311tl.CLEAR;
            } else {
                enumC19646311tl = EnumC19646311tl.GREEN;
            }
            if (c19652211ui.LIZIZ || !(abstractC19651711ud instanceof C19651911uf) ? abstractC19651711ud == null || (strLIZIZ = C20467080b.LIZIZ(abstractC19651711ud.LIZIZ)) == null : (strLIZIZ = ((C19651911uf) abstractC19651711ud).LIZLLL.statusMessage) == null) {
                strLIZIZ = "";
            }
            C19652311uj c19652311uj = new C19652311uj(enumC19646311tl, new C19653311ut(z, strLIZIZ));
            newsAnchorPublishViewModel.getClass();
            newsAnchorPublishViewModel.setState(new AwS608S0100000_29(c19652311uj, 138));
            C19642011t4 c19642011t4 = (C19642011t4) newsAnchorPublishViewModel.LL.getValue();
            AbstractC19651711ud abstractC19651711ud2 = c19652211ui.LIZJ;
            c19642011t4.getClass();
            if (abstractC19651711ud2 != null && abstractC19651711ud2.LIZ == EnumC1153560g7m.ERROR) {
                if (abstractC19651711ud2 instanceof C19651911uf) {
                    str = ((C19651911uf) abstractC19651711ud2).LIZLLL.statusCode;
                } else {
                    str = abstractC19651711ud2.LIZJ;
                }
                if (str != null) {
                    HashMap<String, Integer> map = c19642011t4.LIZ;
                    Integer num = map.get(str);
                    if (num == null) {
                        num = 0;
                        map.put(str, num);
                    }
                    map.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        StickerModel stickerModelLJLI = ((C0FTJ) awS112S1200000_29.l1).LJLI();
        if (stickerModelLJLI instanceof AddYoursStickerModel) {
            ((C19643011tE) awS112S1200000_29.l2).m3((AddYoursStickerModel) stickerModelLJLI, awS112S1200000_29.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS112S1200000_29 awS112S1200000_29, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", awS112S1200000_29.s0);
        c2344009Gk.LJIIIIZZ("enter_method", ((ButtonAction) awS112S1200000_29.l1).logPb.enterMethod);
        c2344009Gk.LJIIIIZZ("enter_type", ((ButtonAction) awS112S1200000_29.l1).logPb.enterType);
        C20684815ws.LJIILLIIL("cctott_posting_campaign_popup_click", c2344009Gk.LIZ);
        ((Function0) awS112S1200000_29.l2).invoke();
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS112S1200000_29(android.content.Context r3, java.lang.String r4, java.lang.Integer r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 1: goto L5;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S1200000_29.<init>(android.content.Context, java.lang.String, java.lang.Integer, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S1200000_29(C0FTJ c0ftj, C0FTJ<? extends StickerModel> c0ftj2, C19643011tE c19643011tE, String str) {
        super(1);
        this.$t = str;
        this.l1 = c0ftj;
        this.l2 = c0ftj2;
        this.s0 = c19643011tE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S1200000_29(NewsAnchorPublishViewModel newsAnchorPublishViewModel, C19651211uY c19651211uY, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19651211uY;
        this.l2 = newsAnchorPublishViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S1200000_29(String str, String str2, ButtonAction buttonAction, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = buttonAction;
    }
}
