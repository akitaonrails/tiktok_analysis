package com.bytedance.ies.ugc.ttkvstorageimpl;

import X.C04TD;
import X.C2188841AlW;
import X.InterfaceC2188871AlZ;
import X.InterfaceC586170Myt;
import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class UserAccountImpl implements IUserAccount {
    public final ConcurrentHashMap<Integer, WeakReference<InterfaceC2188871AlZ>> LIZ = new ConcurrentHashMap<>();
    public String LIZIZ;
    public final IAccountService LIZJ;

    public static IUserAccount LIZIZ() {
        Object objLIZ = C04TD.LIZ(IUserAccount.class, false);
        if (objLIZ != null) {
            return (IUserAccount) objLIZ;
        }
        if (C04TD.LJJIJIIJIL == null) {
            synchronized (IUserAccount.class) {
                if (C04TD.LJJIJIIJIL == null) {
                    C04TD.LJJIJIIJIL = new UserAccountImpl();
                }
            }
        }
        return C04TD.LJJIJIIJIL;
    }

    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount
    public final void LIZ() {
        C2188841AlW.LIZIZ(this.LIZIZ);
    }

    public UserAccountImpl() {
        this.LIZIZ = CardStruct.IStatusCode.DEFAULT;
        InterfaceC586170Myt interfaceC586170Myt = new InterfaceC586170Myt() { // from class: X.1AlY
            /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
            @Override // X.InterfaceC586170Myt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onAccountResult(int r5, boolean r6, int r7, com.ss.android.ugc.aweme.profile.model.User r8) {
                /*
                    r4 = this;
                    com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r2 = r4.LL
                    if (r8 == 0) goto L15
                    java.lang.String r1 = r8.getUid()
                    if (r1 == 0) goto L15
                    r2.getClass()
                    java.lang.String r0 = "0"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L17
                L15:
                    java.lang.String r1 = "unlogin"
                L17:
                    r2.LIZIZ = r1
                    com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r4.LL
                    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.1AlZ>> r0 = r0.LIZ
                    java.util.Set r0 = r0.keySet()
                    java.util.Iterator r3 = r0.iterator()
                L25:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L5d
                    java.lang.Object r0 = r3.next()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r2 = r0.intValue()
                    com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r4.LL
                    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.1AlZ>> r1 = r0.LIZ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    java.lang.Object r0 = r1.get(r0)
                    java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
                    if (r0 == 0) goto L51
                    java.lang.Object r0 = r0.get()
                    X.1AlZ r0 = (X.InterfaceC2188871AlZ) r0
                    if (r0 == 0) goto L51
                    r0.LIZIZ()
                    goto L25
                L51:
                    com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r4.LL
                    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.1AlZ>> r1 = r0.LIZ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    r1.remove(r0)
                    goto L25
                L5d:
                    com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r4.LL
                    java.lang.String r0 = r0.LIZIZ
                    X.C2188841AlW.LIZIZ(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2188861AlY.onAccountResult(int, boolean, int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        };
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LIZJ = iAccountService;
        String curUserId = iAccountService.LJIIJ().getCurUserId();
        this.LIZIZ = Intrinsics.LJFF(curUserId, CardStruct.IStatusCode.DEFAULT) ? "unlogin" : curUserId;
        iAccountService.LJIILL(interfaceC586170Myt);
    }

    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount
    public final String getCurrentUid() {
        return this.LIZIZ;
    }
}
