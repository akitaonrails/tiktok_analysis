package kotlin.jvm.internal;

import X.C03IT;
import X.C098200Yq;
import X.C09AY;
import X.C0ID3;
import X.C1087110eOb;
import X.C123100dR;
import X.C12BX;
import X.C12BY;
import X.C1331660kl2;
import X.C1390410mHn;
import X.C1664420tPk;
import X.C1697810uHb;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C194350111w;
import X.C194396113q;
import X.C19754712Qv;
import X.C19772512Xr;
import X.C20632315oP;
import X.C415650GRn;
import X.C438620HHw;
import X.C786410Ut5;
import X.C817600W5m;
import X.EnumC339980DUm;
import X.EnumC438630HHx;
import X.InterfaceC1631620sYq;
import X.RunnableC514501zT;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS46S0600000_29 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS46S0600000_29 awS46S0600000_29, Object obj, Object obj2, Object obj3) {
        String effectId;
        String strLIZ;
        Object next;
        String strLIZ2;
        Collection collection = (Collection) obj;
        if (collection != null) {
            ((List) awS46S0600000_29.l0).addAll(collection);
        }
        List list = (List) awS46S0600000_29.l0;
        if ((list instanceof Collection) && list.isEmpty()) {
            C194350111w c194350111w = (C194350111w) awS46S0600000_29.l1;
            c194350111w.LLJI.LIZIZ(new AwS490S0200000_29(c194350111w, (C194350111w) awS46S0600000_29.l0, (List<List<Effect>>) 4));
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((List) it2.next()).isEmpty()) {
                    ((C194350111w) awS46S0600000_29.l1).LLJILLL = false;
                    break;
                }
            }
            C194350111w c194350111w2 = (C194350111w) awS46S0600000_29.l1;
            c194350111w2.LLJI.LIZIZ(new AwS490S0200000_29(c194350111w2, (C194350111w) awS46S0600000_29.l0, (List<List<Effect>>) 4));
        }
        ((ArrayList) ((C194350111w) awS46S0600000_29.l1).LLJILJILJ).clear();
        ArrayList arrayList = new ArrayList();
        List list2 = (List) awS46S0600000_29.l0;
        C194350111w c194350111w3 = (C194350111w) awS46S0600000_29.l1;
        Function2 function2 = (Function2) awS46S0600000_29.l4;
        C19754712Qv c19754712Qv = (C19754712Qv) awS46S0600000_29.l2;
        Iterator it3 = list2.iterator();
        int i = 0;
        while (true) {
            C20632315oP c20632315oP = null;
            if (it3.hasNext()) {
                Object next2 = it3.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new ArrayList());
                    ((ArrayList) c194350111w3.LLJILJILJ).add(new ArrayList());
                    for (Object obj4 : (List) next2) {
                        if (!((Boolean) function2.invoke(obj4, c19754712Qv)).booleanValue()) {
                            ((List) ListProtector.get(arrayList, i)).add(obj4);
                        }
                        ((List) ListProtector.get(c194350111w3.LLJILJILJ, i)).add(obj4);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C1087110eOb c1087110eOb = ((C194350111w) awS46S0600000_29.l1).LLIZ;
                if (c1087110eOb == null) {
                    c1087110eOb = null;
                }
                C786410Ut5.LLILZIL(c1087110eOb, 0);
                C1390410mHn c1390410mHn = ((C194350111w) awS46S0600000_29.l1).LLIZLLLIL;
                if (c1390410mHn == null) {
                    c1390410mHn = null;
                }
                C786410Ut5.LLLZZIL(c1390410mHn, 8);
                ((ArrayList) ((C194350111w) awS46S0600000_29.l1).LLJILJIL).clear();
                ((ArrayList) ((C194350111w) awS46S0600000_29.l1).LLJILJIL).addAll(arrayList);
                C1846060y8i c1846060y8i = ((C194350111w) awS46S0600000_29.l1).LLILLJJLI;
                if (c1846060y8i == null) {
                    c1846060y8i = null;
                }
                if (c1846060y8i.getTabCount() != arrayList.size()) {
                    C194350111w c194350111w4 = (C194350111w) awS46S0600000_29.l1;
                    C1846060y8i c1846060y8i2 = c194350111w4.LLILLJJLI;
                    if (c1846060y8i2 == null) {
                        c1846060y8i2 = null;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = ((List) it4.next()).iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next = it5.next();
                                if (C123100dR.LIZ(C194396113q.LIZ((Effect) next))) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        Effect effect = (Effect) next;
                        if (effect != null) {
                            strLIZ2 = C194396113q.LIZ(effect);
                        } else {
                            strLIZ2 = null;
                        }
                        C1846060y8i c1846060y8i3 = c194350111w4.LLILLJJLI;
                        if (c1846060y8i3 == null) {
                            c1846060y8i3 = null;
                        }
                        C1845940y8W c1845940y8WLJIIIZ = c1846060y8i3.LJIIIZ();
                        c1845940y8WLJIIIZ.LIZIZ(strLIZ2);
                        c1846060y8i2.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i2.LLILZLL.size(), c1846060y8i2.LLILZLL.isEmpty());
                    }
                }
                Effect effect2 = (Effect) awS46S0600000_29.l3;
                Iterator it6 = arrayList.iterator();
                loop4: while (it6.hasNext()) {
                    for (Effect effect3 : (List) it6.next()) {
                        String strLIZ3 = C194396113q.LIZ(effect3);
                        String effectId2 = effect3.getEffectId();
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        if (Intrinsics.LJFF(effectId2, effectId) && ((strLIZ = C194396113q.LIZ(effect2)) == null || strLIZ.length() == 0)) {
                            C194396113q.LIZIZ(effect2, strLIZ3, null, null);
                            break loop4;
                        }
                    }
                }
                C1846060y8i c1846060y8i4 = ((C194350111w) awS46S0600000_29.l1).LLILLJJLI;
                if (c1846060y8i4 == null) {
                    c1846060y8i4 = null;
                }
                c1846060y8i4.setBackground(null);
                C1664420tPk c1664420tPk = ((C194350111w) awS46S0600000_29.l1).LLILZ;
                if (c1664420tPk == null) {
                    c1664420tPk = null;
                }
                C19754712Qv c19754712Qv2 = (C19754712Qv) awS46S0600000_29.l2;
                Effect effect4 = (Effect) awS46S0600000_29.l3;
                c1664420tPk.getClass();
                c1664420tPk.LL = new ArrayList(arrayList);
                c1664420tPk.LLILLJJLI = c19754712Qv2;
                c1664420tPk.LLILLL = effect4;
                C1664420tPk c1664420tPk2 = ((C194350111w) awS46S0600000_29.l1).LLILZ;
                if (c1664420tPk2 == null) {
                    c1664420tPk2 = null;
                }
                c1664420tPk2.notifyDataSetChanged();
                C20632315oP c20632315oP2 = ((C194350111w) awS46S0600000_29.l1).LLILLL;
                if (c20632315oP2 != null) {
                    c20632315oP = c20632315oP2;
                }
                HandlerHook.viewPost(c20632315oP, new RunnableC514501zT((Function1) awS46S0600000_29.l5, arrayList, 39));
                return Unit.LIZ;
            }
        }
    }

    public static final Object invoke$1(AwS46S0600000_29 awS46S0600000_29, Object obj, Object obj2, Object obj3) {
        Object c098200Yq;
        C415650GRn c415650GRn = (C415650GRn) obj;
        Bitmap bitmap = (Bitmap) obj2;
        int i = ((C817600W5m) awS46S0600000_29.l0).taskStatus;
        Object obj4 = null;
        if (i == EnumC339980DUm.IN_PROGRESS.getValue()) {
            C438620HHw c438620HHw = C438620HHw.LIZ;
            EnumC438630HHx enumC438630HHx = EnumC438630HHx.LOADING;
            AwS41S0600000_29 awS41S0600000_29 = new AwS41S0600000_29(c415650GRn, bitmap, (C12BX) awS46S0600000_29.l2, (View) awS46S0600000_29.l3, (Function1) awS46S0600000_29.l4, (ImageView) awS46S0600000_29.l5, 0);
            c438620HHw.getClass();
            File fileLIZ = C438620HHw.LIZ(enumC438630HHx);
            if (fileLIZ != null) {
                try {
                    c098200Yq = BitmapFactory.decodeFile(fileLIZ.getAbsolutePath());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj4 = c098200Yq;
                }
                awS41S0600000_29.invoke(obj4);
            } else {
                C1331660kl2.LJIIIZ(enumC438630HHx.getBackupUrl()).LJJII(new C19772512Xr(awS41S0600000_29, 2));
            }
        } else if (i == EnumC339980DUm.FINISHED.getValue()) {
            List<String> list = ((C817600W5m) awS46S0600000_29.l0).avatarUrls;
            AwS41S0600000_29 awS41S0600000_292 = new AwS41S0600000_29(c415650GRn, bitmap, (C12BX) awS46S0600000_29.l2, (View) awS46S0600000_29.l3, (Function1) awS46S0600000_29.l4, (ImageView) awS46S0600000_29.l5, 1);
            if (list == null) {
                awS41S0600000_292.invoke(null);
            } else {
                C1331660kl2.LJIIJ(new C03IT(list)).LJJIIJ(new C0ID3(awS41S0600000_292, 6));
            }
        } else {
            C12BY.LIZJ((User) awS46S0600000_29.l1, null, new AwS41S0600000_29(c415650GRn, bitmap, (C12BX) awS46S0600000_29.l2, (View) awS46S0600000_29.l3, (Function1) awS46S0600000_29.l4, (ImageView) awS46S0600000_29.l5, 2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0600000_29(C817600W5m c817600W5m, User user, C12BX c12bx, View view, AwS382S0200000_16 awS382S0200000_16, ImageView imageView, int i) {
        super(3);
        this.$t = i;
        this.l0 = c817600W5m;
        this.l1 = user;
        this.l2 = c12bx;
        this.l3 = view;
        this.l4 = awS382S0200000_16;
        this.l5 = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS46S0600000_29(List list, List<List<Effect>> list2, C194350111w c194350111w, C19754712Qv c19754712Qv, Effect effect, Function2<? super Effect, ? super C19754712Qv, Boolean> function2, Function1<? super List<List<Effect>>, Unit> function1) {
        super(3);
        this.$t = function1;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c194350111w;
        this.l3 = c19754712Qv;
        this.l4 = effect;
        this.l5 = function2;
    }
}
