package kotlin.jvm.internal;

import X.AbstractC1711506n3;
import X.C062P;
import X.C09AY;
import X.C0HHA;
import X.C0HWW;
import X.C0HZ2;
import X.C0I20;
import X.C0YNP;
import X.C1255650imR;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C1637706b9;
import X.C20248814Kw;
import X.C448260Hhw;
import X.C449650HkB;
import X.C449680HkE;
import X.C449730HkJ;
import X.C453340Hq8;
import X.C456260Huq;
import X.C456970Hvz;
import X.C457190HwL;
import X.C457200HwM;
import X.C457210HwN;
import X.C458110Hxp;
import X.C786410Ut5;
import X.EnumC443930Hax;
import X.EnumC449720HkI;
import X.InterfaceC457220HwO;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS120S1100000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        return C448260Hhw.LIZ((C448260Hhw) obj, (Comment) awS120S1100000_6.l1, 0, awS120S1100000_6.s0, 0L, 10);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        ImageView imageView = (ImageView) obj;
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS120S1100000_6.s0);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIZ.LJJI = c1331750klB.LIZ();
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = (int) C12ES.LIZJ(24.0f, (Context) awS120S1100000_6.l1);
        layoutParams.width = (int) C12ES.LIZJ(24.0f, (Context) awS120S1100000_6.l1);
        C786410Ut5.c6(imageView, layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        Assembler assembler = (Assembler) obj;
        IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment = (IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1;
        assembler.DQ2(iMUnifiedQuickInputDialogFragment, new AwS120S1100000_6(iMUnifiedQuickInputDialogFragment, awS120S1100000_6.s0, 3));
        IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment2 = (IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1;
        assembler.DQ2(iMUnifiedQuickInputDialogFragment2, new AwS120S1100000_6(iMUnifiedQuickInputDialogFragment2, awS120S1100000_6.s0, 4));
        assembler.RQ2((IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1, AFwS236S0000000_6.get$arr$(107));
        assembler.QQ2((IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1, AFwS236S0000000_6.get$arr$(108));
        assembler.RQ2((IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1, AFwS229S0000000_2.get$arr$(265));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        String str = awS120S1100000_6.s0;
        IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment = (IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1;
        ((C062P) obj).LIZ = new C456260Huq(str, iMUnifiedQuickInputDialogFragment.LLILZ, iMUnifiedQuickInputDialogFragment.LLILLJJLI);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        String str;
        String str2;
        Integer numValueOf;
        String str3;
        String str4;
        InterfaceC457220HwO c457190HwL;
        String string;
        String str5;
        C062P c062p = (C062P) obj;
        List<EnumC449720HkI> listLIZ = C449730HkJ.LIZ();
        String str6 = awS120S1100000_6.s0;
        C456970Hvz c456970Hvz = ((IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1).LLILZ;
        if (c456970Hvz != null) {
            str = c456970Hvz.LLILLJJLI;
            str2 = c456970Hvz.LLILLL;
        } else {
            str = null;
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "group")) {
            numValueOf = Integer.valueOf(AbstractC1711506n3.LIZIZ);
        } else if (Intrinsics.LJFF(str2, "private")) {
            numValueOf = Integer.valueOf(AbstractC1711506n3.LIZ);
        } else {
            numValueOf = null;
        }
        IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment = (IMUnifiedQuickInputDialogFragment) awS120S1100000_6.l1;
        C456970Hvz c456970Hvz2 = iMUnifiedQuickInputDialogFragment.LLILZ;
        if (c456970Hvz2 != null) {
            str3 = c456970Hvz2.LLILLL;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "group")) {
            C456970Hvz c456970Hvz3 = iMUnifiedQuickInputDialogFragment.LLILZ;
            if (c456970Hvz3 != null && (str5 = c456970Hvz3.LLILLJJLI) != null) {
                c457190HwL = new C457190HwL(new C457200HwM(str5));
            } else {
                c457190HwL = C449680HkE.LIZIZ;
            }
        } else {
            C456970Hvz c456970Hvz4 = iMUnifiedQuickInputDialogFragment.LLILZ;
            if (c456970Hvz4 != null) {
                str4 = c456970Hvz4.LLILLJJLI;
            } else {
                str4 = null;
            }
            Long lValueOf = Long.valueOf(C0YNP.LJII(str4));
            if (lValueOf.longValue() > 0 && (string = lValueOf.toString()) != null) {
                c457190HwL = new C457190HwL(new C457210HwN(string));
            } else {
                c457190HwL = C449680HkE.LIZIZ;
            }
        }
        c062p.LIZ = new C449650HkB(listLIZ, R.attr.zq, R.attr.zm, null, null, str6, false, false, null, null, null, false, null, null, null, str, numValueOf, false, c457190HwL, null, null, null, null, null, null, null, null, null, false, EnumC443930Hax.LAZY, false, null, null, null, null, null, null, 2146238424, 255);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        Context context;
        C0HWW c0hww = C0HWW.LIZ;
        String str = awS120S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LJIILLIIL("click", str);
        C1255650imR c1255650imR = (C1255650imR) awS120S1100000_6.l1;
        Fragment fragment = c1255650imR.LIZIZ;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = c1255650imR.LIZ;
        }
        if (context != null) {
            ((ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class)).LJIILLIIL(new C0HHA(context, "click_edit_profile", "personal_homepage", null, null, 4, true, Intrinsics.LJFF(awS120S1100000_6.s0, "view_avatar"), C0HZ2.STABLE_EDIT_PROFILE_ACTION_SHEET, false, null, 3072), null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        C458110Hxp c458110Hxp = (C458110Hxp) obj;
        if (c458110Hxp.LIZ.length() != 0) {
            if (Intrinsics.LJFF(awS120S1100000_6.s0, c458110Hxp.LIZ) && Intrinsics.LJFF(c458110Hxp.LIZLLL, "chat_page_camera") && (c458110Hxp.LIZIZ || c458110Hxp.LIZJ)) {
                ((EditText) awS120S1100000_6.l1).setText("");
            }
            if (Intrinsics.LJFF(awS120S1100000_6.s0, c458110Hxp.LIZ) && (c458110Hxp.LIZIZ || c458110Hxp.LIZJ)) {
                ((EditText) awS120S1100000_6.l1).setText("");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        if (Intrinsics.LJFF(((C1637706b9) obj).LIZ, awS120S1100000_6.s0)) {
            ((C0I20) awS120S1100000_6.l1).At1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        ((Function2) awS120S1100000_6.l1).invoke(obj, awS120S1100000_6.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS120S1100000_6 awS120S1100000_6, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS91S1000000_6(awS120S1100000_6.s0, 4);
        c20248814Kw.LIZIZ(new AwS620S0100000_6((C453340Hq8) awS120S1100000_6.l1, 172));
        C20248814Kw.LIZJ(c20248814Kw, true, false, 0.75f, 0, null, null, null, 122);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS120S1100000_6(com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS120S1100000_6.<init>(com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(EditText editText, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = editText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(Comment comment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = comment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(String str, C453340Hq8 c453340Hq8, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c453340Hq8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(String str, C1255650imR c1255650imR, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1255650imR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(String str, MessageReplyVM messageReplyVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = messageReplyVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S1100000_6(AwS630S0100000_16 awS630S0100000_16, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS630S0100000_16;
        this.s0 = str;
    }
}
