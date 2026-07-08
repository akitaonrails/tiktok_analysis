package kotlin.jvm.internal;

import X.C09AY;
import X.C1165690gRL;
import X.C1167470gUD;
import X.C1167550gUL;
import X.C1169160gWw;
import X.C1169640gXi;
import X.C1169820gY0;
import X.C1196140hES;
import X.C1389890mGx;
import X.C1AF0;
import X.C291001Au;
import X.C786410Ut5;
import X.EnumC1201640hNK;
import X.InterfaceC1891350zJl;
import android.content.Intent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS29S0102000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S0102000_18 awS29S0102000_18, Object obj) {
        if (obj != null) {
            return new C1169640gXi(new C291001Au(new C1169820gY0(awS29S0102000_18.i1, awS29S0102000_18.i2, (Intent) awS29S0102000_18.l0)));
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS29S0102000_18 awS29S0102000_18, Object obj) {
        int iLJ;
        long j;
        String strJ4;
        String str;
        C1167470gUD c1167470gUD = (C1167470gUD) obj;
        int iLJ2 = LSPassThroughRecordSizeConfig.DEFAULT;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("playlist_add_videos_threshold", LSPassThroughRecordSizeConfig.DEFAULT);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            iLJ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        long j2 = iLJ;
        C1167550gUL c1167550gULOR = ((AddMultiVideoFragment) awS29S0102000_18.l0).OR();
        if (c1167550gULOR != null) {
            j = c1167550gULOR.LLILZLL;
        } else {
            j = 0;
        }
        int size = (int) (j2 - (j - ((long) c1167470gUD.LLJILJILJ.size())));
        int iMin = Math.min(awS29S0102000_18.i1, size);
        if (awS29S0102000_18.i2 >= iMin) {
            if (!((AddMultiVideoFragment) awS29S0102000_18.l0).VR().LLIZLLLIL) {
                AddMultiVideoFragment addMultiVideoFragment = (AddMultiVideoFragment) awS29S0102000_18.l0;
                addMultiVideoFragment.LLJI = true;
                addMultiVideoFragment.VR().LLIZLLLIL = true;
                int i = 0;
                for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) ((AddMultiVideoFragment) awS29S0102000_18.l0).UR().getState().LJII()) {
                    int i2 = i + 1;
                    if (interfaceC1891350zJl instanceof C1165690gRL) {
                        C1165690gRL c1165690gRL = (C1165690gRL) interfaceC1891350zJl;
                        if (!c1165690gRL.LLILLJJLI) {
                            ((AddMultiVideoFragment) awS29S0102000_18.l0).UR().getState().LJIILJJIL(i, C1165690gRL.LIZ(c1165690gRL, true));
                        }
                    }
                    i = i2;
                }
                if (size <= awS29S0102000_18.i1) {
                    String string = ((AddMultiVideoFragment) awS29S0102000_18.l0).getResources().getString(2131837018);
                    Object[] objArr = new Object[1];
                    try {
                        SettingsManager.LIZLLL().getClass();
                        iLJ2 = SettingsManager.LJ("playlist_add_videos_threshold", LSPassThroughRecordSizeConfig.DEFAULT);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJ(e2);
                    }
                    objArr[0] = Integer.valueOf(iLJ2);
                    strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
                } else {
                    strJ4 = C786410Ut5.j4(((AddMultiVideoFragment) awS29S0102000_18.l0).getResources().getString(2131850530), Arrays.copyOf(new Object[]{Integer.valueOf(awS29S0102000_18.i1)}, 1));
                }
                C1389890mGx c1389890mGx = new C1389890mGx((AddMultiVideoFragment) awS29S0102000_18.l0);
                c1389890mGx.LJIIJ(strJ4);
                c1389890mGx.LJIIJJI();
                ((AddMultiVideoFragment) awS29S0102000_18.l0).VR().LLIZ = false;
                C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                C1167550gUL c1167550gULOR2 = ((AddMultiVideoFragment) awS29S0102000_18.l0).OR();
                String str2 = null;
                if (c1167550gULOR2 != null) {
                    str = c1167550gULOR2.LL;
                } else {
                    str = null;
                }
                C1167550gUL c1167550gULOR3 = ((AddMultiVideoFragment) awS29S0102000_18.l0).OR();
                if (c1167550gULOR3 != null) {
                    str2 = c1167550gULOR3.LLILLL;
                }
                c1169160gWw.getClass();
                C1169160gWw.LIZ(str, str2, "manage_video");
            }
            return Unit.LIZ;
        }
        AddMultiVideoFragment addMultiVideoFragment2 = (AddMultiVideoFragment) awS29S0102000_18.l0;
        if (addMultiVideoFragment2.LLJI) {
            addMultiVideoFragment2.LLJI = false;
            int i3 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) addMultiVideoFragment2.UR().getState().LJII()) {
                int i4 = i3 + 1;
                if (interfaceC1891350zJl2 instanceof C1165690gRL) {
                    C1165690gRL c1165690gRL2 = (C1165690gRL) interfaceC1891350zJl2;
                    if (!c1165690gRL2.LLILZ && !c1165690gRL2.LLILLJJLI) {
                        ((AddMultiVideoFragment) awS29S0102000_18.l0).UR().getState().LJIILJJIL(i3, C1165690gRL.LIZ(c1165690gRL2, false));
                    }
                }
                i3 = i4;
            }
            ((AddMultiVideoFragment) awS29S0102000_18.l0).VR().LLIZ = true;
        }
        if (awS29S0102000_18.i2 < iMin) {
            ((AddMultiVideoFragment) awS29S0102000_18.l0).VR().LLIZLLLIL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS29S0102000_18 awS29S0102000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(((EnumC1201640hNK) awS29S0102000_18.l0).getType(), "revamp response status");
        c1196140hES.LIZIZ(awS29S0102000_18.i1, "revamp response server error_code");
        c1196140hES.LIZJ(awS29S0102000_18.i2, "aweme list size of response");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS29S0102000_18 awS29S0102000_18, Object obj) {
        return C1167470gUD.LIZ((C1167470gUD) obj, null, null, null, (((EditPlaylistViewModel) awS29S0102000_18.l0).LLILZIL + ((long) awS29S0102000_18.i1)) - ((long) awS29S0102000_18.i2), 0, 0, false, null, null, 0, null, null, null, null, null, 32759);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0102000_18(int i, int i2, Intent intent, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0102000_18(EnumC1201640hNK enumC1201640hNK, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = enumC1201640hNK;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0102000_18(EditPlaylistViewModel editPlaylistViewModel, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = editPlaylistViewModel;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0102000_18(AddMultiVideoFragment addMultiVideoFragment, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = addMultiVideoFragment;
        this.i1 = i;
        this.i2 = i2;
    }
}
