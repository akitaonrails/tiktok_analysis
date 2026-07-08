package com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.manager;

import X.C01GW;
import X.C0PEM;
import X.C1345305Oh;
import X.C1345405Oi;
import X.C1554960qZC;
import X.C1770006wU;
import X.C1DFB;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1337505Lh;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1725106pF;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.service.service.IMAFListManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class MAFListManager implements IMAFListManager {
    public static List<MAFIMUser> LIZIZ = new ArrayList();
    public static boolean LIZJ = true;
    public static final C01GW<MAFListManager> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1345405Oi());
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(544));

    @Override // com.ss.android.ugc.aweme.im.service.service.IMAFListManager
    public final void LJ() {
        InterfaceC1337505Lh interfaceC1337505Lh;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", InterfaceC1337505Lh.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (interfaceC1337505Lh = (InterfaceC1337505Lh) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return;
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), c1dfb.plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 3)), null, new C1345305Oh(this, interfaceC1337505Lh, null), 2);
    }

    public final List<MAFIMUser> LJFF() {
        ArrayList arrayList;
        if (LIZJ) {
            ArrayList arrayList2 = new ArrayList();
            try {
                arrayList2.addAll(((InterfaceC1725106pF) this.LIZ.getValue()).LJJI());
                return arrayList2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return arrayList2;
            }
        }
        synchronized (this) {
            try {
                List<MAFIMUser> list = LIZIZ;
                arrayList = new ArrayList();
                for (MAFIMUser mAFIMUser : list) {
                    if (mAFIMUser.getFollowStatus() != 2) {
                        arrayList.add(mAFIMUser);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMAFListManager
    public final void LIZ(IMUser iMUser) {
        MAFIMUser mAFIMUserPrevious;
        synchronized (this) {
            try {
                List<MAFIMUser> list = LIZIZ;
                ListIterator<MAFIMUser> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        mAFIMUserPrevious = listIterator.previous();
                        if (Intrinsics.LJFF(mAFIMUserPrevious.getUid(), iMUser.getUid())) {
                            break;
                        }
                    } else {
                        mAFIMUserPrevious = null;
                        break;
                    }
                }
                MAFIMUser mAFIMUser = mAFIMUserPrevious;
                if (mAFIMUser != null) {
                    mAFIMUser.setNickName(iMUser.getNickName());
                    mAFIMUser.setUniqueId(iMUser.getUniqueId());
                    mAFIMUser.setAvatarThumb(iMUser.getAvatarThumb());
                    mAFIMUser.setAvatarMedium(iMUser.getAvatarMedium());
                    mAFIMUser.setFollowStatus(iMUser.getFollowStatus());
                    mAFIMUser.setShareStatus(iMUser.getShareStatus());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMAFListManager
    public final MAFIMUser LIZIZ(String str) {
        if (str != null) {
            if (!LIZIZ.isEmpty()) {
                for (MAFIMUser mAFIMUser : LIZIZ) {
                    if (Intrinsics.LJFF(str, mAFIMUser.getUid())) {
                        return mAFIMUser;
                    }
                }
            }
            if (LIZJ) {
                try {
                    return ((InterfaceC1725106pF) this.LIZ.getValue()).LJJ(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMAFListManager
    public final boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        if (!LIZIZ.isEmpty()) {
            Iterator<MAFIMUser> it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, it2.next().getUid())) {
                    return true;
                }
            }
        }
        if (!LIZJ) {
            return false;
        }
        try {
            if (((InterfaceC1725106pF) this.LIZ.getValue()).LJJIIJZLJL(str) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMAFListManager
    public final void LIZLLL(int i, String str) {
        MAFIMUser mAFIMUserPrevious;
        try {
            synchronized (this) {
                try {
                    List<MAFIMUser> list = LIZIZ;
                    ListIterator<MAFIMUser> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            mAFIMUserPrevious = listIterator.previous();
                            if (Intrinsics.LJFF(mAFIMUserPrevious.getUid(), str)) {
                                break;
                            }
                        } else {
                            mAFIMUserPrevious = null;
                            break;
                        }
                    }
                    MAFIMUser mAFIMUser = mAFIMUserPrevious;
                    if (mAFIMUser != null) {
                        mAFIMUser.setFollowStatus(i);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
    }
}
