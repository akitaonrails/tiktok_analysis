package com.ss.android.ugc.aweme.sticker.types.multi;

import X.C13BV;
import X.C13LZ;
import X.C1625940sPg;
import X.C1629290sV5;
import X.C1629840sVy;
import X.C1635530sf9;
import X.C1DRG;
import X.EnumC1641470soj;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1629870sW1;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class MultiStickerListViewModel extends StickerListViewModel implements InterfaceC1629870sW1 {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1629870sW1
    public final void wS1(Effect effect) {
        List<String> children = effect.getChildren();
        if (children != null && !children.isEmpty()) {
            this.LLJIJIL.setValue(EnumC1641470soj.NONE);
            Map<String, Effect> mapLJ = this.LL.getStickerRepository().LJFF().LJ();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = children.iterator();
            while (it2.hasNext()) {
                Effect effect2 = mapLJ.get(it2.next());
                if (effect2 != null) {
                    arrayList.add(effect2);
                }
            }
            AQ2(arrayList);
            return;
        }
        this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
        this.LLIZLLLIL.setValue(C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List<Effect> wQ2(C1629840sVy<Effect> c1629840sVy, int i) {
        int i2 = 0;
        if (i == 1) {
            List<Effect> value = this.LLIZLLLIL.getValue();
            Object obj = null;
            if (value != null) {
                InterfaceC1624480sNK interfaceC1624480sNK = this.LL;
                int i3 = c1629840sVy.LIZIZ;
                if (value.size() >= i3) {
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                    int i4 = i2 + 1;
                    int size = value.size();
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        if (C1625940sPg.LJIILL(interfaceC1624480sNK, (Effect) ListProtector.get(value, i4))) {
                            obj = ListProtector.get(value, i4);
                            break;
                        }
                        i4++;
                    }
                }
            }
            return Collections.singletonList(obj);
        }
        List<Effect> value2 = this.LLIZLLLIL.getValue();
        if (value2 != null) {
            InterfaceC1624480sNK interfaceC1624480sNK2 = this.LL;
            int i5 = c1629840sVy.LIZIZ;
            if (value2.size() < i5 || i <= 0) {
                C13BV c13bv = C13BV.INSTANCE;
                if (c13bv != null) {
                    return c13bv;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                if (i5 >= 0) {
                    i2 = i5;
                }
                int size2 = value2.size();
                for (int i6 = i2 + 1; i6 < size2; i6++) {
                    if (C1625940sPg.LJIILL(interfaceC1624480sNK2, (Effect) ListProtector.get(value2, i6))) {
                        arrayList.add(ListProtector.get(value2, i6));
                        if (arrayList.size() == i) {
                            return arrayList;
                        }
                    }
                }
                return arrayList;
            }
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final boolean xQ2(Effect effect, boolean z) {
        if (!z) {
            return C1625940sPg.LJIIL(this.LL, effect);
        }
        return C1625940sPg.LJIIJJI(this.LL, effect);
    }

    public MultiStickerListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, C1635530sf9 c1635530sf9, C1DRG c1drg) {
        super(lifecycleOwner, interfaceC1624480sNK, interfaceC1625410sOp, c1635530sf9, c1drg, new C1629290sV5(interfaceC1624480sNK.getStickerRepository().LJI(), null), false, 64);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List<Effect> vQ2(C1629840sVy<Effect> c1629840sVy, int i, int i2, int i3, int i4) {
        Pair pair;
        Pair pair2;
        int iLJ;
        Pair pair3;
        Pair pair4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i == 1) {
            List<Effect> value = this.LLIZLLLIL.getValue();
            if (value != null) {
                int i5 = c1629840sVy.LIZIZ;
                if (value.size() < i5) {
                    pair4 = new Pair(null, null);
                } else {
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i6 = i5 + 1;
                    if (i6 < value.size()) {
                        pair4 = new Pair(ListProtector.get(value, i6), ((Effect) ListProtector.get(value, i6)).getEffectId());
                    } else {
                        pair4 = new Pair(null, null);
                    }
                }
                Object first = pair4.getFirst();
                if (first != null) {
                    arrayList.add(first);
                }
                Object second = pair4.getSecond();
                if (second != null) {
                    arrayList2.add(second);
                }
            }
        } else {
            List<Effect> value2 = this.LLIZLLLIL.getValue();
            if (value2 != null) {
                int i7 = c1629840sVy.LIZIZ;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (value2.size() > i7 + 1 && i > 0 && i3 > 0) {
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    int i8 = i7 + 1;
                    int size = value2.size();
                    while (true) {
                        if (i8 < size) {
                            arrayList3.add(ListProtector.get(value2, i8));
                            if (arrayList4.size() <= i3) {
                                arrayList4.add(((Effect) ListProtector.get(value2, i8)).getEffectId());
                            }
                            if (arrayList3.size() == i) {
                                pair = new Pair(arrayList3, arrayList4);
                                break;
                            }
                            i8++;
                        } else {
                            pair = new Pair(arrayList3, arrayList4);
                            break;
                        }
                    }
                } else {
                    pair = new Pair(arrayList3, arrayList4);
                }
                Collection collection = (Collection) pair.getFirst();
                if (collection != null) {
                    arrayList.addAll(collection);
                }
                Collection collection2 = (Collection) pair.getSecond();
                if (collection2 != null) {
                    arrayList2.addAll(collection2);
                }
            }
        }
        if (i2 == 1) {
            List<Effect> value3 = this.LLIZLLLIL.getValue();
            if (value3 != null) {
                if (c1629840sVy.LIZIZ - 1 >= 0 && -1 < C13LZ.LJ(r2, 0, value3.size() - 1) - 1) {
                    pair3 = new Pair(ListProtector.get(value3, iLJ), ((Effect) ListProtector.get(value3, iLJ)).getEffectId());
                } else {
                    pair3 = new Pair(null, null);
                }
                Object first2 = pair3.getFirst();
                if (first2 != null) {
                    arrayList.add(first2);
                }
                Object second2 = pair3.getSecond();
                if (second2 != null) {
                    arrayList2.add(second2);
                }
            }
        } else {
            List<Effect> value4 = this.LLIZLLLIL.getValue();
            if (value4 != null) {
                int i9 = c1629840sVy.LIZIZ;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (i9 - 1 >= 0 && i2 > 0 && i4 > 0) {
                    int iLJ2 = C13LZ.LJ(i9, 0, value4.size() - 1) - 1;
                    while (true) {
                        if (-1 < iLJ2) {
                            arrayList5.add(ListProtector.get(value4, iLJ2));
                            if (arrayList6.size() <= i4) {
                                arrayList6.add(((Effect) ListProtector.get(value4, iLJ2)).getEffectId());
                            }
                            if (arrayList5.size() == i2) {
                                pair2 = new Pair(arrayList5, arrayList6);
                                break;
                            }
                            iLJ2--;
                        } else {
                            pair2 = new Pair(arrayList5, arrayList6);
                            break;
                        }
                    }
                } else {
                    pair2 = new Pair(arrayList5, arrayList6);
                }
                Collection collection3 = (Collection) pair2.getFirst();
                if (collection3 != null) {
                    arrayList.addAll(collection3);
                }
                Collection collection4 = (Collection) pair2.getSecond();
                if (collection4 != null) {
                    arrayList2.addAll(collection4);
                }
            }
        }
        Bundle bundle = c1629840sVy.LJI;
        if (bundle != null) {
            bundle.putStringArray("preload_effect_ids", (String[]) arrayList2.toArray(new String[0]));
        }
        return arrayList;
    }
}
