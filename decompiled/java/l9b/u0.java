package l9b;

import X.C03DZ;
import X.C03IT;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1744700vVE;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import k0b.a;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends ConstraintLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public ConstraintLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public final a LLJI;
    public boolean LLJIJIL;

    public final LinearLayout getDescContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fmu);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout getDescContainerLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fmw);
            this.LLJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getHeaderBackgroundImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jij);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPureDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sil);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getShowMoreContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v_t);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getUserRightSheetBackgroundFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_sheet_background);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUserRightSheetTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_sheet_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getUserRightSheetTitleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_sheet_title_layout);
            this.LLIZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final boolean getHasClickShowMore() {
        return this.LLJIJIL;
    }

    public final void h0(View view) {
        ((TuxIconView) view.findViewById(R.id.b8t)).setIconRes(R.raw.icon_chevron_up);
        ((TuxIconView) view.findViewById(R.id.b8t)).setTintColorRes(R.attr.a1p);
        C03DZ.LIZJ(view.findViewById(R.id.fmj));
        C786410Ut5.I7(new AjS40S0200000_1(this, view, 54), view.findViewById(R.id.e0y));
    }

    public final void i0(View view) {
        ((TuxIconView) view.findViewById(R.id.b8t)).setIconRes(R.raw.icon_chevron_down);
        ((TuxIconView) view.findViewById(R.id.b8t)).setTintColorRes(R.attr.a1p);
        C03DZ.LIZ(view.findViewById(R.id.fmj));
        C786410Ut5.I7(new AjS40S0200000_1(this, view, 55), view.findViewById(R.id.e0y));
    }

    public final void setBackground(Image image) {
        if (image != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT imageUrlModel = image.toImageUrlModel();
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
            c1331670kl3LIZLLL.LJJI(getUserRightSheetBackgroundFromXml());
            C786410Ut5.h3(c1331670kl3LIZLLL);
            setBackgroundResource(R.drawable.b9q);
            getBackground().setAlpha(8);
            return;
        }
        C03DZ.LIZ(getUserRightSheetBackgroundFromXml());
    }

    public final void setColor(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        setBackgroundResource(R.drawable.b9p);
                        getBackground().setAlpha(8);
                        return;
                    }
                    return;
                }
                setBackgroundResource(R.drawable.b9q);
                getBackground().setAlpha(8);
                return;
            }
            setBackgroundResource(R.drawable.b9o);
            getBackground().setAlpha(8);
        }
    }

    public final void setDescContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setDescContainerLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJ = constraintLayout;
    }

    public final void setHasClickShowMore(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setHeaderBackgroundImageFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setIcon(Icon icon) {
        Image icon2;
        if (C1744700vVE.LJ(getContext(), null)) {
            if (icon != null) {
                icon2 = icon.getIconDark();
            } else {
                return;
            }
        } else if (icon == null) {
            return;
        } else {
            icon2 = icon.getIcon();
        }
        if (icon2 != null) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT imageUrlModel = icon2.toImageUrlModel();
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
            c1331670kl3LIZLLL.LJJI(getIconFromXml());
            C786410Ut5.h3(c1331670kl3LIZLLL);
            C03DZ.LIZJ(getIconFromXml());
        }
    }

    public final void setIconFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setPureDescFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setShowMoreContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setUserRightSheetBackgroundFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setUserRightSheetTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUserRightSheetTitleLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLIZ = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail r14, final boolean r15) {
        /*
            r13 = this;
            java.lang.Boolean r0 = r14.descExpand
            if (r0 == 0) goto L6a
            boolean r11 = r0.booleanValue()
        L8:
            java.lang.Boolean r0 = r14.showChevron
            r3 = 0
            if (r0 == 0) goto L68
            boolean r10 = r0.booleanValue()
        L11:
            java.lang.Integer r5 = r14.expandDescCount
            r7 = r13
            if (r5 == 0) goto L66
            int r1 = r5.intValue()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc> r0 = r14.userRightDesc
            if (r0 == 0) goto L64
            int r0 = r0.size()
        L22:
            if (r1 >= r0) goto L66
            boolean r0 = r7.LLJIJIL
            if (r0 != 0) goto L66
            r6 = 1
        L29:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc> r0 = r14.userRightDesc
            boolean r0 = X.C756302xN.LIZ(r0)
            r2 = 8
            r9 = r15
            if (r0 == 0) goto L71
            android.widget.LinearLayout r0 = r7.getDescContainerFromXml()
            X.C786410Ut5.LJZL(r3, r0)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc> r0 = r14.userRightDesc
            if (r0 == 0) goto L78
            java.util.Iterator r4 = r0.iterator()
            r8 = 0
        L44:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r12 = r4.next()
            int r1 = r8 + 1
            if (r8 < 0) goto L6c
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc r12 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc) r12
            if (r6 == 0) goto L60
            if (r5 == 0) goto L60
            int r0 = r5.intValue()
            if (r8 < r0) goto L60
        L5e:
            r8 = r1
            goto L44
        L60:
            r7.e0(r8, r9, r10, r11, r12)
            goto L5e
        L64:
            r0 = 0
            goto L22
        L66:
            r6 = 0
            goto L29
        L68:
            r10 = 0
            goto L11
        L6a:
            r11 = 1
            goto L8
        L6c:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L71:
            android.widget.LinearLayout r0 = r7.getDescContainerFromXml()
            X.C786410Ut5.LJZL(r2, r0)
        L78:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L98
            android.widget.LinearLayout r0 = r7.getShowMoreContainerFromXml()
            X.C786410Ut5.LJZL(r3, r0)
            android.widget.LinearLayout r1 = r7.getShowMoreContainerFromXml()
            X.03EM r0 = new X.03EM
            r0.<init>()
            X.C786410Ut5.I7(r0, r1)
            return
        L98:
            android.widget.LinearLayout r0 = r7.getShowMoreContainerFromXml()
            X.C786410Ut5.LJZL(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l9b.u0.j0(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail, boolean):void");
    }

    public final void l0(String str, boolean z) {
        if (str != null) {
            if (z) {
                C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), getPureDescFromXml());
            }
            getPureDescFromXml().setText(str);
            C03DZ.LIZJ(getPureDescFromXml());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[PHI: r3
      0x0013: PHI (r3v3 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r3v1 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r3v4 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:34:0x00f8, B:6:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9b.u0.n0(com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon, java.lang.Integer):void");
    }

    public u0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new a();
        C786410Ut5.Sd(R.layout.au1, C786410Ut5.ne(context), this);
    }

    public final void s0(TuxTextView tuxTextView, String str, String str2) {
        if (str == null) {
            return;
        }
        if (C1744700vVE.LJ(getContext(), null)) {
            str = str2;
        }
        if (str != null) {
            try {
                if (str.length() != 0 && str.charAt(0) != '#') {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        Integer numValueOf = Integer.valueOf(Color.parseColor(str));
        if (numValueOf != null) {
            tuxTextView.setTextColor(numValueOf.intValue());
        }
    }

    public final void p0(Integer num, String str, String str2, String str3) {
        if (str != null) {
            getUserRightSheetTitleFromXml().setText(str);
        }
        if (num != null) {
            if (num.intValue() == 0) {
                getUserRightSheetTitleFromXml().setTuxFont(103);
            } else if (num.intValue() == 1) {
                getUserRightSheetTitleFromXml().setTuxFont(102);
            }
        }
        s0(getUserRightSheetTitleFromXml(), str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(int r9, boolean r10, boolean r11, boolean r12, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc r13) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9b.u0.e0(int, boolean, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc):void");
    }
}
