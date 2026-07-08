package com.google.protobuf;

import X.AbstractC19922812xG;
import X.AbstractC19929412yK;
import X.AbstractC19929512yL;
import X.AbstractC19933412yy;
import X.AnonymousClass1334;
import X.AnonymousClass1336;
import X.C19917512wP;
import X.C19926112xn;
import X.C19926312xp;
import X.C19928512yB;
import X.C19928612yC;
import X.C19929012yG;
import X.C19930612yW;
import X.C19930812yY;
import X.C19939112zt;
import X.C199423130z;
import X.C2188811AlT;
import X.InterfaceC19361110or;
import X.InterfaceC19925612xi;
import X.InterfaceC19928112y7;
import X.InterfaceC19929112yH;
import X.InterfaceC19933112yv;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class c0 extends AbstractC19929512yL<C19939112zt> {
    public static final long LIZ;

    static {
        try {
            LIZ = C19917512wP.LJIJ(AbstractC19933412yy.class.getDeclaredField("extensions"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new IllegalStateException("Unable to lookup extension field offset", th);
        }
    }

    @Override // X.AbstractC19929512yL
    public final int LIZ(Map.Entry<?, ?> entry) {
        return ((C19939112zt) entry.getKey()).getNumber();
    }

    @Override // X.AbstractC19929512yL
    public final C19928612yC<C19939112zt> LIZJ(Object obj) {
        return (C19928612yC) C19917512wP.LJIILL(LIZ, obj);
    }

    @Override // X.AbstractC19929512yL
    public final C19928612yC<C19939112zt> LIZLLL(Object obj) {
        C19928612yC<C19939112zt> c19928612yCLIZJ = LIZJ(obj);
        if (c19928612yCLIZJ.LIZIZ) {
            C19928612yC c19928612yCClone = c19928612yCLIZJ.clone();
            C19917512wP.LJJI(LIZ, obj, c19928612yCClone);
            return c19928612yCClone;
        }
        return c19928612yCLIZJ;
    }

    @Override // X.AbstractC19929512yL
    public final boolean LJ(InterfaceC19925612xi interfaceC19925612xi) {
        return interfaceC19925612xi instanceof AbstractC19933412yy;
    }

    @Override // X.AbstractC19929512yL
    public final void LJFF(Object obj) {
        LIZJ(obj).LJIJJ();
    }

    @Override // X.AbstractC19929512yL
    public final void LJIIIZ(InterfaceC19361110or interfaceC19361110or, Map.Entry<?, ?> entry) {
        C19939112zt c19939112zt = (C19939112zt) entry.getKey();
        if (c19939112zt.LJJLJ()) {
            int i = 0;
            switch (AnonymousClass1336.LIZ[c19939112zt.LJJIJL().ordinal()]) {
                case 1:
                    C19928512yB.LJIILLIIL(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 2:
                    C19928512yB.LJIJJ(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 3:
                    C19928512yB.LJJ(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 4:
                    C19928512yB.LJJIIZI(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 5:
                    C19928512yB.LJIL(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 6:
                    C19928512yB.LJIJI(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 7:
                    C19928512yB.LJIJ(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 8:
                    C19928512yB.LJIILJJIL(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C19928512yB.LJJIIZ(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    C19928512yB.LJJIFFI(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    C19928512yB.LJJII(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C19928512yB.LJJIII(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    C19928512yB.LJJIIJ(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 14:
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((C199423130z) it2.next()).getNumber()));
                    }
                    C19928512yB.LJIL(c19939112zt.getNumber(), arrayList, interfaceC19361110or, c19939112zt.isPacked());
                    break;
                case 15:
                    C19928512yB.LJIILL(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or);
                    break;
                case 16:
                    C19928512yB.LJJIIJZLJL(c19939112zt.getNumber(), (List) entry.getValue(), interfaceC19361110or);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    int number = c19939112zt.getNumber();
                    List list2 = (List) entry.getValue();
                    Class<?> cls = C19928512yB.LIZ;
                    if (list2 != null && !list2.isEmpty()) {
                        C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
                        c19929012yG.getClass();
                        while (i < list2.size()) {
                            c19929012yG.LIZ.LJJIFFI(number, (InterfaceC19925612xi) ListProtector.get(list2, i));
                            i++;
                        }
                        break;
                    }
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    int number2 = c19939112zt.getNumber();
                    List list3 = (List) entry.getValue();
                    Class<?> cls2 = C19928512yB.LIZ;
                    if (list3 != null && !list3.isEmpty()) {
                        C19929012yG c19929012yG2 = (C19929012yG) interfaceC19361110or;
                        c19929012yG2.getClass();
                        while (i < list3.size()) {
                            c19929012yG2.LIZ.LJJIIJ(number2, (InterfaceC19925612xi) ListProtector.get(list3, i));
                            i++;
                        }
                        break;
                    }
                    break;
            }
        }
        switch (AnonymousClass1336.LIZ[c19939112zt.LJJIJL().ordinal()]) {
            case 1:
                C19929012yG c19929012yG3 = (C19929012yG) interfaceC19361110or;
                c19929012yG3.LIZJ(((Double) entry.getValue()).doubleValue(), c19939112zt.getNumber());
                break;
            case 2:
                C19929012yG c19929012yG4 = (C19929012yG) interfaceC19361110or;
                c19929012yG4.LJIIIIZZ(((Float) entry.getValue()).floatValue(), c19939112zt.getNumber());
                break;
            case 3:
                ((C19929012yG) interfaceC19361110or).LJIIJJI(c19939112zt.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((C19929012yG) interfaceC19361110or).LJIJJLI(c19939112zt.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((C19929012yG) interfaceC19361110or).LJIIJ(c19939112zt.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((C19929012yG) interfaceC19361110or).LJI(c19939112zt.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((C19929012yG) interfaceC19361110or).LJ(c19939112zt.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((C19929012yG) interfaceC19361110or).LIZ(c19939112zt.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                ((C19929012yG) interfaceC19361110or).LJIJJ(c19939112zt.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                ((C19929012yG) interfaceC19361110or).LJIILL(c19939112zt.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                ((C19929012yG) interfaceC19361110or).LJIILLIIL(c19939112zt.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                ((C19929012yG) interfaceC19361110or).LJIIZILJ(c19939112zt.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                ((C19929012yG) interfaceC19361110or).LJIJ(c19939112zt.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((C19929012yG) interfaceC19361110or).LJIIJ(c19939112zt.getNumber(), ((C199423130z) entry.getValue()).getNumber());
                break;
            case 15:
                ((C19929012yG) interfaceC19361110or).LIZIZ(c19939112zt.getNumber(), (AbstractC19922812xG) entry.getValue());
                break;
            case 16:
                ((C19929012yG) interfaceC19361110or).LIZ.LJJIJ(c19939112zt.getNumber(), (String) entry.getValue());
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                ((C19929012yG) interfaceC19361110or).LIZ.LJJIFFI(c19939112zt.getNumber(), (InterfaceC19925612xi) entry.getValue());
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                ((C19929012yG) interfaceC19361110or).LIZ.LJJIIJ(c19939112zt.getNumber(), (InterfaceC19925612xi) entry.getValue());
                break;
        }
    }

    @Override // X.AbstractC19929512yL
    public final Object LIZIZ(C19926312xp c19926312xp, InterfaceC19925612xi interfaceC19925612xi, int i) {
        return ((y) c19926312xp).LJFF.get(new C19930812yY(((InterfaceC19933112yv) interfaceC19925612xi).getDescriptorForType(), i));
    }

    @Override // X.AbstractC19929512yL
    public final void LJII(InterfaceC19929112yH interfaceC19929112yH, Object obj, C19926312xp c19926312xp, C19928612yC<C19939112zt> c19928612yC) {
        C19930612yW c19930612yW = (C19930612yW) obj;
        C19926312xp c19926312xp2 = C19926312xp.LIZIZ;
        c19928612yC.LJIL(c19930612yW.LIZ, new C19926112xn(c19930612yW.LIZIZ, c19926312xp, interfaceC19929112yH.LJIILL()));
    }

    @Override // X.AbstractC19929512yL
    public final void LJIIIIZZ(AbstractC19922812xG abstractC19922812xG, Object obj, C19926312xp c19926312xp, C19928612yC<C19939112zt> c19928612yC) {
        C19930612yW c19930612yW = (C19930612yW) obj;
        c19930612yW.LIZIZ.newBuilderForType().buildPartial();
        C19926312xp c19926312xp2 = C19926312xp.LIZIZ;
        c19928612yC.LJIL(c19930612yW.LIZ, new C19926112xn(c19930612yW.LIZIZ, c19926312xp, abstractC19922812xG));
    }

    @Override // X.AbstractC19929512yL
    public final <UT, UB> UB LJI(Object obj, InterfaceC19929112yH interfaceC19929112yH, Object obj2, C19926312xp c19926312xp, C19928612yC<C19939112zt> c19928612yC, UB ub, AbstractC19929412yK<UT, UB> abstractC19929412yK) {
        Object objLJIIJ;
        Object objLJIIIIZZ;
        ArrayList arrayList;
        C19930612yW c19930612yW = (C19930612yW) obj2;
        int number = c19930612yW.LIZ.getNumber();
        if (c19930612yW.LIZ.LJJLJ() && c19930612yW.LIZ.isPacked()) {
            switch (AnonymousClass1336.LIZ[c19930612yW.LIZ.LJJIJL().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJIJLIJ(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJIJI(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJI(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJIIZ(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LIZLLL(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJIJIIJI(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJIJIL(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJIIJ(arrayList);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJJJ(arrayList);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJIL(arrayList);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LIZJ(arrayList);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LIZIZ(arrayList);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    arrayList = new ArrayList();
                    interfaceC19929112yH.LJIILIIL(arrayList);
                    break;
                case 14:
                    ArrayList arrayList2 = new ArrayList();
                    interfaceC19929112yH.LJJIZ(arrayList2);
                    arrayList = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Integer) it2.next()).intValue();
                        C199423130z c199423130zLIZJ = c19930612yW.LIZ.LJIJ().LIZJ(iIntValue);
                        if (c199423130zLIZJ != null) {
                            arrayList.add(c199423130zLIZJ);
                        } else {
                            ub = (UB) C19928512yB.LJIILIIL(obj, number, iIntValue, ub, abstractC19929412yK);
                        }
                    }
                    break;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Type cannot be packed: ");
                    sbLIZ.append(c19930612yW.LIZ.LJJIJL());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            c19928612yC.LJIL(c19930612yW.LIZ, arrayList);
            return ub;
        }
        if (c19930612yW.LIZ.LJJIJL() == AnonymousClass1334.ENUM) {
            int iLJJIJ = interfaceC19929112yH.LJJIJ();
            objLJIIJ = c19930612yW.LIZ.LJIJ().LIZJ(iLJJIJ);
            if (objLJIIJ == null) {
                return (UB) C19928512yB.LJIILIIL(obj, number, iLJJIJ, ub, abstractC19929412yK);
            }
        } else {
            switch (AnonymousClass1336.LIZ[c19930612yW.LIZ.LJJIJL().ordinal()]) {
                case 1:
                    objLJIIJ = Double.valueOf(interfaceC19929112yH.readDouble());
                    break;
                case 2:
                    objLJIIJ = Float.valueOf(interfaceC19929112yH.readFloat());
                    break;
                case 3:
                    objLJIIJ = Long.valueOf(interfaceC19929112yH.LJII());
                    break;
                case 4:
                    objLJIIJ = Long.valueOf(interfaceC19929112yH.LJIILLIIL());
                    break;
                case 5:
                    objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJJIJ());
                    break;
                case 6:
                    objLJIIJ = Long.valueOf(interfaceC19929112yH.LJIJJLI());
                    break;
                case 7:
                    objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJIIJJI());
                    break;
                case 8:
                    objLJIIJ = Boolean.valueOf(interfaceC19929112yH.LJIIIIZZ());
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    objLJIIJ = Integer.valueOf(interfaceC19929112yH.LIZ());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJJIFFI());
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    objLJIIJ = Long.valueOf(interfaceC19929112yH.LJJIJIIJIL());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJIILJJIL());
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    objLJIIJ = Long.valueOf(interfaceC19929112yH.LJJJI());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objLJIIJ = interfaceC19929112yH.LJIILL();
                    break;
                case 16:
                    objLJIIJ = interfaceC19929112yH.LJIIL();
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    objLJIIJ = interfaceC19929112yH.LJJIIZI(c19930612yW.LIZIZ.getClass(), c19926312xp);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    objLJIIJ = interfaceC19929112yH.LJIIJ(c19930612yW.LIZIZ.getClass(), c19926312xp);
                    break;
                default:
                    objLJIIJ = null;
                    break;
            }
        }
        if (c19930612yW.LIZ.LJJLJ()) {
            c19928612yC.LIZ(c19930612yW.LIZ, objLJIIJ);
            return ub;
        }
        int i = AnonymousClass1336.LIZ[c19930612yW.LIZ.LJJIJL().ordinal()];
        if ((i == 17 || i == 18) && (objLJIIIIZZ = c19928612yC.LJIIIIZZ(c19930612yW.LIZ)) != null) {
            InterfaceC19928112y7 builder = ((InterfaceC19925612xi) objLJIIIIZZ).toBuilder();
            builder.mergeFrom((InterfaceC19925612xi) objLJIIJ);
            objLJIIJ = builder.buildPartial();
        }
        c19928612yC.LJIL(c19930612yW.LIZ, objLJIIJ);
        return ub;
    }
}
