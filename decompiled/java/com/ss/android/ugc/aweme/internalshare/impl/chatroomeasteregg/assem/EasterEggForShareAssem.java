package com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem;

import X.C019F;
import X.C01GW;
import X.C08JS;
import X.C09BH;
import X.C09R3;
import X.C0PEM;
import X.C0VSJ;
import X.C13LE;
import X.C1543490qGh;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1566340qrY;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1B2A;
import X.C1B2C;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2246581CwS;
import X.C2246591CwT;
import X.C2246601CwU;
import X.C2247381Cxk;
import X.C23250099c;
import X.C2344009Gk;
import X.C433070GyX;
import X.C433080GyY;
import X.C440150HNt;
import X.C440160HNu;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C824240WVa;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.EasterEggForShareViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.text.Charsets;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class EasterEggForShareAssem extends UIContentAssem implements C1B2C {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 759));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 760));
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EasterEggForShareAssem.class, "easterEggForShareViewModel", "getEasterEggForShareViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/chatroomeasteregg/vm/EasterEggForShareViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EasterEggForShareAssem.class, "awemeDataViewModel", "getAwemeDataViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/chatroomeasteregg/vm/IMEffectNoticeViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public EasterEggForShareAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EasterEggForShareViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 714), AFwS264S0000000_24.get$arr$(195), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 712));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IMEffectNoticeViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 715), AFwS276S0000000_31.get$arr$(150), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 713));
        this.LLJJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(213));
        this.LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(217));
        this.LLJJIII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(216));
    }

    public final IMEffectNoticeViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (IMEffectNoticeViewModel) assemVMLazy.getValue();
    }

    public final SessionInfo Jo() {
        return (SessionInfo) this.LLJI.getValue();
    }

    public final IMChatRoomAlphaVideoAbility Ho() {
        return (IMChatRoomAlphaVideoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMChatRoomAlphaVideoAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) C440150HNt.LIZ).remove(this);
    }

    @Override // X.C1B2C
    public final void D1(C433080GyY c433080GyY) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C433070GyX(c433080GyY, this, null), 2);
    }

    public final void Lo(String str) throws Throwable {
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager;
        String strLJII;
        File file;
        String strLJI;
        AlphaVideoFileModel alphaVideoFileModel;
        AlphaVideoFileModel.Item item;
        String absolutePath;
        ArrayList arrayList;
        C2246581CwS c2246581CwS;
        C2246601CwU c2246601CwU;
        int[] iArr;
        C2246601CwU c2246601CwU2;
        int i;
        if (((Map) this.LLJJ.getValue()).containsKey(str) || (iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpi$default(IDMGeckoCommonChannelManager.class, false, false, false, 14, null)) == null || (strLJII = iDMGeckoCommonChannelManager.LJII()) == null || !new C0VSJ(strLJII).exists()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJII);
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        File[] fileArrListFiles = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).listFiles();
        char c = 0;
        try {
            if (fileArrListFiles != null) {
                File file2 = null;
                file = null;
                for (File file3 : fileArrListFiles) {
                    if (u.LJIIZILJ(file3.getAbsolutePath(), ".json", false)) {
                        file2 = file3;
                    } else if (u.LJIIZILJ(file3.getAbsolutePath(), ".mp4", false)) {
                        file = file3;
                    }
                }
                if (file2 != null) {
                    strLJI = C09BH.LJI(file2, Charsets.UTF_8);
                }
                alphaVideoFileModel = (AlphaVideoFileModel) C08JS.LIZ(strLJI, AlphaVideoFileModel.class);
                if (alphaVideoFileModel == null && (item = alphaVideoFileModel.portrait) != null) {
                    DataSource dataSource = new DataSource();
                    if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                        DataSource.DataInfo dataInfo = new DataSource.DataInfo(absolutePath);
                        dataInfo.setScaleType(item.align);
                        dataInfo.setVersion(item.version);
                        dataInfo.setTotalFrame(item.totalFrame);
                        dataInfo.setVideoWidth(item.videoWidth);
                        dataInfo.setVideoHeight(item.videoHeight);
                        dataInfo.setActualWidth(item.actualWidth);
                        dataInfo.setActualHeight(item.actualHeight);
                        dataInfo.setAlphaArea(item.alphaFrame);
                        dataInfo.setRgbArea(item.rgbFrame);
                        dataInfo.setMasks(item.masks);
                        if (item.layersModel == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (AlphaVideoFileModel.LayerModel layerModel : item.layersModel) {
                                layerModel.getClass();
                                C2246591CwT c2246591CwT = new C2246591CwT();
                                c2246591CwT.LIZ = layerModel.name;
                                int i2 = layerModel.type;
                                c2246591CwT.LIZIZ = i2;
                                if (i2 != 0 && i2 != 1) {
                                    if (i2 == 2) {
                                        c2246591CwT.LIZLLL = new C2247381Cxk(layerModel.alphaArea);
                                        c2246591CwT.LIZJ = new C2247381Cxk(layerModel.rgbArea);
                                        c2246591CwT.LJ = layerModel.offsetX;
                                        c2246591CwT.LJFF = layerModel.offsetY;
                                        c2246591CwT.LJII = layerModel.enableContentRTL;
                                        c2246591CwT.LJI = layerModel.enableLayoutRTL;
                                    }
                                } else {
                                    c2246591CwT.LJII = layerModel.enableContentRTL;
                                    c2246591CwT.LJI = layerModel.enableLayoutRTL;
                                }
                                AlphaVideoFileModel.MaskContainerModel maskContainerModel = layerModel.maskContainer;
                                if (maskContainerModel != null) {
                                    boolean z = layerModel.enableLayoutRTL;
                                    int[] iArr2 = maskContainerModel.alphaArea;
                                    if (iArr2 != null && maskContainerModel.rgbArea != null) {
                                        c2246581CwS = new C2246581CwS();
                                        c2246581CwS.LIZ = maskContainerModel.containerType;
                                        c2246581CwS.LIZIZ = maskContainerModel.alignType;
                                        c2246581CwS.LIZLLL = new C2247381Cxk(iArr2);
                                        c2246581CwS.LIZJ = new C2247381Cxk(maskContainerModel.rgbArea);
                                        int[] iArr3 = maskContainerModel.contentPadding;
                                        if (iArr3 != null && iArr3.length == 4) {
                                            c2246601CwU = new C2246601CwU(iArr3[1], iArr3[3], iArr3[c], iArr3[2]);
                                        } else {
                                            c2246601CwU = null;
                                        }
                                        c2246581CwS.LJ = c2246601CwU;
                                        int[] iArr4 = maskContainerModel.flexPadding;
                                        if (iArr4 != null && (iArr = maskContainerModel.anchorPoint) != null) {
                                            if (iArr4.length != 4) {
                                                i = 2;
                                                c2246601CwU2 = null;
                                            } else {
                                                c2246601CwU2 = new C2246601CwU(iArr4[1], iArr4[3], iArr4[c], iArr4[2]);
                                                i = 2;
                                            }
                                            c2246581CwS.LJFF = c2246601CwU2;
                                            int[] iArr5 = new int[i];
                                            iArr5[0] = iArr[0];
                                            iArr5[1] = iArr[1];
                                            c2246581CwS.LJIIJ = iArr5;
                                            c2246581CwS.LJI = maskContainerModel.disableFlexX;
                                            c2246581CwS.LJII = maskContainerModel.disableFlexY;
                                            c = 0;
                                        }
                                        c2246581CwS.LJIIJJI = maskContainerModel.fallbackLayer;
                                        c2246581CwS.LJIIIZ = maskContainerModel.enableContentRTL;
                                        c2246581CwS.LJIIIIZZ = z;
                                    } else {
                                        c2246581CwS = null;
                                    }
                                    c2246591CwT.LJIIIIZZ = c2246581CwS;
                                }
                                arrayList.add(c2246591CwT);
                            }
                        }
                        dataInfo.setLayers(arrayList);
                        dataSource.setPortraitDataInfo(dataInfo);
                        ((Map) this.LLJJ.getValue()).put(str, dataSource);
                        return;
                    }
                    return;
                }
                return;
            }
            file = null;
            alphaVideoFileModel = (AlphaVideoFileModel) C08JS.LIZ(strLJI, AlphaVideoFileModel.class);
            if (alphaVideoFileModel == null) {
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(str);
            sbLIZ2.append("] convert json fail");
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        strLJI = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated, isQuickChat = ");
        C457780HxI c457780HxI = (C457780HxI) this.LLJ.getValue();
        if (c457780HxI != null) {
            boolValueOf = Boolean.valueOf(c457780HxI.LLILLJJLI);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1543490qGh.LIZIZ(C1B2A.class, null, 6);
        C1543490qGh.LIZIZ(C824240WVa.class, null, 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C440160HNu(this, null), 2);
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo != null) {
            AssemVMLazy assemVMLazy = this.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            EasterEggForShareViewModel easterEggForShareViewModel = (EasterEggForShareViewModel) assemVMLazy.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(easterEggForShareViewModel), C0PEM.LIZJ, null, new C1566340qrY(easterEggForShareViewModel, sessionInfoJo, null), 2);
        }
    }

    public final void Vo(String str, String str2) {
        String conversationId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("effect_scene", str);
        c2344009Gk.LJFF("stage", "start");
        c2344009Gk.LJFF("trigger_id", str2);
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo == null || (conversationId = sessionInfoJo.getConversationId()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("conversation_id", conversationId);
        C20684815ws.LJIILLIIL("ttsocial_chat_easter_egg_perf", c2344009Gk.LIZ);
    }

    public final void Oo(long j, String str, String str2) {
        String conversationId;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("effect_scene", str);
        c2344009Gk.LJFF("stage", "display");
        c2344009Gk.LJFF("trigger_id", str2);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "display_duration_ms");
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo == null || (conversationId = sessionInfoJo.getConversationId()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("conversation_id", conversationId);
        C20684815ws.LJIILLIIL("ttsocial_chat_easter_egg_perf", c2344009Gk.LIZ);
    }

    public final void No(Integer num, String str, String str2, String str3) {
        String conversationId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "chat");
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo == null || (conversationId = sessionInfoJo.getConversationId()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("conversation_id", conversationId);
        c2344009Gk.LJFF("chat_type", "private");
        c2344009Gk.LJFF("message_id", str);
        c2344009Gk.LJFF("effect_scene", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("effect_style", str3);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "video_num");
        }
        C20684815ws.LJIILLIIL("ttsocial_chat_easter_egg_show", c2344009Gk.LIZ);
    }

    public final void So(long j, String str, String str2, String str3, String str4) {
        String conversationId;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("effect_scene", str);
        c2344009Gk.LJFF("stage", "end");
        c2344009Gk.LJFF("trigger_id", str2);
        c2344009Gk.LJFF("result", str3);
        if (str4 != null) {
            c2344009Gk.LJFF("reason", str4);
        }
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration_ms");
        SessionInfo sessionInfoJo = Jo();
        if (sessionInfoJo == null || (conversationId = sessionInfoJo.getConversationId()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("conversation_id", conversationId);
        C20684815ws.LJIILLIIL("ttsocial_chat_easter_egg_perf", c2344009Gk.LIZ);
    }
}
