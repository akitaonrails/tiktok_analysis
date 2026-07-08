package com.ss.android.ugc.aweme.relation.feed.v4;

import X.AbstractC323330Clv;
import X.C01GW;
import X.C0BLS;
import X.C0BLT;
import X.C0PEM;
import X.C0TJL;
import X.C0ZDN;
import X.C1007290cJr;
import X.C10L0;
import X.C10L1;
import X.C10L3;
import X.C10M3;
import X.C11NJ;
import X.C1260910iuv;
import X.C1261860iwS;
import X.C1261880iwU;
import X.C1262570ixb;
import X.C1263950izp;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1386360mBG;
import X.C1388190mED;
import X.C13LP;
import X.C1623606Xi;
import X.C1704300uS4;
import X.C1704330uS7;
import X.C1704340uS8;
import X.C1713300uga;
import X.C1743930vTz;
import X.C1910890zpH;
import X.C19229710Kx;
import X.C1954807lC;
import X.C19990113Jj;
import X.C19990313Jl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C296550Bjp;
import X.C323310Clt;
import X.C323320Clu;
import X.C323350Clx;
import X.C452501pT;
import X.C492501vv;
import X.C695160ROo;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC19228810Ko;
import X.EnumC19990213Jk;
import X.InterfaceC0148002o;
import X.InterfaceC1263910izl;
import X.InterfaceC1331910klR;
import X.InterfaceC19229810Ky;
import X.InterfaceC420801kM;
import X.InterfaceC469401sC;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import com.ss.android.ugc.aweme.relation.experiment.BigCardUIFixConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes29.dex */
public final class RecSwipeViewModel extends AssemViewModel<C1713300uga> implements InterfaceC19229810Ky {
    public Aweme LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZLLLIL;
    public long LLJILJIL;
    public Integer LLJJIJIL;
    public C1261860iwS LLJJJ;
    public final C01GW LL = C452501pT.LIZIZ(new C1743930vTz());
    public String LLIZ = "";
    public boolean LLJ = true;
    public final Map<String, Boolean> LLJI = new LinkedHashMap();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C10L1());
    public final C11NJ LLJILJILJ = new C11NJ();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C10L3(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C10L0());
    public final CopyOnWriteArrayList<C1261860iwS> LLJJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C1261860iwS> LLJJIII = new CopyOnWriteArrayList<>();
    public final boolean LLJJIJI = true;
    public final InterfaceC497601wk LLJJIJIIJIL = ViewModelKt.getViewModelScope(this);

    @Override // X.InterfaceC19229810Ky
    public final void Ql1() {
        this.LLILZIL = 0;
    }

    public final void IQ2() {
        setState(new AwS605S0100000_26(this, 413));
    }

    @Override // X.InterfaceC19229810Ky
    public final InterfaceC1263910izl XB1() {
        return (InterfaceC1263910izl) this.LLJJ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1713300uga(0);
    }

    @Override // X.InterfaceC19229810Ky
    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLJIJIL.getValue();
    }

    public final boolean AQ2() {
        return getState().LLILLJJLI.contains(EnumC19228810Ko.CLICK_CLOSE);
    }

    public final boolean BQ2() {
        List listLLIIII = C13LP.LLIIII(getState().LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (obj != EnumC19228810Ko.CLICK_CLOSE && obj != EnumC19228810Ko.CLICK_LONG_PRESS_DISLIKE) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final boolean CQ2() {
        return getState().LLILLJJLI.isEmpty();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILJILJ.LJ();
    }

    public final void xQ2() {
        C1261860iwS c1261860iwS = getState().LLILLL;
        if (c1261860iwS != null) {
            int i = C2187451AjH.LIZ;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1261880iwU(this, c1261860iwS, null), 2);
        }
    }

    public final boolean zQ2() {
        return getState().LLILLJJLI.contains(EnumC19228810Ko.CLICK_LONG_PRESS_DISLIKE);
    }

    public final boolean DQ2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> Dz1() {
        return this.LLJJI;
    }

    public final void HQ2() {
        C19229710Kx.LJ(this);
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean Js2() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC19229810Ky
    public final long LA() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final String getEventType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> hX0() {
        return this.LLJJIII;
    }

    public final InterfaceC497601wk yQ2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC19229810Ky
    public final void Cv2(int i) {
        this.LLILZLL = i;
    }

    public final void GQ2(String str) {
        if (DQ2()) {
            ab0(false);
            if (Js2()) {
                HQ2();
            }
            IQ2();
        }
    }

    @Override // X.InterfaceC19229810Ky
    public final void P22(int i) {
        this.LLILLL = i;
    }

    @Override // X.InterfaceC19229810Ky
    public final CopyOnWriteArrayList<C1261860iwS> R20(String str) {
        return C19229710Kx.LIZIZ(this, str);
    }

    @Override // X.InterfaceC19229810Ky
    public final void Xn1(List<C1261860iwS> list) {
        final C10M3 c10m3 = (C10M3) this.LLJILLL.getValue();
        c10m3.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator<C1261860iwS> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<String, String> pairLIZ = C695160ROo.LIZ(it2.next());
            if (pairLIZ != null) {
                arrayList.add(pairLIZ);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("total user size is ");
        sbLIZ.append(list.size());
        sbLIZ.append(", while valid size is ");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        for (Pair pair : arrayList) {
            final String str = (String) pair.getFirst();
            final String str2 = (String) pair.getSecond();
            if (!c10m3.LIZIZ.containsKey(str)) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LIZLLL("RecSwipeFlyMainColorManager");
                final InterfaceC469401sC interfaceC469401sCLJJIIJZLJL = c1331670kl3LJIIIZ.LJJIIJZLJL(new InterfaceC1331910klR() { // from class: X.10M4
                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("image load canceled, tag is ");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        int iIntValue;
                        if (bitmap != null && bitmap.getWidth() >= 1 && bitmap.getHeight() >= 1) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("image load complete, tag is ");
                            sbLIZ2.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (C19228210Ki.LIZJ() && ((BigCardUIFixConfig) C19228210Ki.LIZIZ.getValue()).newBackground == 1) {
                                c10m3.getClass();
                                double width = bitmap.getWidth();
                                double height = bitmap.getHeight();
                                Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect((int) (width * 0.1d), (int) (height * 0.1d), (int) (width * 0.9d), (int) (height * 0.9d)))).LIZIZ();
                                if (numLIZIZ != null) {
                                    iIntValue = numLIZIZ.intValue();
                                } else {
                                    iIntValue = -16777216;
                                }
                                float[] fArr = new float[3];
                                Color.colorToHSV(iIntValue, fArr);
                                if (fArr[1] > 0.1d) {
                                    fArr[1] = 1.0f;
                                }
                                fArr[2] = 0.9f;
                                Integer numValueOf = Integer.valueOf(Color.HSVToColor(fArr));
                                if (numValueOf != null) {
                                    C10M3 c10m32 = c10m3;
                                    String str3 = str;
                                    int iIntValue2 = numValueOf.intValue();
                                    c10m32.LIZIZ.put(str3, new int[]{iIntValue2, iIntValue2});
                                    return;
                                }
                                return;
                            }
                            c10m3.getClass();
                            int width2 = bitmap.getWidth();
                            int height2 = (int) (bitmap.getHeight() * 0.1f);
                            if (height2 < 1) {
                                height2 = 1;
                            }
                            Rect rect = new Rect(0, 0, width2, height2);
                            FlyMainColor flyMainColor = FlyMainColor.LIZ;
                            Integer numLIZ = C10M3.LIZ(flyMainColor.LIZ(new C2439109h7(bitmap, rect)), true);
                            int height3 = bitmap.getHeight();
                            int height4 = (int) (bitmap.getHeight() * 0.1f);
                            if (height4 < 1) {
                                height4 = 1;
                            }
                            rect.set(0, height3 - height4, bitmap.getWidth(), bitmap.getHeight());
                            Integer numLIZ2 = C10M3.LIZ(flyMainColor.LIZ(new C2439109h7(bitmap, rect)), false);
                            if (numLIZ == null || numLIZ2 == null) {
                                return;
                            }
                            c10m3.LIZIZ.put(str, new int[]{numLIZ.intValue(), numLIZ2.intValue()});
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("image load failed, tag is ");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("image load on progress, tag is ");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                });
                c10m3.LIZ.LIZ(new InterfaceC420801kM() { // from class: X.0euE
                    public final AtomicBoolean LL = new AtomicBoolean(false);

                    @Override // X.InterfaceC420801kM
                    public final void dispose() {
                        interfaceC469401sCLJJIIJZLJL.cancel();
                        this.LL.set(true);
                    }

                    @Override // X.InterfaceC420801kM
                    public final boolean isDisposed() {
                        return this.LL.get();
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC19229810Ky
    public final void ab0(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC19229810Ky
    public final void dI1(int i) {
        this.LLILZ = i;
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean pc(String str) {
        Integer numValueOf;
        boolean z;
        if (this.LLJJIJI) {
            C19229710Kx.LJ(this);
        }
        CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayListLIZIZ = C19229710Kx.LIZIZ(this, str);
        List<C1261860iwS> listLIZ = getState().LLILZ.LIZ();
        if (listLIZ != null) {
            numValueOf = Integer.valueOf(listLIZ.size());
        } else {
            numValueOf = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real data size is ");
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current list size is ");
        sbLIZ2.append(copyOnWriteArrayListLIZIZ.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getState().listState is ");
        sbLIZ3.append(getState().LLILZ);
        sbLIZ3.append(", SystemClock.elapsedRealtime is ");
        if (System.currentTimeMillis() < this.LLJILJIL) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ3.append(z);
        C2188811AlT.LIZIZ(sbLIZ3);
        if ((getState().LLILZ instanceof C1623606Xi) && copyOnWriteArrayListLIZIZ.size() > 0 && System.currentTimeMillis() < this.LLJILJIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19229810Ky
    public final void s21(long j) {
        this.LLJILJIL = j;
    }

    @Override // X.InterfaceC19229810Ky
    public final void setEventType(String str) {
        this.LLIZ = str;
    }

    @Override // X.InterfaceC19229810Ky
    public final void uf0(Aweme aweme) {
        C23250099c.LIZLLL(yQ2(), null, null, new C1007290cJr(aweme, this, null), 3);
    }

    public final void vQ2(EnumC19228810Ko enumC19228810Ko) {
        setState(new AwS605S0100000_26(enumC19228810Ko, 407));
    }

    public final void wQ2(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() < C19229710Kx.LIZIZ(this, this.LLIZ).size()) {
                C19229710Kx.LIZIZ(this, this.LLIZ).remove(num.intValue());
                setState(new AwS605S0100000_26(num, 408));
            }
        }
    }

    public final void FQ2(Context context, View view) {
        C19EG c19eg;
        new C0ZDN(context).LIZ(0);
        vQ2(EnumC19228810Ko.CLICK_LONG_PRESS);
        int i = C2187451AjH.LIZ;
        C0TJL c0tjl = new C0TJL(view, context, this.LLIZ, new AwS429S0200000_28(view, this, 55));
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            c0tjl.LIZ("show");
            ((DialogFragment) c0tjl.LJ.getValue()).show(c19eg.getSupportFragmentManager(), "long_press_sheet");
            FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
            if (fypAutoScrollServiceLIZJ != null) {
                fypAutoScrollServiceLIZJ.LJIJI(true);
            }
        }
    }

    public final void JQ2(C1261860iwS c1261860iwS, EnumC1260930iux enumC1260930iux) {
        Aweme aweme;
        String uid;
        User author;
        String requestId;
        User author2;
        Aweme aweme2;
        User author3;
        String requestId2;
        User author4;
        User author5;
        Aweme aweme3;
        User author6;
        String uid2;
        Aweme aweme4 = this.LLILLJJLI;
        String requestId3 = null;
        if ((aweme4 == null || aweme4.getAuthor() == null) && (aweme = this.LLILLJJLI) != null) {
            aweme.setAuthor(getState().LLILLL);
        }
        if (enumC1260930iux == EnumC1260930iux.SHOW && (aweme3 = this.LLILLJJLI) != null && (author6 = aweme3.getAuthor()) != null && (uid2 = author6.getUid()) != null) {
            C1262570ixb.LIZ("15", uid2);
        }
        Map<String, Boolean> map = this.LLJI;
        Aweme aweme5 = this.LLILLJJLI;
        if (aweme5 != null && (author5 = aweme5.getAuthor()) != null) {
            uid = author5.getUid();
        } else {
            uid = null;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(uid);
        C1910890zpH logger = getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("follow recommend show, user: ");
        Aweme aweme6 = this.LLILLJJLI;
        if (aweme6 != null) {
            author = aweme6.getAuthor();
        } else {
            author = null;
        }
        sbLIZ.append(author);
        sbLIZ.append(", show relation label: ");
        sbLIZ.append(bool);
        sbLIZ.append(", reqId: ");
        Aweme aweme7 = this.LLILLJJLI;
        if (aweme7 != null && (author4 = aweme7.getAuthor()) != null) {
            requestId = author4.getRequestId();
        } else {
            requestId = null;
        }
        sbLIZ.append(requestId);
        logger.LIZ("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(this.LLIZ);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJIJI(this.LLILLJJLI);
        Aweme aweme8 = this.LLILLJJLI;
        if (aweme8 != null) {
            author2 = aweme8.getAuthor();
        } else {
            author2 = null;
        }
        c1260910iuv.LJJJJZI(author2);
        if (C296550Bjp.LIZ()) {
            if ((c1261860iwS == null || (requestId2 = c1261860iwS.getRequestId()) == null) && ((aweme2 = this.LLILLJJLI) == null || (author3 = aweme2.getAuthor()) == null || (requestId2 = author3.getRequestId()) == null)) {
                Aweme aweme9 = this.LLILLJJLI;
                if (aweme9 != null) {
                    requestId3 = aweme9.getRequestId();
                }
            } else {
                requestId3 = requestId2;
            }
            c1260910iuv.LJJJJLI(requestId3);
        }
        c1260910iuv.LJLJI = true;
        c1260910iuv.LLFII = bool;
        c1260910iuv.LJIILJJIL();
    }

    @Override // X.InterfaceC19229810Ky
    public final void a22(String str, Function0<Unit> function0) {
        C1704340uS8 c1704340uS8 = (C1704340uS8) this.LL.getValue();
        if (!c1704340uS8.LJFF) {
            c1704340uS8.LIZIZ = str;
            c1704340uS8.LIZJ = C1704330uS7.LIZ();
            c1704340uS8.LJ = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        }
        withState(new AwS605S0100000_26(this, 412));
    }

    @Override // X.InterfaceC19229810Ky
    public final boolean cM0(C1261860iwS c1261860iwS, String str) {
        return C19229710Kx.LIZJ(c1261860iwS, str);
    }

    @Override // X.InterfaceC19229810Ky
    public final void k20(PlaceUserInfo placeUserInfo, Function0<Unit> function0) {
        int i = C2187451AjH.LIZ;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1704300uS4(this, function0, placeUserInfo, null), 2);
    }

    @Override // X.InterfaceC19229810Ky
    public final void kl2(AbstractC323330Clv<C1261860iwS> abstractC323330Clv, boolean z) {
        List<C1261860iwS> listLIZ;
        if (abstractC323330Clv instanceof C323350Clx) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load success, cursor is ");
            C323350Clx c323350Clx = (C323350Clx) abstractC323330Clv;
            sbLIZ.append(c323350Clx.LIZIZ);
            sbLIZ.append(", data size is ");
            sbLIZ.append(c323350Clx.LIZJ.size());
            C2188811AlT.LIZIZ(sbLIZ);
            C19229710Kx.LJII(this);
            C19229710Kx.LIZ(this, c323350Clx.LIZJ);
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 409));
        } else if (abstractC323330Clv instanceof C323320Clu) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load complete, cursor is null, data size is ");
            C323320Clu c323320Clu = (C323320Clu) abstractC323330Clv;
            sbLIZ2.append(c323320Clu.LIZIZ.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            C19229710Kx.LJII(this);
            C19229710Kx.LIZ(this, c323320Clu.LIZIZ);
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 410));
        } else if (abstractC323330Clv instanceof C323310Clt) {
            setState(new AwS605S0100000_26(abstractC323330Clv, (AbstractC323330Clv<C1261860iwS>) 411));
        } else {
            throw new C1954807lC();
        }
        if (z) {
            int i3 = C2187451AjH.LIZ;
            if (!C0BLS.LIZ() && (listLIZ = abstractC323330Clv.LIZ()) != null) {
                int size = listLIZ.size();
                if (size > 5) {
                    size = 5;
                }
                Xn1(listLIZ.subList(0, size));
            }
            C492501vv c492501vv = C492501vv.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) 3) * C19990113Jj.LJIIIZ(C19990313Jl.LJII(((Number) C0BLT.LIZ.getValue()).intValue(), EnumC19990213Jk.HOURS)));
            c492501vv.getClass();
            C492501vv.LIZ(jCurrentTimeMillis);
        }
    }

    public final void EQ2(Context context, C1261860iwS c1261860iwS, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card click for ");
        sbLIZ.append(c1261860iwS);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aweme.setAuthor(c1261860iwS);
        }
        JQ2(c1261860iwS, EnumC1260930iux.ENTER_PROFILE);
        vQ2(EnumC19228810Ko.CLICK_CARD);
        this.LLJJIJIL = Integer.valueOf(i);
        this.LLJJJ = c1261860iwS;
        if (c1261860iwS != null) {
            C1263950izp.LIZIZ(c1261860iwS, context, this.LLIZ, null, null, null, null, true, null, null, null, null, null, null, true, null, 0, (Boolean) ((LinkedHashMap) this.LLJI).get(c1261860iwS.getUid()), 229308);
        }
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null) {
            aweme2.setAuthor(getState().LLILLL);
        }
    }
}
