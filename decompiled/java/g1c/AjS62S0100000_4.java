package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0DKG;
import X.C0DKH;
import X.C0DMI;
import X.C13LP;
import X.C1737170vJ5;
import X.C1737910vKH;
import X.C2097608Jq;
import X.C339780DTs;
import X.C339790DTt;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AjS62S0100000_4 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS62S0100000_4(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS62S0100000_4 ajS62S0100000_4, View view) {
        Object objLJJJLZIJ;
        if (view != null) {
            C0DKH c0dkh = (C0DKH) ajS62S0100000_4.l0;
            int adapterPosition = c0dkh.getAdapterPosition();
            List<String> list = c0dkh.LLILLJJLI.LIZIZ;
            if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(adapterPosition, list)) != null) {
                C0DKG c0dkg = c0dkh.LLILLJJLI;
                int i = c0dkg.LJ;
                c0dkg.LIZLLL = i;
                c0dkg.LJ = adapterPosition;
                if (i != -1) {
                    c0dkg.LIZ.getAdapter().notifyItemChanged(c0dkh.LLILLJJLI.LIZLLL);
                }
                c0dkh.LLILLJJLI.LIZ.getAdapter().notifyItemChanged(c0dkh.LLILLJJLI.LJ);
                c0dkh.LLILLJJLI.LIZJ.invoke((String) objLJJJLZIJ);
            }
        }
    }

    public static final void LIZ$1(AjS62S0100000_4 ajS62S0100000_4, View view) {
        if (view != null) {
            ((View.OnClickListener) ajS62S0100000_4.l0).onClick(view);
        }
    }

    public static final void LIZ$2(AjS62S0100000_4 ajS62S0100000_4, View view) {
        if (view != null) {
            String strLIZ = C0DMI.LIZ();
            C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
            c1737170vJ5.LIZ = (Activity) ajS62S0100000_4.l0;
            c1737170vJ5.LIZIZ = "personal_homepage";
            c1737170vJ5.LJFF = "profile_create";
            c1737170vJ5.LJI = "ame_aigc_create_button";
            c1737170vJ5.LIZJ = "personal_homepage";
            c1737170vJ5.LIZLLL = "ame_editor";
            c1737170vJ5.LJ = strLIZ;
            C339780DTs.LIZJ(c1737170vJ5, AFwS232S0000000_4.get$arr$(53));
            C339790DTt c339790DTtLIZ = c1737170vJ5.LIZ();
            if (c339790DTtLIZ != null) {
                C1737910vKH.LIZ("ame_aigc_create_button_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", c339790DTtLIZ.LIZIZ), new Pair("ame_enter_from", c339790DTtLIZ.LIZJ), new Pair("is_photo_mode", CardStruct.IStatusCode.DEFAULT), new Pair("shoot_way", c339790DTtLIZ.LJ), new Pair("creation_id", strLIZ)));
            }
        }
    }
}
