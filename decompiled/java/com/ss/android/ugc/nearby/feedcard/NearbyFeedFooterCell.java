package com.ss.android.ugc.nearby.feedcard;

import X.AbstractC2211791BhR;
import X.AbstractC426530Gnz;
import X.C036E;
import X.C1205260hTA;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C13LE;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C431260Gvc;
import X.C444920HcY;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C844470XAv;
import Y.ACListenerS153S0100000_18;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.nearby.container.NearbyLifecycleManager;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedFooterCell extends PowerLoadingCell {
    public final Context LL = this.itemView.getContext();
    public C1390410mHn LLILLJJLI;
    public TuxTextView LLILLL;
    public final C736950SvV LLILZ;
    public final boolean LLILZIL;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILLJJLI;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            String string = this.LL.getString(2131837926);
            String string2 = this.LL.getString(2131837927);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append('\n');
            sbLIZ.append(string2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, string2, 0, false, 6);
            int length = string2.length() + iLJJJ;
            SpannableString spannableString = new SpannableString(strLIZIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.LL);
            C786410Ut5.p2(spannableString, numLIZJ != null ? new ForegroundColorSpan(numLIZJ.intValue()) : null, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0hNH
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C19EG c19eg;
                    C1205150hSz c1205150hSz = C1205150hSz.LIZ;
                    Activity activityLIZIZ = C737910Sx3.LIZIZ(this.LL.itemView.getContext());
                    if (activityLIZIZ instanceof C19EG) {
                        c19eg = (C19EG) activityLIZIZ;
                    } else {
                        c19eg = null;
                    }
                    c1205150hSz.getClass();
                    C1205150hSz.LIZIZ(c19eg);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ, length, 33);
            tuxTextView3.setText(spannableString);
        }
        C2211631BhB.LIZLLL(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hSl
            public Function0<String> LJFF;
            public final boolean LJ = true;
            public final C1205000hSk LJI = new InterfaceC2211931Bhf() { // from class: X.0hSk
                @Override // X.InterfaceC2211931Bhf
                public final void LIZ(View view, String str) {
                    C1205260hTA.LIZ.getClass();
                    C1205260hTA.LJIIJJI("page_with_contents");
                }
            };

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIILJJIL() {
                return this.LJ;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0hSk] */
            {
                this.LJFF = new AwS562S0100000_18(this, 2359);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        View view = this.itemView;
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILLJJLI;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 133), view);
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String string = C036E.LIZ.LIZIZ() ? view.getContext().getString(2131837928) : view.getContext().getString(2131837929);
            tuxTextView2.setText(string);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        if (this.LLILZIL && ((NearbyFeedSharedViewModel) this.LLILZ.getValue()).LLJJI && NearbyLifecycleManager.LLILLL) {
            ((NearbyFeedSharedViewModel) this.LLILZ.getValue()).LLJJI = false;
            return;
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILLJJLI;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        if (NearbyLifecycleManager.LLILLL) {
            NearbyFeedSharedViewModel nearbyFeedSharedViewModel = (NearbyFeedSharedViewModel) this.LLILZ.getValue();
            if (nearbyFeedSharedViewModel.LLJILJILJ) {
                return;
            }
            nearbyFeedSharedViewModel.LLJILJILJ = true;
            C1205260hTA c1205260hTA = C1205260hTA.LIZ;
            Long lValueOf = Long.valueOf(nearbyFeedSharedViewModel.LLILZIL);
            Integer numValueOf = Integer.valueOf(nearbyFeedSharedViewModel.CQ2());
            c1205260hTA.getClass();
            C1205260hTA.LJIIIZ(numValueOf, lValueOf, "double_column");
        }
    }

    public NearbyFeedFooterCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(632);
        this.LLILZ = new C736950SvV(C13LE.LIZ(NearbyFeedSharedViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(801), null, null, null);
        this.LLILZIL = ComplianceServiceProvider.LJI().LJIIJ(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ds8, viewGroup, false);
        this.LLILLJJLI = (C1390410mHn) viewTd.findViewById(R.id.gb5);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.zmm);
        return viewTd;
    }
}
