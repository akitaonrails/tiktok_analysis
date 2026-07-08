package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0DTR;
import X.C0OO7;
import X.C0OOU;
import X.C0OV6;
import X.C0OV7;
import X.C0OVA;
import X.C12ES;
import X.C1383370m6R;
import X.C20642515q3;
import X.C21568919b5;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C619670OSf;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinUnavailableCell extends BulletinBaseCell<C0OO7> {
    public C619670OSf LLJLLL;

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJLLL == null) {
            this.LLJLLL = new C619670OSf((ViewStub) this.itemView.findViewById(R.id.d0c));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJLLL == null) {
            this.LLJLLL = new C619670OSf((ViewStub) this.itemView.findViewById(R.id.d0c));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: a7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OO7 c0oo7) {
        super.onBindItemView(c0oo7);
        C619670OSf c619670OSf = this.LLJLLL;
        if (c619670OSf != null) {
            switch (C0OOU.LIZ[c0oo7.LLIZLLLIL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    C0DTR.LIZIZ(c619670OSf.LIZLLL());
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131828138));
                    break;
                case 4:
                    C12ES.LJIILL(0, c619670OSf.LIZLLL());
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131828135));
                    TuxIconView tuxIconViewLIZLLL = c619670OSf.LIZLLL();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_image_alt_1_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
                    tuxIconViewLIZLLL.setTuxIcon(c419910GdJ);
                    break;
                case 5:
                    C12ES.LJIILL(0, c619670OSf.LIZLLL());
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131828137));
                    TuxIconView tuxIconViewLIZLLL2 = c619670OSf.LIZLLL();
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_camera_x;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a02);
                    tuxIconViewLIZLLL2.setTuxIcon(c419910GdJ2);
                    break;
                case 6:
                    C12ES.LJIILL(0, c619670OSf.LIZLLL());
                    TuxIconView tuxIconViewLIZLLL3 = c619670OSf.LIZLLL();
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_exclamation_mark_triangle_inline;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.a02);
                    tuxIconViewLIZLLL3.setTuxIcon(c419910GdJ3);
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131828140));
                    break;
                case 7:
                    C12ES.LJIILL(0, c619670OSf.LIZLLL());
                    TuxIconView tuxIconViewLIZLLL4 = c619670OSf.LIZLLL();
                    C419910GdJ c419910GdJ4 = new C419910GdJ();
                    c419910GdJ4.LIZ = R.raw.icon_live_wave_fill;
                    c419910GdJ4.LJ = Integer.valueOf(R.attr.a02);
                    tuxIconViewLIZLLL4.setTuxIcon(c419910GdJ4);
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131828139));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C12ES.LJIILL(0, c619670OSf.LIZLLL());
                    c619670OSf.LJFF().setText(C20642515q3.LJI(2131827959));
                    TuxIconView tuxIconViewLIZLLL5 = c619670OSf.LIZLLL();
                    C419910GdJ c419910GdJ5 = new C419910GdJ();
                    c419910GdJ5.LIZ = R.raw.icon_poll_fill_ltr;
                    c419910GdJ5.LJ = Integer.valueOf(R.attr.a02);
                    tuxIconViewLIZLLL5.setTuxIcon(c419910GdJ5);
                    break;
            }
            C12ES.LJIILL(0, c619670OSf.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void N5(C0OVA c0ova, BulletinBaseItem bulletinBaseItem) {
        C0OV6 c0ov6;
        C0OO7 c0oo7 = (C0OO7) bulletinBaseItem;
        C21568919b5 c21568919b5R6 = r6();
        if (c21568919b5R6 != null && (c0ov6 = c0ova.LIZ) != null) {
            c21568919b5R6.setBackground(C0OV7.LIZJ(this.itemView.getContext(), c0ov6, c0oo7.LLJILJIL));
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(c21568919b5R6);
            if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            C786410Ut5.j7(c21568919b5R6, marginLayoutParamsLJI);
            c21568919b5R6.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
    }
}
