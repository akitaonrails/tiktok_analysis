package com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider;

import X.AbstractC1203660hQa;
import X.C01GW;
import X.C0CAN;
import X.C118300cf;
import X.C1558520qew;
import X.C2255108sX;
import X.C430110Gtl;
import X.C452501pT;
import X.InterfaceC1203630hQX;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS45S0100000_18;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.PoiSlashPostsTriggerLine;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS126S0101000_18;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSlashVideoListPostsTriggerLineProvider extends AbstractC1203660hQa {
    public final LifecycleOwner LIZIZ;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZJ;
    public final InterfaceC665370Q7z LIZLLL;
    public final C0CAN LJ;
    public final PoiSlashPostsTriggerLine LJFF;
    public int LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public InterfaceC1203630hQX LJIIIZ;
    public int LJIIJ;

    public final ViewOnAttachStateChangeListenerC20604515jv LIZLLL() {
        IPoiPostsAutoPlayAbility iPoiPostsAutoPlayAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZLLL;
        if (interfaceC665370Q7z == null || (iPoiPostsAutoPlayAbility = (IPoiPostsAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiPostsAutoPlayAbility.class, null)) == null) {
            return null;
        }
        return iPoiPostsAutoPlayAbility.Hx1();
    }

    public final InterfaceC1203630hQX[] LJFF() {
        return (InterfaceC1203630hQX[]) this.LJIIIIZZ.getValue();
    }

    public final InterfaceC1203630hQX[] LJI() {
        return (InterfaceC1203630hQX[]) this.LJII.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1193590hAL
    public final void init() {
        final C118300cf c118300cf = new C118300cf();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZLLL;
        if (interfaceC665370Q7z != null) {
            ContainerEventDispatcher$PageScrollCallBackAbility containerEventDispatcher$PageScrollCallBackAbility = new ContainerEventDispatcher$PageScrollCallBackAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider.init.1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void oq(int i) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
                public final void bq(int i) {
                    PoiSlashVideoListPostsTriggerLineProvider poiSlashVideoListPostsTriggerLineProvider = PoiSlashVideoListPostsTriggerLineProvider.this;
                    poiSlashVideoListPostsTriggerLineProvider.LJIIJ = 0;
                    C118300cf c118300cf2 = c118300cf;
                    int i2 = c118300cf2.element;
                    if (i2 == 0) {
                        c118300cf2.element = i;
                        return;
                    }
                    int i3 = i - i2;
                    c118300cf2.element = i;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = poiSlashVideoListPostsTriggerLineProvider.LIZJ;
                    int i4 = 1;
                    if (viewOnAttachStateChangeListenerC20604515jv != null && !viewOnAttachStateChangeListenerC20604515jv.canScrollVertically(-1)) {
                        if (i3 <= 0) {
                            i4 = -1;
                        }
                        PoiSlashVideoListPostsTriggerLineProvider poiSlashVideoListPostsTriggerLineProvider2 = PoiSlashVideoListPostsTriggerLineProvider.this;
                        poiSlashVideoListPostsTriggerLineProvider2.LIZJ(poiSlashVideoListPostsTriggerLineProvider2.LJI);
                        PoiSlashVideoListPostsTriggerLineProvider.this.LJI = i4;
                        return;
                    }
                    PoiSlashVideoListPostsTriggerLineProvider.this.LJ.LIZ(Integer.valueOf(i3), new AwS126S0101000_18(i3, PoiSlashVideoListPostsTriggerLineProvider.this, 3));
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ContainerEventDispatcher$PageScrollCallBackAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, containerEventDispatcher$PageScrollCallBackAbility, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (!(invocationHandler instanceof C2255108sX)) {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                    ((C2255108sX) invocationHandler).LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(containerEventDispatcher$PageScrollCallBackAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(ContainerEventDispatcher$PageScrollCallBackAbility.class.getClassLoader(), new Class[]{ContainerEventDispatcher$PageScrollCallBackAbility.class}, c2255108sX);
                    if (objNewProxyInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.PageScrollCallBackAbility");
                    }
                    C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, ContainerEventDispatcher$PageScrollCallBackAbility.class, null, null);
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLIZLLL = LIZLLL();
        if (viewOnAttachStateChangeListenerC20604515jvLIZLLL != null) {
            viewOnAttachStateChangeListenerC20604515jvLIZLLL.addOnScrollListener(new AsS45S0100000_18(this, 5));
        }
        PoiSlashPostsTriggerLine poiSlashPostsTriggerLine = this.LJFF;
        if (poiSlashPostsTriggerLine.LJIIIIZZ) {
            poiSlashPostsTriggerLine.LIZLLL();
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZJ;
        if (!(viewOnAttachStateChangeListenerC20604515jv instanceof ViewOnAttachStateChangeListenerC20604515jv) || viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        poiSlashPostsTriggerLine.LJIIIZ = viewOnAttachStateChangeListenerC20604515jv;
        poiSlashPostsTriggerLine.LIZLLL();
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(poiSlashPostsTriggerLine, 834);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = poiSlashPostsTriggerLine.LJIIIZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null || viewOnAttachStateChangeListenerC20604515jv2.getHeight() <= 0) {
            C430110Gtl.LIZIZ(poiSlashPostsTriggerLine.LJIIIZ, new AwS560S0100000_16(awS560S0100000_16, 833));
        } else {
            awS560S0100000_16.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[LOOP:3: B:78:0x0144->B:79:0x0146, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181 A[LOOP:4: B:85:0x017f->B:86:0x0181, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r13) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider.LIZJ(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1203630hQX LJ(X.InterfaceC1203630hQX[] r10, X.InterfaceC1203630hQX[] r11) {
        /*
            r9 = this;
            X.0hQX[] r8 = r9.LJI()
            int r7 = r8.length
            r6 = 0
            r5 = 0
            r4 = 0
        L8:
            r3 = 1
            if (r5 >= r7) goto L30
            r2 = r8[r5]
            int r1 = r4 + 1
            X.0hQX[] r0 = r9.LJFF()
            r0 = r0[r4]
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L2c
            r1 = r10[r6]
            if (r1 != 0) goto L23
            r1 = r11[r3]
        L21:
            if (r1 == 0) goto L2b
        L23:
            boolean r0 = r1.t()
            if (r0 != 0) goto L2b
            r1 = r11[r3]
        L2b:
            return r1
        L2c:
            int r5 = r5 + 1
            r4 = r1
            goto L8
        L30:
            r1 = r10[r3]
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider.LJ(X.0hQX[], X.0hQX[]):X.0hQX");
    }

    public final void LJII(int i, int i2) {
        if (Math.abs(i) > 30) {
            LIZIZ(null);
        } else {
            if (this.LJIIJ == 2) {
                return;
            }
            LIZJ(i2);
        }
    }

    public PoiSlashVideoListPostsTriggerLineProvider(LifecycleOwner lifecycleOwner, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZLLL = interfaceC665370Q7z;
        C0CAN c0can = new C0CAN();
        this.LJ = c0can;
        this.LJFF = new PoiSlashPostsTriggerLine(lifecycleOwner, interfaceC665370Q7z, LIZLLL(), c0can);
        this.LJI = 1;
        this.LJII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(344));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(343));
    }
}
