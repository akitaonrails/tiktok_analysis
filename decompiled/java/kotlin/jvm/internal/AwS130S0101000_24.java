package kotlin.jvm.internal;

import X.AbstractC1584410rKh;
import X.C01EU;
import X.C09AY;
import X.C0N3M;
import X.C1567810qtv;
import X.C1567840qty;
import X.C1567900qu4;
import X.C1572110r0r;
import X.C1572540r1Y;
import X.C1573030r2L;
import X.C1573100r2S;
import X.C1593440rZG;
import X.C1593450rZH;
import X.C1609400rz0;
import X.C1609410rz1;
import X.C1618380sDU;
import X.C1623606Xi;
import X.C1816080xMM;
import X.C291001Au;
import X.C438170HGd;
import X.C438180HGe;
import X.C627660Ojc;
import X.InterfaceC1583870rJp;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarImageAssem;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS130S0101000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        C1567900qu4 c1567900qu4 = (C1567900qu4) obj;
        int i = awS130S0101000_24.i1;
        String aid = ((Aweme) awS130S0101000_24.l0).getAid();
        if (aid == null) {
            aid = "";
        }
        return C1567900qu4.LIZ(c1567900qu4, null, false, null, null, null, new C1567840qty(i, aid), null, null, null, 479);
    }

    public static final Object invoke$1(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        AbstractC1584410rKh abstractC1584410rKhLIZIZ = ((TopTabProtocol) obj).LJI().LIZIZ();
        if (abstractC1584410rKhLIZIZ != null) {
            abstractC1584410rKhLIZIZ.LJFF(awS130S0101000_24.i1, (Fragment) awS130S0101000_24.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        C1567900qu4 c1567900qu4 = (C1567900qu4) obj;
        return C1567900qu4.LIZ(c1567900qu4, C627660Ojc.LIZ(c1567900qu4.LL, null, null, null, (List) awS130S0101000_24.l0, 7), false, null, null, null, null, new C291001Au(new C0N3M(awS130S0101000_24.i1, null)), null, null, 446);
    }

    public static final Object invoke$3(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        C1567810qtv c1567810qtv = (C1567810qtv) obj;
        int i = awS130S0101000_24.i1;
        String aid = ((Aweme) awS130S0101000_24.l0).getAid();
        if (aid == null) {
            aid = "";
        }
        return C1567810qtv.LIZ(c1567810qtv, null, false, null, null, new C1567840qty(i, aid), 15);
    }

    public static final Object invoke$4(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        C1609400rz0 c1609400rz0 = (C1609400rz0) obj;
        c1609400rz0.LIZIZ = false;
        c1609400rz0.LJI = Integer.valueOf((int) (awS130S0101000_24.i1 * 1.2f));
        c1609400rz0.LJFF = Integer.valueOf(awS130S0101000_24.i1);
        c1609400rz0.LJIIIIZZ = false;
        c1609400rz0.LJIIJJI = Boolean.FALSE;
        c1609400rz0.LJIIJ = new C1609410rz1(false, null, (C438180HGe) ((SocialAvatarImageAssem) awS130S0101000_24.l0).LLJJI.getValue(), (C438170HGd) ((SocialAvatarImageAssem) awS130S0101000_24.l0).LLJJIII.getValue(), null, 50);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        InterfaceC1583870rJp interfaceC1583870rJp = (InterfaceC1583870rJp) obj;
        return new C1593440rZG(awS130S0101000_24.i1, ((C1593450rZH) awS130S0101000_24.l0).LIZ, new AwS568S0100000_24(interfaceC1583870rJp, 1665), new AwS568S0100000_24(interfaceC1583870rJp, 1666));
    }

    public static final Object invoke$6(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        return C1573030r2L.LIZ((C1573030r2L) obj, null, null, null, new C291001Au(new C1573100r2S((User) awS130S0101000_24.l0, awS130S0101000_24.i1)), null, null, null, 495);
    }

    public static final Object invoke$7(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        GetGuestSettingResponse.ResponseData responseData = (GetGuestSettingResponse.ResponseData) obj;
        if (responseData != null) {
            C01EU.LIZ = true;
            ((DistributeStatusViewModel) awS130S0101000_24.l0).setState(new AwS130S0101000_24(responseData, awS130S0101000_24.i1, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        return C1816080xMM.LIZ((C1816080xMM) obj, null, ((GetGuestSettingResponse.ResponseData) awS130S0101000_24.l0).flowDistribute, awS130S0101000_24.i1, null, null, new C1623606Xi(new C1618380sDU()), null, 89);
    }

    public static final Object invoke$9(AwS130S0101000_24 awS130S0101000_24, Object obj) {
        boolean z;
        C1572540r1Y c1572540r1Y = (C1572540r1Y) obj;
        if (((CollabEditPageContainerViewModel) awS130S0101000_24.l0).getState().LL.LIZ.LIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return C1572540r1Y.LIZ(c1572540r1Y, null, new C291001Au(new C1572110r0r(z, awS130S0101000_24.i1)), null, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(int i, C1593450rZH c1593450rZH, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1593450rZH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(int i, Fragment fragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(int i, Aweme aweme, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(int i, SocialAvatarImageAssem socialAvatarImageAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = socialAvatarImageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(DistributeStatusViewModel distributeStatusViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = distributeStatusViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(GetGuestSettingResponse.ResponseData responseData, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = responseData;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(User user, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = user;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(CollabEditPageContainerViewModel collabEditPageContainerViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = collabEditPageContainerViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S0101000_24(List list, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.i1 = i;
    }
}
