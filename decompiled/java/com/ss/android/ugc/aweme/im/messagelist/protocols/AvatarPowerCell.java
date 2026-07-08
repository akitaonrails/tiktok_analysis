package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C01GW;
import X.C069P;
import X.C0I31;
import X.C0ZK1;
import X.C0ZKF;
import X.C1319910kS5;
import X.C1322090kVb;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C13LP;
import X.C1518605x2;
import X.C1518805x4;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1320380kSq;
import X.InterfaceC1891350zJl;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes7.dex */
public final class AvatarPowerCell extends PowerCell<C1518605x2> {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ck7;
    }

    public AvatarPowerCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 150));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS558S0100000_14(this, 518));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LL.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.bottomMargin = 0;
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public final void I5(boolean z) {
        C1319910kS5 c1319910kS5;
        C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.LL.getValue()).getHierarchy();
        if (z) {
            final boolean zLIZLLL = C426750GoL.LIZLLL(this.itemView.getContext());
            c1319910kS5 = new C1319910kS5(new Drawable(zLIZLLL) { // from class: X.0GRy
                public final boolean LIZ;
                public final Paint LIZIZ;
                public final Path LIZJ;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -2;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                }

                {
                    this.LIZ = zLIZLLL;
                    Paint paint = new Paint();
                    paint.setColor(0);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                    this.LIZIZ = paint;
                    this.LIZJ = new Path();
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    float fWidth;
                    float fWidth2 = getBounds().width() / 2.0f;
                    float fWidth3 = getBounds().width() / 2.0f;
                    float fHeight = getBounds().height() / 2.0f;
                    this.LIZJ.reset();
                    Path path = this.LIZJ;
                    boolean z2 = this.LIZ;
                    Double dValueOf = Double.valueOf(11.25d);
                    if (z2) {
                        fWidth = getBounds().width() + C418440Gaw.LIZIZ(dValueOf);
                    } else {
                        fWidth = -C418440Gaw.LIZIZ(dValueOf);
                    }
                    path.addCircle(fWidth, fHeight, C418440Gaw.LIZIZ(Double.valueOf(3.75d)) + fWidth2, Path.Direction.CW);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(this.LIZJ);
                    } else {
                        canvas.clipPath(this.LIZJ, Region.Op.DIFFERENCE);
                    }
                    canvas.drawCircle(fWidth3, fHeight, fWidth2, this.LIZIZ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZIZ.setAlpha(0);
                }
            }, InterfaceC1320380kSq.LJI);
        } else {
            c1319910kS5 = null;
        }
        c1331070kk5.LJIJ(c1319910kS5, 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1518605x2 c1518605x2) {
        String str = c1518605x2.LL;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
        if (iMUserLJIIL == null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LL.getValue(), Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1006);
        } else {
            ((IDMAvatarLoader) this.LLILLJJLI.getValue()).LJ(iMUserLJIIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            IAccessibilityUtils.LIZ.getClass();
            IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
            if (iAccessibilityUtilsLIZ != null) {
                iAccessibilityUtilsLIZ.LIZ((C1322110kVd) this.LL.getValue(), iMUserLJIIL);
            }
        }
        I5(c1518605x2.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1518805x4 c1518805x4;
        C1518605x2 c1518605x2 = (C1518605x2) interfaceC1891350zJl;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if ((objLJJJLZIJ instanceof C1518805x4) && (c1518805x4 = (C1518805x4) objLJJJLZIJ) != null) {
            if (c1518805x4.LIZ) {
                I5(c1518605x2.LLILLJJLI);
                return;
            }
            return;
        }
        onBindItemView(c1518605x2);
    }
}
