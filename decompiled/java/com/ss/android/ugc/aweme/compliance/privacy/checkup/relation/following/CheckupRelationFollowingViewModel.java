package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.following;

import X.C1265610j2V;
import X.C1265620j2W;
import X.C1265630j2X;
import X.InterfaceC1222900hvc;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFollowingViewModel extends BaseCheckupRelationViewModel<C1265630j2X, C1265620j2W> {
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>();
    public final C1265610j2V LLILZIL = new InterfaceC1222900hvc<C1265630j2X, C1265620j2W>() { // from class: X.0j2V
        @Override // X.InterfaceC1222900hvc
        public final Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
            FollowingItemList followingItemList;
            int i;
            C1265630j2X c1265630j2X = (C1265630j2X) obj;
            if (c1265630j2X == null) {
                User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
                String uid = currentUser.getUid();
                String secUid = currentUser.getSecUid();
                if (((AccountUserService) C0XQ7.LJFF()).LIZLLL()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c1265630j2X = new C1265630j2X(0L, 40, 0, EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue(), i, uid, secUid, "", 1);
            }
            this.LIZ.getClass();
            try {
                followingItemList = C19505811Tc.LIZJ.LIZ(c1265630j2X.LIZ, c1265630j2X.LIZIZ, c1265630j2X.LIZJ, c1265630j2X.LIZLLL, c1265630j2X.LJ, c1265630j2X.LJFF, c1265630j2X.LJI, c1265630j2X.LJII, c1265630j2X.LJIIIIZZ, null).LJFF();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                followingItemList = new FollowingItemList();
            }
            this.LIZ.LLILZ.postValue(C2286608xc.LJ(followingItemList.total));
            long j = followingItemList.minTime;
            int i2 = followingItemList.offset;
            String str = followingItemList.nextPageToken;
            return new AbstractC1223200hw6<C1265630j2X>(new C1265630j2X(j, c1265630j2X.LIZLLL, i2, c1265630j2X.LJFF, c1265630j2X.LJI, c1265630j2X.LIZ, c1265630j2X.LIZIZ, str, c1265630j2X.LJIIIIZZ), followingItemList) { // from class: X.0j2W
                public final C1265630j2X LIZ;
                public final FollowingItemList LIZIZ;

                @Override // X.AbstractC1223200hw6
                public final List<C994040byU> LIZ() {
                    List<User> list = this.LIZIZ.items;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<User> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C994040byU(it2.next()));
                    }
                    return arrayList;
                }

                @Override // X.AbstractC1223200hw6
                public final C1265630j2X LIZIZ() {
                    C1265630j2X c1265630j2X2 = this.LIZ;
                    String str2 = c1265630j2X2.LIZ;
                    String str3 = c1265630j2X2.LIZIZ;
                    FollowingItemList followingItemList2 = this.LIZIZ;
                    return new C1265630j2X(followingItemList2.minTime, c1265630j2X2.LIZLLL, followingItemList2.offset, c1265630j2X2.LJFF, c1265630j2X2.LJI, str2, str3, followingItemList2.nextPageToken, c1265630j2X2.LJIIIIZZ);
                }

                @Override // X.AbstractC1223200hw6
                public final boolean LIZJ() {
                    return this.LIZIZ.hasMore;
                }

                {
                    this.LIZ = c1265630j2X;
                    this.LIZIZ = followingItemList;
                }
            };
        }
    };

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel
    public final InterfaceC1222900hvc<C1265630j2X, C1265620j2W> vQ2() {
        return this.LLILZIL;
    }
}
