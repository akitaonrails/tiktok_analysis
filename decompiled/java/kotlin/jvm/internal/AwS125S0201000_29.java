package kotlin.jvm.internal;

import X.C09AY;
import X.C19719212De;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS125S0201000_29 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS125S0201000_29 awS125S0201000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PlaylistCollectionCell) awS125S0201000_29.l0).I5((MixInfo) awS125S0201000_29.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS125S0201000_29.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS125S0201000_29 awS125S0201000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C19719212De) awS125S0201000_29.l0).LIZIZ(awS125S0201000_29.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS125S0201000_29.i2) | 1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0201000_29(C19719212De c19719212De, Object obj, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c19719212De;
        this.l1 = obj;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0201000_29(PlaylistCollectionCell playlistCollectionCell, MixInfo mixInfo, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = playlistCollectionCell;
        this.l1 = mixInfo;
        this.i2 = i;
    }
}
