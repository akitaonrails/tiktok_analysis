package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower;

import X.C1265470j2H;
import X.C1265480j2I;
import X.C1265530j2N;
import X.InterfaceC1222900hvc;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFollowerViewModel extends BaseCheckupRelationViewModel<C1265530j2N, C1265470j2H> {
    public final C1265480j2I LLILZ = new InterfaceC1222900hvc<C1265530j2N, C1265470j2H>() { // from class: X.0j2I
        @Override // X.InterfaceC1222900hvc
        public final Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
            int i;
            C1265530j2N c1265530j2N = (C1265530j2N) obj;
            if (c1265530j2N == null) {
                User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
                String uid = currentUser.getUid();
                String secUid = currentUser.getSecUid();
                if (((AccountUserService) C0XQ7.LJFF()).LIZLLL()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c1265530j2N = new C1265530j2N(0L, uid, 40, 0, EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue(), i, secUid, "");
            }
            this.LIZ.getClass();
            FollowerItemList followerItemListLJFF = C19505811Tc.LIZJ.LIZIZ(c1265530j2N.LIZ, c1265530j2N.LIZIZ, c1265530j2N.LIZJ, c1265530j2N.LIZLLL, c1265530j2N.LJ, c1265530j2N.LJFF, c1265530j2N.LJI, c1265530j2N.LJII, null).LJFF();
            long j = followerItemListLJFF.minTime;
            int i2 = followerItemListLJFF.offset;
            String str = followerItemListLJFF.nextPageToken;
            return new AbstractC1223200hw6<C1265530j2N>(new C1265530j2N(j, c1265530j2N.LIZ, c1265530j2N.LIZLLL, i2, c1265530j2N.LJFF, c1265530j2N.LJI, c1265530j2N.LIZIZ, str), followerItemListLJFF) { // from class: X.0j2H
                public final C1265530j2N LIZ;
                public final FollowerItemList LIZIZ;

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
                public final C1265530j2N LIZIZ() {
                    C1265530j2N c1265530j2N2 = this.LIZ;
                    String str2 = c1265530j2N2.LIZ;
                    String str3 = c1265530j2N2.LIZIZ;
                    FollowerItemList followerItemList = this.LIZIZ;
                    return new C1265530j2N(followerItemList.minTime, str2, c1265530j2N2.LIZLLL, followerItemList.offset, c1265530j2N2.LJFF, c1265530j2N2.LJI, str3, followerItemList.nextPageToken);
                }

                @Override // X.AbstractC1223200hw6
                public final boolean LIZJ() {
                    return this.LIZIZ.hasMore;
                }

                {
                    this.LIZ = c1265530j2N;
                    this.LIZIZ = followerItemListLJFF;
                }
            };
        }
    };

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel
    public final InterfaceC1222900hvc<C1265530j2N, C1265470j2H> vQ2() {
        return this.LLILZ;
    }
}
