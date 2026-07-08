package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C1369440ljy;
import X.C1371430lnB;
import X.C1377850lxX;
import X.C20642515q3;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class CopyLinkChannel extends PureLogicChannel {
    public final boolean LL;

    public CopyLinkChannel() {
        this(false);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJIII() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJLI() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "copy";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131847874);
    }

    public CopyLinkChannel(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        int i;
        int i2;
        if (context != null) {
            if (this.LL) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_link;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bo);
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                if (z) {
                    i2 = 12;
                } else {
                    i2 = 24;
                }
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            if (z) {
                i = R.raw.icon_color_link_square;
            } else {
                i = R.raw.icon_color_link_circle;
            }
            c419910GdJ2.LIZ = i;
            return c419910GdJ2.LIZ(context);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        String strLIZIZ;
        String str = c1371430lnB.LIZJ;
        boolean z = false;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1371430lnB.LIZJ);
            sbLIZ.append(' ');
            sbLIZ.append(c1371430lnB.LIZLLL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c1371430lnB.LIZLLL;
        }
        View viewLIZIZ = null;
        C1377850lxX c1377850lxX = new C1377850lxX(0 == true ? 1 : 0, z, 7);
        Cert certLIZ = C1369440ljy.LIZ();
        if (c0m7y != null) {
            viewLIZIZ = c0m7y.LIZIZ();
        }
        c1377850lxX.LIZ(strLIZIZ, context, certLIZ, viewLIZIZ);
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        if (abstractC1375550ltp instanceof C1371430lnB) {
            return LJJIFFI((C1371430lnB) abstractC1375550ltp, context, c0m7y);
        }
        return false;
    }
}
