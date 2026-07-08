package com.ss.android.ugc.aweme.avatar.advance.service;

import X.C1608610rxj;
import X.EnumC2006907tb;
import X.InterfaceC1609110ryX;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarExtServiceImpl implements IAvatarExtService {
    @Override // com.ss.android.ugc.aweme.avatar.advance.service.IAvatarExtService
    public final InterfaceC1609110ryX LIZIZ() {
        return new InterfaceC1609110ryX() { // from class: X.0ryV
            @Override // X.InterfaceC1609110ryX
            public final C1609510rzB LIZ(AvatarComponentView avatarComponentView, C1608620rxk c1608620rxk) {
                C1609510rzB c1609510rzB = new C1609510rzB(avatarComponentView, c1608620rxk);
                c1609510rzB.LIZ = new InterfaceC1609140rya() { // from class: X.0ryW
                    public String LIZ;

                    @Override // X.InterfaceC1609140rya
                    public final void LIZLLL(User user) {
                        String uid;
                        boolean z = user instanceof User;
                        String uid2 = null;
                        if (z && user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        if (!Intrinsics.LJFF(uid, this.LIZ)) {
                            if (z && user != null) {
                                uid2 = user.getUid();
                            }
                            this.LIZ = uid2;
                        }
                    }
                };
                return c1609510rzB;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.avatar.advance.service.IAvatarExtService
    public final void LIZ(EnumC2006907tb enumC2006907tb, InterfaceC1609110ryX interfaceC1609110ryX) {
        Map<EnumC2006907tb, InterfaceC1609110ryX> map = C1608610rxj.LIZ;
        if (C1608610rxj.LIZJ.contains(enumC2006907tb) && !C1608610rxj.LIZIZ.contains(enumC2006907tb)) {
            C1608610rxj.LIZ.put(enumC2006907tb, interfaceC1609110ryX);
        }
    }
}
