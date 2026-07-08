package com.ss.android.ugc.aweme.tools.music;

import X.C0PEM;
import X.C10I1;
import X.C11NZ;
import X.C13LP;
import X.C141Q;
import X.C1421530n5z;
import X.C1455220nyK;
import X.C1458410o3T;
import X.C1459710o5Z;
import X.C155W;
import X.C15GL;
import X.C15J1;
import X.C15KO;
import X.C15KP;
import X.C194506117w;
import X.C19EG;
import X.C1DRG;
import X.C20439714yR;
import X.C20440014yU;
import X.C20498315Iv;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.C297650Blb;
import X.C527630Kmf;
import X.C533510Kw9;
import X.C568990MTh;
import X.C744590TIr;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1463370oBT;
import X.InterfaceC1416880myU;
import X.InterfaceC1416890myV;
import X.InterfaceC1455230nyL;
import X.InterfaceC1662290tMJ;
import X.InterfaceC202028143e;
import X.InterfaceC20498115It;
import X.InterfaceC20498515Ix;
import X.InterfaceC744580TIq;
import X.ProgressDialogC1397800mTi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.vesdk.VEUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS308S0300000_31;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicServiceImpl implements IAnotherMusicService {
    public final IMusicService LIZ = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMusicService();

    @Override // X.InterfaceC1623990sMX
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final C11NZ<List<MusicModel>> Lk() {
        return C1421530n5z.LL.Lk();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean Qk() {
        return C1459710o5Z.LIZJ("music");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean Rk() {
        return C1421530n5z.LL.VS();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Tk() {
        C1459710o5Z.LIZ("music");
    }

    @Override // X.InterfaceC1623990sMX
    public final String getCacheDir() {
        return this.LIZ.getCacheDir();
    }

    @Override // X.InterfaceC1623990sMX
    public final String getDownloadDir() {
        return this.LIZ.getDownloadDir();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void gl() {
        C20440014yU c20440014yU = C20440014yU.LJIIJ;
        c20440014yU.LJIIIIZZ();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C20439714yR(0, null, c20440014yU, null), 3);
    }

    @Override // X.InterfaceC1623990sMX
    public final void LIZIZ() {
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final Class<?> LIZJ() {
        return ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Ok() {
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Pk() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        C1421530n5z c1421530n5z = C1421530n5z.LL;
        if (curUserId == null) {
            curUserId = "";
        }
        c1421530n5z.LIZJ(curUserId);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Wk() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void al() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final C1458410o3T dl() {
        return C1458410o3T.LIZ;
    }

    @Override // X.InterfaceC1623990sMX
    public final String LIZ(MusicModel musicModel) {
        return ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LIZ(musicModel);
    }

    @Override // X.InterfaceC1623990sMX
    public final void LIZLLL(String str) {
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LIZLLL(str);
    }

    @Override // X.InterfaceC1623990sMX
    public final String LJI(AVMusic aVMusic) {
        return ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LIZ(C10I1.LIZ(aVMusic));
    }

    @Override // X.InterfaceC1623990sMX
    public final MusicModel LJII(AVMusic aVMusic) {
        if (aVMusic == null) {
            return null;
        }
        return C10I1.LIZ(aVMusic);
    }

    @Override // X.InterfaceC1623990sMX
    public final String LJIIIZ(AVMusic aVMusic) {
        return ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJIIL(C10I1.LIZ(aVMusic));
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Mk(MusicModel musicModel) {
        C1421530n5z.LL.ZN(musicModel, "");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final MusicWaveBean Nk(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(aVMusicWaveBean.getMusicWavePointArray());
        return musicWaveBean;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final String Sk(String str) {
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ = ((IMusicExternalService) ServiceManager.get().getService(IMusicExternalService.class)).LIZJ();
        if (interfaceC1662290tMJLIZJ == null) {
            return null;
        }
        return interfaceC1662290tMJLIZJ.LJ(str, null);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean Uk(String str) {
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ = ((IMusicExternalService) ServiceManager.get().getService(IMusicExternalService.class)).LIZJ();
        if (interfaceC1662290tMJLIZJ != null && interfaceC1662290tMJLIZJ.LIZ(str, null)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusic Vk(String str) {
        MusicModel musicModelConvertToMusicModel;
        C15KP c15kp = new C15KP();
        Music musicLJII = ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJII(str);
        if (musicLJII != null) {
            musicModelConvertToMusicModel = musicLJII.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        return c15kp.apply(musicModelConvertToMusicModel);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final C1455220nyK Xk(InterfaceC1455230nyL interfaceC1455230nyL) {
        return new C1455220nyK(interfaceC1455230nyL);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusicWaveBean Zk(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            aVMusicWaveBean.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return aVMusicWaveBean;
        }
        if (!(serializable instanceof AVMusicWaveBean)) {
            return null;
        }
        return (AVMusicWaveBean) serializable;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVChallenge cl(Challenge challenge) {
        if (challenge != null) {
            new C194506117w();
            return C194506117w.LIZ(challenge);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final int getMusicDuration(String str) {
        int iLIZLLL;
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str != null && str.length() != 0 && (num = C141Q.LIZIZ.get(str)) != null && num.intValue() > 0 && num.intValue() > 0) {
            return num.intValue();
        }
        String strLJIIIIZZ = C141Q.LJIIIIZZ(str);
        if (strLJIIIIZZ == null || strLJIIIIZZ.length() == 0) {
            return -1;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(strLJIIIIZZ, iArr);
        if (audioFileInfo == 0) {
            iLIZLLL = iArr[3];
        } else {
            if (C297650Blb.LIZ()) {
                return -1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sbLIZ.append(audioFileInfo);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C141Q.LIZ.getClass();
            iLIZLLL = C141Q.LIZLLL(strLJIIIIZZ);
        }
        if (str != null) {
            C141Q.LIZIZ.put(str, Integer.valueOf(iLIZLLL));
        }
        return iLIZLLL;
    }

    @Override // X.InterfaceC1623990sMX
    public final String getRhythmMusicFilePath(String str) {
        return this.LIZ.getRhythmMusicFilePath(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean isMusicTypeLocal(int i) {
        return this.LIZ.isMusicTypeLocal(i);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final String jl(String str) {
        return C1421530n5z.LL.EN(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final MusicModel transformAVMusic(AVMusic aVMusic) {
        if (aVMusic == null) {
            return null;
        }
        return C10I1.LIZ(aVMusic);
    }

    @Override // X.InterfaceC1623990sMX
    public final AVMusic transformFromAVMusic(String str) {
        return this.LIZ.transformFromAVMusic(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusic transformMusicModel(MusicModel musicModel) {
        return new C15KP().apply(musicModel);
    }

    @Override // X.InterfaceC1623990sMX
    public final AVMusic transformNewAVMusic(String str) {
        return this.LIZ.transformNewAVMusic(str);
    }

    public static final Pair LJIIJ(int i, List list) {
        String musicId;
        Long lLJIILIIL = null;
        if (i == 1) {
            C533510Kw9.LIZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C527630Kmf(null), 3);
        } else {
            C533510Kw9 c533510Kw9 = C533510Kw9.LIZ;
            MusicModel musicModel = (MusicModel) C13LP.LJJJLL(list);
            if (musicModel != null && (musicId = musicModel.getMusicId()) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(musicId);
            }
            c533510Kw9.getClass();
            C533510Kw9.LJI(lLJIILIIL);
        }
        return new Pair(C15KO.LIZIZ(list), EnumC1463370oBT.MUSIC_FROM_HOT);
    }

    @Override // X.InterfaceC1623990sMX
    public final boolean LJFF(AVMusic aVMusic, Context context) {
        return this.LIZ.checkValidMusic(aVMusic, context, false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final VerticalMusicViewV2 hl(C1DRG c1drg, C155W c155w) {
        return new VerticalMusicViewV2(c1drg, c155w);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void kl(String str, boolean z) {
        C1421530n5z.LL.Lu0(str, z);
    }

    @Override // X.InterfaceC1623990sMX
    public final void requestMusic(String str, InterfaceC1416890myV interfaceC1416890myV) {
        this.LIZ.requestMusic(str, interfaceC1416890myV);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void fl(Context context, String str, C568990MTh c568990MTh) {
        Yk(context, str, false, null, c568990MTh, false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void bl(C19EG c19eg, C20498315Iv c20498315Iv, Function1 function1, Function0 function0) {
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJJIIJZLJL(c20498315Iv.LJI);
        C744590TIr c744590TIr = new C744590TIr(c19eg);
        AwS112S0201000_31 awS112S0201000_31 = new AwS112S0201000_31(this, c20498315Iv, 17);
        C15J1 c15j1 = new C15J1(this, function1, function0);
        AvoidOnResultFragment avoidOnResultFragment = c744590TIr.LIZ;
        if (avoidOnResultFragment == null) {
            avoidOnResultFragment = null;
        }
        List<InterfaceC744580TIq> arrayList = avoidOnResultFragment.LL.get(110);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        ListProtector.add(arrayList, arrayList.size(), c15j1);
        avoidOnResultFragment.LL.put(110, arrayList);
        awS112S0201000_31.invoke(avoidOnResultFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair il(int r19, java.lang.String r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, com.ss.android.ugc.aweme.music.model.IMusicRequestParam r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.MusicServiceImpl.il(int, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.ss.android.ugc.aweme.music.model.IMusicRequestParam):kotlin.Pair");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void Yk(Context context, String str, boolean z, ProgressDialogC1397800mTi progressDialogC1397800mTi, final InterfaceC20498515Ix interfaceC20498515Ix, boolean z2) {
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJJIJIIJIL(progressDialogC1397800mTi, context, new InterfaceC20498115It() { // from class: X.15Iw
            @Override // X.InterfaceC20498115It
            public final void onFailed(Exception exc) {
                interfaceC20498515Ix.onFailed(exc);
            }

            @Override // X.InterfaceC20498115It
            public final void onSuccess(MusicModel musicModel, String str2) {
                interfaceC20498515Ix.LIZ(new C15KP().apply(musicModel), str2);
            }
        }, str, z, z2);
    }

    @Override // X.InterfaceC1623990sMX
    public final void LJ(String str, Context context, final AVMusic aVMusic, int i, boolean z, final InterfaceC1416880myU interfaceC1416880myU, boolean z2) {
        boolean zLJI = MethodIDManager.LJI(137895);
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJIIJ(i, context, new InterfaceC202028143e() { // from class: X.0myW
            @Override // X.InterfaceC202028143e
            public final void onCancel() {
            }

            @Override // X.InterfaceC202028143e
            public final void onStart() {
                interfaceC1416880myU.onStart();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "draft_page");
                c0lab.LJ("music_id", aVMusic.getMusicId());
                C20684815ws.LJIILLIIL("download_music", c0lab.LIZ);
            }

            @Override // X.InterfaceC202028143e
            public final void LIZJ(C202035143l c202035143l) {
                interfaceC1416880myU.LIZ(Integer.valueOf(c202035143l.getErrorCode()), c202035143l.getErrorMsg());
            }

            @Override // X.InterfaceC202028143e
            public final void onProgress(int i2) {
                interfaceC1416880myU.onProgress(i2);
            }

            @Override // X.InterfaceC202028143e
            public final void LIZIZ(Map map, Map map2) {
                InterfaceC1416880myU interfaceC1416880myU2 = interfaceC1416880myU;
                String str2 = (String) map.get(aVMusic.getMusicId());
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC1416880myU2.LIZIZ(str2, (MusicWaveBean) map2.get(aVMusic.getMusicId()));
            }

            @Override // X.InterfaceC202028143e
            public final void LIZ(String str2, MusicWaveBean musicWaveBean, Boolean bool) {
                interfaceC1416880myU.LIZIZ(str2, musicWaveBean);
                interfaceC1416880myU.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE));
            }
        }, C10I1.LIZ(aVMusic), str, z, z2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void el(C19EG c19eg, NavigationScene navigationScene, C20498315Iv c20498315Iv, AwS391S0200000_25 awS391S0200000_25, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252, AwS569S0100000_25 awS569S0100000_253) {
        String string;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.INSTANCE, "open_choose_music_page");
        ((com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class)).LJJIIJZLJL(c20498315Iv.LJI);
        if (C15GL.LIZ() && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            com.ss.android.ugc.aweme.music.service.IMusicService iMusicService = (com.ss.android.ugc.aweme.music.service.IMusicService) ServiceManager.get().getService(com.ss.android.ugc.aweme.music.service.IMusicService.class);
            Bundle bundle = new Bundle();
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", c20498315Iv.LIZIZ);
            AVChallenge curChallenge = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getCurChallenge();
            if (curChallenge != null) {
                C786410Ut5.LJJJI("challenge", curChallenge.cid, bundle);
            }
            Bundle bundle2 = c20498315Iv.LJ;
            if (bundle2 != null) {
                string = bundle2.getString("shoot_tab_name");
            } else {
                string = null;
            }
            C786410Ut5.LJJJI("shoot_tab_name", string, bundle);
            C786410Ut5.LJJJI("title", c20498315Iv.LIZ, bundle);
            bundle.putBoolean("is_mv_theme_music", c20498315Iv.LJIIIZ);
            MusicModel musicModel = c20498315Iv.LJIIZILJ;
            if (musicModel != null) {
                C786410Ut5.LJJIZ(bundle, "music_model", musicModel);
            }
            bundle.putBoolean("music_allow_clear", c20498315Iv.LIZJ);
            bundle.putBoolean("music_allow_cut", c20498315Iv.LJIIJJI);
            bundle.putBoolean("music_is_photomv", c20498315Iv.LIZLLL);
            C786410Ut5.LJJJI("creation_id", c20498315Iv.LJI, bundle);
            C786410Ut5.LJJJI("content_source", c20498315Iv.LJIJI, bundle);
            C786410Ut5.LJJJI("content_type", c20498315Iv.LJIJJ, bundle);
            C786410Ut5.LJJJI("shoot_way", c20498315Iv.LJFF, bundle);
            bundle.putBoolean("long_video", c20498315Iv.LJIIJ);
            bundle.putBoolean("hide_local_music", c20498315Iv.LJIIIIZZ);
            bundle.putBoolean("extra_beat_music_sticker", c20498315Iv.LJII);
            C786410Ut5.LJJIZ(bundle, "reuse_original_sound_url", c20498315Iv.LJIILIIL);
            C786410Ut5.LJJJI("reuse_original_sound_id", c20498315Iv.LJIIL, bundle);
            bundle.putInt("reuse_original_sound_length", c20498315Iv.LJIILJJIL);
            bundle.putBoolean("is_carousel", c20498315Iv.LJIJ);
            Bundle bundle3 = c20498315Iv.LJ;
            if (bundle3 != null) {
                C786410Ut5.LJJIIZI(bundle, bundle3, "arguments");
            }
            iMusicService.LJIILLIIL(c19eg, navigationScene, bundle, new AwS308S0300000_31(this, awS391S0200000_25, awS569S0100000_25, 3), awS569S0100000_252, awS569S0100000_253);
            return;
        }
        bl(c19eg, c20498315Iv, awS391S0200000_25, awS569S0100000_25);
    }
}
