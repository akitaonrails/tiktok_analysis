package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C0I0B;
import X.C0XQ7;
import X.C1351440lGw;
import X.C1365220ldA;
import X.C1368370liF;
import X.C1369870lkf;
import X.C1370970lmR;
import X.C1394720mOk;
import X.C1401030mYv;
import X.C1401320mZO;
import X.C1896750zST;
import X.C384050F3z;
import X.C418440Gaw;
import X.InterfaceC1367800lhK;
import X.InterfaceC1370310llN;
import X.InterfaceC1526205yG;
import android.os.Bundle;
import android.view.View;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS160S0101000_21 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS160S0101000_21 awS160S0101000_21) {
        return Integer.valueOf(((C1351440lGw) awS160S0101000_21.l0).LIZLLL(awS160S0101000_21.i1));
    }

    public static final Object invoke$1(AwS160S0101000_21 awS160S0101000_21) {
        ((C1394720mOk) awS160S0101000_21.l0).setIconRes(awS160S0101000_21.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS160S0101000_21 awS160S0101000_21) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIZILJ((InterfaceC1370310llN) awS160S0101000_21.l0);
        C1369870lkf.LJIIIIZZ(awS160S0101000_21.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS160S0101000_21 awS160S0101000_21) {
        String str;
        IInteractiveService iInteractiveService = (IInteractiveService) PluggableExtentionKt.pluggableSpi$default(IInteractiveService.class, false, false, false, 14, null);
        if (iInteractiveService != null) {
            int i = awS160S0101000_21.i1;
            int awemeType = ((Aweme) awS160S0101000_21.l0).getAwemeType();
            ShareOperationInfo shareOperationInfo = ((Aweme) awS160S0101000_21.l0).getShareOperationInfo();
            if (shareOperationInfo != null) {
                str = shareOperationInfo.incentiveOperationType;
            } else {
                str = null;
            }
            String aid = ((Aweme) awS160S0101000_21.l0).getAid();
            if (aid == null) {
                aid = "";
            }
            iInteractiveService.LIZLLL(C1896750zST.LIZ(i, awemeType, str, aid));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS160S0101000_21 awS160S0101000_21) {
        String str;
        IInteractiveService.LIZ.getClass();
        IInteractiveService iInteractiveService = (IInteractiveService) ServiceManager.get().getService(IInteractiveService.class);
        int i = awS160S0101000_21.i1;
        int awemeType = ((Aweme) awS160S0101000_21.l0).getAwemeType();
        ShareOperationInfo shareOperationInfo = ((Aweme) awS160S0101000_21.l0).getShareOperationInfo();
        if (shareOperationInfo != null) {
            str = shareOperationInfo.incentiveOperationType;
        } else {
            str = null;
        }
        String aid = ((Aweme) awS160S0101000_21.l0).getAid();
        if (aid == null) {
            aid = "";
        }
        iInteractiveService.LIZIZ(C1896750zST.LIZ(i, awemeType, str, aid));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS160S0101000_21 awS160S0101000_21) {
        C1365220ldA c1365220ldA = C1365220ldA.LIZ;
        int i = awS160S0101000_21.i1 + 1;
        Function0 function0 = (Function0) awS160S0101000_21.l0;
        c1365220ldA.getClass();
        C1365220ldA.LIZLLL(i, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS160S0101000_21 awS160S0101000_21) {
        IMContact iMContact;
        String curUserId;
        C1368370liF c1368370liF = (C1368370liF) awS160S0101000_21.l0;
        Map<String, String> map = c1368370liF.LLJJIJI;
        int i = awS160S0101000_21.i1;
        if (!c1368370liF.LLJILJILJ.AQ2() && (iMContact = c1368370liF.LLJJJIL) != null) {
            int iIndexOf = 0;
            if (((iMContact instanceof MAFIMUser) || (iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) && iMContact != null) {
                Bundle bundle = c1368370liF.LLJILLL.extras;
                List list = (List) c1368370liF.LLJILJILJ.LLJILJIL.getValue();
                if (list != null) {
                    iIndexOf = list.indexOf(iMContact);
                }
                bundle.putInt("rank_num", iIndexOf);
                IInternalShareApi.LIZ.getClass();
                InterfaceC1367800lhK interfaceC1367800lhKLIZJ = C1370970lmR.LIZ().LIZJ();
                SharePackage sharePackage = c1368370liF.LLJILLL;
                boolean z = c1368370liF.LLJJ;
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                    curUserId = "";
                }
                interfaceC1367800lhKLIZJ.LJIIJ(iMContact, i, sharePackage, z, curUserId, C0I0B.LJFF.LIZIZ(), map);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS160S0101000_21 awS160S0101000_21) {
        C1401320mZO c1401320mZO;
        List<InterfaceC1526205yG> list;
        Music music;
        if (!((MusicDetailAwemeListFragment) awS160S0101000_21.l0).isDetached()) {
            try {
                MusicDetailAwemeListFragment musicDetailAwemeListFragment = (MusicDetailAwemeListFragment) awS160S0101000_21.l0;
                C1401030mYv c1401030mYv = musicDetailAwemeListFragment.LLLLLLLZIL;
                c1401030mYv.LIZIZ = awS160S0101000_21.i1;
                c1401030mYv.LIZ = true;
                c1401030mYv.LIZJ = musicDetailAwemeListFragment.LLLF;
                MusicDetail musicDetail = musicDetailAwemeListFragment.LLLLIILL;
                String idStr = null;
                if (musicDetail != null && (music = musicDetail.music) != null) {
                    idStr = music.getIdStr();
                }
                c1401030mYv.LIZLLL = idStr;
                T t = ((MusicDetailAwemeListFragment) awS160S0101000_21.l0).LLILZ.LL;
                if ((t instanceof C1401320mZO) && (c1401320mZO = (C1401320mZO) t) != null && (list = c1401320mZO.mNotifyListeners) != null) {
                    Iterator<InterfaceC1526205yG> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess();
                    }
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS160S0101000_21 awS160S0101000_21) {
        int i = awS160S0101000_21.i1;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ny);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LJII = i;
        c384050F3z.LJI = i;
        return c384050F3z.LIZ(((View) awS160S0101000_21.l0).getContext());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.i1 = 0;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(int i, Aweme aweme, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS160S0101000_21(int i, int i2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(C1351440lGw c1351440lGw, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1351440lGw;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(C1368370liF c1368370liF, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1368370liF;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(InterfaceC1370310llN interfaceC1370310llN, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC1370310llN;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(C1394720mOk c1394720mOk, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1394720mOk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0101000_21(MusicDetailAwemeListFragment musicDetailAwemeListFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = musicDetailAwemeListFragment;
        this.i1 = i;
    }
}
