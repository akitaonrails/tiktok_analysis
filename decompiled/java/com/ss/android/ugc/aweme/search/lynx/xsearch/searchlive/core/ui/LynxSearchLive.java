package com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui;

import X.C13LP;
import X.C1903607cw;
import X.C1ACD;
import X.C2188811AlT;
import X.C655610Pnb;
import X.C658550PsL;
import X.C658580PsO;
import X.C7740030o;
import X.InterfaceC1010250cOd;
import X.InterfaceC1010860cPc;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public class LynxSearchLive extends LynxUI<C658550PsL> {
    public static final /* synthetic */ int LL = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPropsUpdated() {
        /*
            r4 = this;
            T extends android.view.View r3 = r4.mView
            X.0PsL r3 = (X.C658550PsL) r3
            j27.s r0 = r3.LLJJIJIL
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.LLJJIII
            if (r0 != 0) goto Le
        Lc:
            java.lang.String r0 = ""
        Le:
            boolean r0 = X.C1903607cw.LIZ(r0)
            if (r0 == 0) goto L49
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r3.LLJL
            r2 = 0
            if (r1 == 0) goto L56
            java.lang.String r0 = "aweme_id"
            java.lang.Object r1 = r1.get(r0)
        L1f:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L54
            java.lang.String r1 = (java.lang.String) r1
        L25:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L35
            java.lang.String r2 = r0.getAid()
        L35:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r0 == 0) goto L4a
        L3b:
            Y.ARunnableS110S0100000_10 r1 = new Y.ARunnableS110S0100000_10
            r0 = 117(0x75, float:1.64E-43)
            r1.<init>(r3, r0)
            r3.LLJILJIL = r1
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r3.LLJILJILJ
            X.C786410Ut5.LJJZZIII(r0, r1)
        L49:
            return
        L4a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C651640PhC.LJFF(r1)
            if (r0 == 0) goto L3b
            r3.LJIIL(r0)
            goto L3b
        L54:
            r1 = r2
            goto L25
        L56:
            r1 = r2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive.onPropsUpdated():void");
    }

    @InterfaceC1967107nB
    public final void play() {
        ((C658550PsL) this.mView).LJIIZILJ();
    }

    @InterfaceC1967107nB
    public final void stop() {
        ((C658550PsL) this.mView).LJIJJ();
    }

    public LynxSearchLive(s sVar) {
        super(sVar);
    }

    public C658550PsL LJJIIZI(final Context context) {
        C658550PsL c658550PsL = new C658550PsL(context) { // from class: X.0PsS
        };
        c658550PsL.setEventChangeListener(new AwS624S0100000_10(this, 27));
        c658550PsL.setLynxContext(this.mContext);
        return c658550PsL;
    }

    @InterfaceC1967107nB
    public void getPlayerTag(Callback callback) {
        String playerTag;
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C1ACD c1acd = ((C658550PsL) this.mView).getDataProvider().LJIIIIZZ;
        if (c1acd == null || (playerTag = c1acd.getPlayerTag()) == null) {
            playerTag = "";
        }
        javaOnlyMap.putString("player_tag", playerTag);
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1312540kGC(name = "isSearchAutoPlayNode")
    public final void markAsAutoPlayNode(boolean z) {
        if (!z) {
            return;
        }
        this.mView.setTag(R.id.u74, Unit.LIZ);
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((C658550PsL) this.mView).setAutoPlay(z);
    }

    @InterfaceC1312540kGC(name = "awemedata")
    public final void setAwemeData(ReadableMap readableMap) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme: ");
        if (readableMap != null) {
            string = readableMap.getString("aid");
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (readableMap != null) {
            ((C658550PsL) this.mView).LJIIL((Aweme) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), readableMap), new TypeToken<Aweme>() { // from class: X.0PsQ
            }.getType()));
        }
    }

    @InterfaceC1312540kGC(name = "awemeidentifier")
    public final void setAwemeIdentifier(ReadableMap readableMap) {
        ((C658550PsL) this.mView).setAwemeIdentifier(readableMap.asHashMap());
    }

    @InterfaceC1312540kGC(name = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (!C1903607cw.LIZ(this.mContext.LLJJIII) && readableMap != null) {
            C658550PsL c658550PsL = (C658550PsL) this.mView;
            readableMap.getInt("card_rank", -1);
            c658550PsL.setAwemeIndex(new C658580PsO(readableMap.getInt("aweme_index"), readableMap.getInt("tab_index", -1)));
        }
    }

    @InterfaceC1312540kGC(name = "__control")
    public final void setControl(String str) {
        List listLJJLIIIJILLIZJL;
        C658550PsL c658550PsL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 3) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6));
            if (Intrinsics.LJFF(objLJJJLZIJ, "play")) {
                C658550PsL c658550PsL2 = (C658550PsL) this.mView;
                if (c658550PsL2 != null) {
                    c658550PsL2.LJIIZILJ();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(objLJJJLZIJ, "stop") || (c658550PsL = (C658550PsL) this.mView) == null) {
                return;
            }
            c658550PsL.LJIJJ();
        }
    }

    @InterfaceC1312540kGC(name = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap != null && (hashMap = readableMap.toHashMap()) != null) {
            HashMap<String, Object> map = new HashMap<>();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            ((C658550PsL) this.mView).setLogExtra(map);
        }
    }

    @InterfaceC1312540kGC(name = "muted")
    public void setMuted(int i) {
        ((C658550PsL) this.mView).setMuted(i);
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        ((C658550PsL) this.mView).setObjectFit(str);
    }

    @InterfaceC1312540kGC(name = "searchAdCacheKey")
    public final void setSearchAdCacheKey(String str) {
        InterfaceC660150Puv interfaceC660150PuvLJJII;
        InterfaceC1010250cOd interfaceC1010250cOdMh;
        final Aweme aweme;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (interfaceC660150PuvLJJII = interfaceC657510PqfLIZLLL.LJJII(str)) != null && (interfaceC1010250cOdMh = interfaceC660150PuvLJJII.Mh()) != null && (aweme = interfaceC1010250cOdMh.getAweme()) != null) {
            ((C658550PsL) this.mView).LJIIL(aweme);
            if (this.mView.isAttachedToWindow()) {
                View view = this.mView;
                ((C658550PsL) view).LL.LIZ(view);
            }
            if (aweme.isAd()) {
                InterfaceC1010860cPc interfaceC1010860cPc = new InterfaceC1010860cPc() { // from class: X.0PsP
                    @Override // X.InterfaceC1010860cPc
                    public final long getCurrentPosition() {
                        return -1L;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final Context LIZ() {
                        s sVar = this.LIZ.mContext;
                        if (sVar != null) {
                            return sVar.LIZ();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final View getView() {
                        return this.LIZ.mView;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isMute() {
                        return ((C658550PsL) this.LIZ.mView).getLiveCore().getMute();
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isPlaying() {
                        return ((C658550PsL) this.LIZ.mView).isPlaying();
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final Aweme getAweme() {
                        return aweme;
                    }
                };
                if (interfaceC660150PuvLJJII != null) {
                    interfaceC660150PuvLJJII.LIZIZ(interfaceC1010860cPc);
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = fe.e)
    public final void setSessionId(int i) {
        if (C1903607cw.LIZ(this.mContext.LLJJIII)) {
            return;
        }
        ((C658550PsL) this.mView).setSessionId(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    @X.InterfaceC1967107nB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSharedInfoBeforeLaunchDetail(com.lynx.react.bridge.ReadableMap r12) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive.setSharedInfoBeforeLaunchDetail(com.lynx.react.bridge.ReadableMap):void");
    }

    @InterfaceC1312540kGC(name = "soundControl")
    public void setSoundControl(int i) {
        ((C658550PsL) this.mView).setSoundControl(i);
    }

    @InterfaceC1312540kGC(name = "ecomtokentype")
    public final void setTokenType(String str) {
        if (str != null) {
            ((C658550PsL) this.mView).setEcomTokenType(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* bridge */ /* synthetic */ View createView(Context context, Object obj) {
        return LJJIIZI(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
