package com.bytedance.android.livesdk.billboard.ui.cell;

import X.AbstractC1119550fEv;
import X.C006A;
import X.C0JBN;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C13LP;
import X.C1546210qL5;
import X.C439101nJ;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import java.util.Map;
import webcast.data.host_board.ImageStyle;
import webcast.data.host_board.Padding;
import webcast.data.host_board.TextStyle;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BillboardPowerCell<T extends AbstractC1119550fEv> extends PowerCell<T> {
    public int N5(T t) {
        return t.LL.alignment;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        LinearLayout linearLayout;
        int i;
        View view = this.itemView;
        Padding padding = t.LL.padding;
        int iLIZ4 = 0;
        if (padding != null) {
            iLIZ = C439101nJ.LIZ(padding.paddingLeft);
        } else {
            iLIZ = 0;
        }
        Padding padding2 = t.LL.padding;
        if (padding2 != null) {
            iLIZ2 = C439101nJ.LIZ(padding2.paddingTop);
        } else {
            iLIZ2 = 0;
        }
        Padding padding3 = t.LL.padding;
        if (padding3 != null) {
            iLIZ3 = C439101nJ.LIZ(padding3.paddingRight);
        } else {
            iLIZ3 = 0;
        }
        Padding padding4 = t.LL.padding;
        if (padding4 != null) {
            iLIZ4 = C439101nJ.LIZ(padding4.paddingBottom);
        }
        view.setPadding(iLIZ, iLIZ2, iLIZ3, iLIZ4);
        View view2 = this.itemView;
        if ((view2 instanceof LinearLayout) && (linearLayout = (LinearLayout) view2) != null) {
            int iN5 = N5(t);
            if (iN5 != 1) {
                if (iN5 != 2) {
                    i = 8388627;
                } else {
                    i = 17;
                }
            } else {
                i = 8388629;
            }
            linearLayout.setGravity(i);
        } else {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C786410Ut5.I7(new AbS698S0100000_17(t, 1, 42), this.itemView);
    }

    public static void I5(C0JBN c0jbn, ImageStyle imageStyle) {
        if (imageStyle != null) {
            if (imageStyle.round) {
                c0jbn.LJIIJJI(Boolean.TRUE);
                return;
            }
            int i = imageStyle.radius;
            if (i > 0) {
                C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                Integer numValueOf = Integer.valueOf(i);
                c1546210qL5.getClass();
                c0jbn.LJIJI(Float.valueOf(C1546210qL5.LIZ(numValueOf)));
                return;
            }
            C1546210qL5 c1546210qL52 = C1546210qL5.LIZ;
            Integer numValueOf2 = Integer.valueOf(imageStyle.radiusTopLeft);
            c1546210qL52.getClass();
            c0jbn.LJ(new float[]{C1546210qL5.LIZ(numValueOf2), C1546210qL5.LIZ(Integer.valueOf(imageStyle.radiusTopRight)), C1546210qL5.LIZ(Integer.valueOf(imageStyle.radiusBottomRight)), C1546210qL5.LIZ(Integer.valueOf(imageStyle.radiusBottomLeft))});
        }
    }

    public final void L5(TuxTextView tuxTextView, TextStyle textStyle) {
        C006A c006aLIZJ;
        Integer numJJ1;
        Context context;
        Integer numGA;
        C006A c006aLIZJ2 = null;
        if (textStyle != null) {
            String str = textStyle.textFont;
            if (str != null) {
                try {
                    c006aLIZJ = C1161920gLG.LIZJ(IHostTux.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c006aLIZJ = null;
                }
                IHostTux iHostTux = (IHostTux) c006aLIZJ;
                if (iHostTux != null && (numJJ1 = iHostTux.JJ1(str)) != null) {
                    tuxTextView.setTuxFont(numJJ1.intValue());
                }
            }
            String str2 = textStyle.textColor;
            if (str2 != null && (context = getContext()) != null) {
                try {
                    c006aLIZJ2 = C1161920gLG.LIZJ(IHostTux.class);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                IHostTux iHostTux2 = (IHostTux) c006aLIZJ2;
                if (iHostTux2 != null && (numGA = iHostTux2.gA(context, str2)) != null) {
                    tuxTextView.setTextColor(numGA.intValue());
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        AbstractC1119550fEv abstractC1119550fEv = (AbstractC1119550fEv) interfaceC1891350zJl;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (objLJJJLL != null && objLJJJLL.equals("CONTENT_SAME")) {
            return;
        }
        onBindItemView(abstractC1119550fEv);
    }
}
