package com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui;

import X.C01GW;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LP;
import X.C1603960rqE;
import X.C1903607cw;
import X.C2188811AlT;
import X.C2401009ay;
import X.C452501pT;
import X.C644690PQl;
import X.C647140PZw;
import X.C649040Pd0;
import X.C653470Pk9;
import X.C653530PkF;
import X.C655610Pnb;
import X.C661440Px0;
import X.C661490Px5;
import X.C661510Px7;
import X.C661690PxP;
import X.C661850Pxf;
import X.C666390QBx;
import X.C7740030o;
import X.C786410Ut5;
import X.InterfaceC1010250cOd;
import X.InterfaceC1010860cPc;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public class LynxSearchVideo extends LynxUI<C661440Px0> {
    public static final C01GW<Set<String>> LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(237));
    public volatile boolean LL;

    @InterfaceC1967107nB
    public final void pause() {
        ((C661440Px0) this.mView).LJIIZILJ();
    }

    @InterfaceC1967107nB
    public void play() {
        ((C661440Px0) this.mView).LJIJI();
    }

    @InterfaceC1967107nB
    public final void stop() {
        ((C661440Px0) this.mView).LJJIII();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        String str;
        super.onPropsUpdated();
        C661440Px0 c661440Px0 = (C661440Px0) this.mView;
        if (c661440Px0.LLLF == null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - c661440Px0.LLL);
            c661440Px0.LLLF = lValueOf;
            if (lValueOf != null) {
                C644690PQl.LJIJI += lValueOf.longValue();
            }
        }
        s sVar = c661440Px0.LLJLL;
        if (sVar == null || (str = sVar.LLJJIII) == null) {
            str = "";
        }
        if (C1903607cw.LIZ(str)) {
            c661440Px0.LJJIIJZLJL();
            ARunnableS110S0100000_10 aRunnableS110S0100000_10 = new ARunnableS110S0100000_10(c661440Px0, 168);
            c661440Px0.LLJJIJIL = aRunnableS110S0100000_10;
            C786410Ut5.LJJZZIII(c661440Px0.LLJJIJIIJIL, aRunnableS110S0100000_10);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
    }

    public LynxSearchVideo(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public C661440Px0 createView(final Context context) {
        if (context != null) {
            C661440Px0 c661440Px0 = new C661440Px0(context) { // from class: X.0Pt7
            };
            c661440Px0.setEventChangeListener(new AwS624S0100000_10(this, 29));
            c661440Px0.setLynxContext(this.mContext);
            return c661440Px0;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @InterfaceC1312540kGC(name = "isSearchAutoPlayNode")
    public final void markAsAutoPlayNode(boolean z) {
        if (!z) {
            return;
        }
        this.mView.setTag(R.id.u74, Unit.LIZ);
    }

    @InterfaceC1312540kGC(name = "cover")
    public final void setAsyncCover(String str) {
        if (C123100dR.LIZ(str)) {
            C661440Px0 c661440Px0 = (C661440Px0) this.mView;
            c661440Px0.LLLIL = false;
            c661440Px0.LLLIILIL = str;
            c661440Px0.LJIIJ();
        }
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((C661440Px0) this.mView).setAutoPlay(z);
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void setAweme(ReadableMap readableMap) {
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
            ((C661440Px0) this.mView).setAweme(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), readableMap));
        }
    }

    @InterfaceC1312540kGC(name = "awemedata")
    public final void setAwemeData(ReadableMap readableMap) {
        if (!C1903607cw.LIZ(this.mContext.LLJJIII) && readableMap != null) {
            ((C661440Px0) this.mView).setAwemeData(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), readableMap));
        }
    }

    @InterfaceC1312540kGC(name = "awemeidentifier")
    public final void setAwemeIdentifier(ReadableMap readableMap) {
        ((C661440Px0) this.mView).setAwemeIdentifier(readableMap.asHashMap());
    }

    @InterfaceC1312540kGC(name = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (!C1903607cw.LIZ(this.mContext.LLJJIII) && readableMap != null && readableMap.hasKey("card_rank") && readableMap.hasKey("aweme_index")) {
            ((C661440Px0) this.mView).setAwemeIndex(new C661690PxP(readableMap.getString("aweme_id"), (int) readableMap.getDouble("card_rank"), readableMap.getBoolean("continueToPlay", false), (int) readableMap.getDouble("aweme_index"), readableMap.getInt("tab_index", -1), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), readableMap.getMap("aweme"))));
        }
    }

    @InterfaceC1312540kGC(name = "__control")
    public final void setControl(String str) {
        boolean z;
        List listLJJLIIIJILLIZJL;
        C661440Px0 c661440Px0;
        JSONObject jSONObject;
        C661440Px0 c661440Px02;
        if (str != null) {
            boolean z2 = false;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 3) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6);
                String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                int iHashCode = str2.hashCode();
                if (iHashCode != 3443508) {
                    if (iHashCode != 3526264) {
                        if (iHashCode == 106440182 && str2.equals("pause") && (c661440Px02 = (C661440Px0) this.mView) != null) {
                            c661440Px02.LJIIZILJ();
                            return;
                        }
                        return;
                    }
                    if (!str2.equals("seek")) {
                        return;
                    }
                    try {
                        jSONObject = new JSONObject((String) listLJJLIIIJILLIZJL2.get(1));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jSONObject = new JSONObject();
                    }
                    C661440Px0 c661440Px03 = (C661440Px0) this.mView;
                    if (c661440Px03 == null) {
                        return;
                    }
                    int iOptInt = jSONObject.optInt("position", 0);
                    if (jSONObject.optInt("play") == 1) {
                        z2 = true;
                    }
                    c661440Px03.LJJI(iOptInt, z2);
                    return;
                }
                if (!str2.equals("play") || (c661440Px0 = (C661440Px0) this.mView) == null) {
                    return;
                }
                c661440Px0.LJIJI();
            }
        }
    }

    @InterfaceC1312540kGC(name = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        if (readableMap != null) {
            ((C661440Px0) this.mView).setLogExtra(readableMap.toHashMap());
        }
    }

    @InterfaceC1312540kGC(name = "muted")
    public void setMuted(int i) {
        ((C661440Px0) this.mView).setMuted(i);
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        ((C661440Px0) this.mView).setObjectFit(str);
    }

    @InterfaceC1312540kGC(name = "opaqueplaceholder")
    public final void setOpaquePlaceHolder(boolean z) {
        int iIntValue;
        if (z) {
            C661440Px0 c661440Px0 = (C661440Px0) this.mView;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bw, this.mContext.LIZ());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c661440Px0.setCoverPlaceholder(iIntValue);
        }
    }

    @InterfaceC1312540kGC(name = "poster")
    public void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            ((C661440Px0) this.mView).setPoster(str);
        }
    }

    @InterfaceC1312540kGC(name = "rate")
    public final void setRate(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XSearchVideo- rate -> ");
        sbLIZ.append(i);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        ((C661440Px0) this.mView).setRate(i);
    }

    @InterfaceC1312540kGC(name = "repeat")
    public final void setRepeat(boolean z) {
        ((C661440Px0) this.mView).setRepeat(z);
    }

    @InterfaceC1312540kGC(name = "sampleInterval")
    public final void setSampleInterval(int i) {
        C661440Px0 c661440Px0 = (C661440Px0) this.mView;
        if (c661440Px0 != null) {
            c661440Px0.setSampleInterval(i);
        }
    }

    @InterfaceC1312540kGC(name = "searchAdCacheKey")
    public final void setSearchAdCacheKey(String str) {
        InterfaceC660150Puv interfaceC660150PuvLJJII;
        InterfaceC1010250cOd interfaceC1010250cOdMh;
        final Aweme aweme;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (interfaceC660150PuvLJJII = interfaceC657510PqfLIZLLL.LJJII(str)) != null && (interfaceC1010250cOdMh = interfaceC660150PuvLJJII.Mh()) != null && (aweme = interfaceC1010250cOdMh.getAweme()) != null) {
            ((C661440Px0) this.mView).LIZLLL(aweme);
            ((C661440Px0) this.mView).setSearchAdCacheKey(str);
            if (this.mView.isAttachedToWindow()) {
                View view = this.mView;
                ((C661440Px0) view).LL.LIZ(view);
            }
            if (aweme.isAd() && !this.LL) {
                this.LL = true;
                interfaceC660150PuvLJJII.LIZIZ(new InterfaceC1010860cPc() { // from class: X.0Pt5
                    @Override // X.InterfaceC1010860cPc
                    public final Context LIZ() {
                        s sVar = this.LIZ.mContext;
                        if (sVar != null) {
                            return sVar.LIZ();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final long getCurrentPosition() {
                        C661850Pxf core = ((C661440Px0) this.LIZ.mView).getCore();
                        if (core != null) {
                            return core.getCurrentPosition();
                        }
                        return 0L;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final View getView() {
                        return this.LIZ.mView;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isMute() {
                        C661850Pxf core = ((C661440Px0) this.LIZ.mView).getCore();
                        return core != null && core.getMute();
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final boolean isPlaying() {
                        C661850Pxf core = ((C661440Px0) this.LIZ.mView).getCore();
                        if (core != null) {
                            return core.isPlaying();
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1010860cPc
                    public final Aweme getAweme() {
                        return aweme;
                    }
                });
                final C661850Pxf c661850Pxf = ((C661440Px0) this.mView).LLIZ;
                if (c661850Pxf != null) {
                    c661850Pxf.LLLIL = null;
                    InterfaceC1010860cPc interfaceC1010860cPc = new InterfaceC1010860cPc() { // from class: X.0Pt8
                        @Override // X.InterfaceC1010860cPc
                        public final Context LIZ() {
                            return c661850Pxf.getContext();
                        }

                        @Override // X.InterfaceC1010860cPc
                        public final Aweme getAweme() {
                            Aweme aweme2 = aweme;
                            return aweme2 == null ? c661850Pxf.getMAweme() : aweme2;
                        }

                        @Override // X.InterfaceC1010860cPc
                        public final long getCurrentPosition() {
                            return c661850Pxf.getMPlayVideoHelper().LIZLLL();
                        }

                        @Override // X.InterfaceC1010860cPc
                        public final boolean isPlaying() {
                            return c661850Pxf.isPlaying();
                        }

                        @Override // X.InterfaceC1010860cPc
                        public final boolean isMute() {
                            return C659080PtC.LIZIZ();
                        }

                        @Override // X.InterfaceC1010860cPc
                        public final View getView() {
                            return c661850Pxf;
                        }
                    };
                    c661850Pxf.LLLIILIL = null;
                    interfaceC660150PuvLJJII.ik(interfaceC1010860cPc);
                    c661850Pxf.LLLIL = interfaceC660150PuvLJJII;
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = fe.e)
    public final void setSessionId(int i) {
        if (C1903607cw.LIZ(this.mContext.LLJJIII)) {
            return;
        }
        ((C661440Px0) this.mView).setSessionId(i);
    }

    @InterfaceC1967107nB
    public final void setSharedInfoBeforeLaunchDetail(ReadableMap readableMap) {
        String string;
        int size;
        long createTime;
        Aweme aweme;
        DynamicPatch dynamicPatch;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSharedInfo map: ");
        List<Aweme> awemeList = null;
        if (readableMap != null) {
            string = readableMap.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (readableMap != null) {
            String string2 = readableMap.getString("aid");
            String string3 = readableMap.getString("uid");
            String string4 = readableMap.getString("keyword");
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                C661440Px0 c661440Px0 = (C661440Px0) this.mView;
                if (!c661440Px0.LJIIJJI(c661440Px0.getContext()) && !TextUtils.isEmpty(string2)) {
                    C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(c661440Px0.LLJ);
                    if (c649040Pd0LIZ != null && (dynamicPatch = c649040Pd0LIZ.LIZ) != null) {
                        awemeList = dynamicPatch.getAwemeList();
                    }
                    if (!C2401009ay.LIZ(awemeList)) {
                        C666390QBx.LIZIZ = awemeList;
                        C653530PkF c653530PkF = new C653530PkF();
                        c653530PkF.LIZ = string4;
                        c653530PkF.LIZIZ = 4;
                        c653530PkF.LIZJ = string3;
                        int size2 = 0;
                        if (awemeList != null) {
                            size = awemeList.size();
                        } else {
                            size = 0;
                        }
                        c653530PkF.LIZLLL = size;
                        if (awemeList != null && (aweme = (Aweme) C13LP.LJJLIIIJL(awemeList)) != null) {
                            createTime = aweme.getCreateTime();
                        } else {
                            createTime = 0;
                        }
                        c653530PkF.LJFF = createTime;
                        ContinuousLoadingAwemeList continuousLoadingAwemeList = new ContinuousLoadingAwemeList();
                        continuousLoadingAwemeList.awemeList = awemeList;
                        if (awemeList != null) {
                            size2 = awemeList.size();
                        }
                        continuousLoadingAwemeList.cursor = size2;
                        continuousLoadingAwemeList.hasMore = 1;
                        C653470Pk9 c653470Pk9 = new C653470Pk9();
                        c653470Pk9.LJIILL(continuousLoadingAwemeList);
                        c653470Pk9.LJIILIIL().LIZ(c653530PkF);
                        C1603960rqE.LIZ = c653470Pk9;
                        C661490Px5 c661490Px5 = c661440Px0.LLILLL;
                        if (c661490Px5 != null && c661490Px5.LJ() != null) {
                            C661510Px7.LIZ.getClass();
                            C661510Px7.LIZ(c661490Px5, true, false);
                        }
                    }
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = "showcoveronpause")
    public final void setShowCoverOnPause(boolean z) {
        ((C661440Px0) this.mView).setShowCoverOnPause(z);
    }

    @InterfaceC1312540kGC(name = "soundControl")
    public void setSoundControl(int i) {
        ((C661440Px0) this.mView).setSoundControl(i);
    }

    @InterfaceC1312540kGC(name = "ecomtokentype")
    public final void setTokenType(String str) {
        if (str != null) {
            ((C661440Px0) this.mView).setEcomTokenType(str);
        }
    }

    @InterfaceC1967107nB
    public void seek(ReadableMap readableMap, Callback callback) {
        ((C661440Px0) this.mView).LJJI(readableMap.getInt("seekTime"), readableMap.getBoolean("play"));
    }

    @InterfaceC1967107nB
    public final void seek(int i, boolean z) {
        ((C661440Px0) this.mView).LJJI(i, z);
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
