package com.ss.android.ugc.aweme.music.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0BN0;
import X.C1252710ihh;
import X.C127G;
import X.C1388190mED;
import X.C13LE;
import X.C15IZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C580830MqH;
import X.C631940OqW;
import X.C632090Oql;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1485100okW;
import X.InterfaceC20499515Jh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634000Otq;
import Y.AObjectS62S0000000_9;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class MusicPlayAssemBase extends AbstractC738140SxQ implements InterfaceC20499515Jh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public C127G LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPlayAssemBase.class, "musicPlayViewModel", "getMusicPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicPlayAssemBase() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 916), AFwS240S0000000_9.get$arr$(418), null, true);
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    public ArtistHonorLabel bo() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public MusicPlayViewModel mo272do() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return mo272do().LLILZIL;
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        Context context = getContext();
        if (context != null) {
            return C1388190mED.LIZIZ(context);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLJJLI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLJJLI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 4)}, defaultViewModelProviderFactory);
                    this.LLILLJJLI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        final DataCenter dataCenterVQ2 = fragmentLJI != null ? DataCenter.vQ2(ViewModelProviders.of(fragmentLJI), this) : null;
        MusicPlayViewModel musicPlayViewModelMo272do = mo272do();
        musicPlayViewModelMo272do.LLILLL = this;
        MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(this);
        musicPlayViewModelMo272do.LLILLJJLI = musicDownloadPlayHelper;
        musicDownloadPlayHelper.LLJJJIL = false;
        musicDownloadPlayHelper.Mf();
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = musicPlayViewModelMo272do.LLILLJJLI;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.Rf(new InterfaceC1485100okW() { // from class: X.0Oph
                @Override // X.InterfaceC1485100okW
                public final void LIZIZ() {
                    DataCenter dataCenter = dataCenterVQ2;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Integer.valueOf(EnumC631410Opf.DEFAULT.getValue()), "music_status");
                    }
                }
            });
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = musicPlayViewModelMo272do.LLILLJJLI;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.LLILZLL = new C15IZ() { // from class: X.0Opg
                @Override // X.C15IZ
                public final void LIZ() {
                    DataCenter dataCenter = dataCenterVQ2;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Integer.valueOf(EnumC631410Opf.PLAYING.getValue()), "music_status");
                    }
                }
            };
        }
        musicPlayViewModelMo272do.LLILZ = dataCenterVQ2;
        if (dataCenterVQ2 != null) {
            dataCenterVQ2.yQ2("music_status", musicPlayViewModelMo272do, false);
        }
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0Or0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631640Oq2) obj).LJII;
            }
        }, new AwS588S0100000_9(this, 255));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        mo272do().yQ2(true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        MusicDownloadPlayHelper musicDownloadPlayHelper = mo272do().LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LLJILJILJ = false;
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
        Activity activityLLILLL;
        C631940OqW musicItemModel;
        if (musicModel != null && str != null && str2 != null && (activityLLILLL = LLILLL()) != null) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2);
            builder.musicPath(str);
            C632090Oql c632090Oql = mo272do().getState().LL;
            if (c632090Oql != null && (musicItemModel = c632090Oql.getMusicItemModel()) != null && musicItemModel.isSpotlighted()) {
                builder.shootWay("spotlight");
            } else {
                builder.shootWay("artist_music");
            }
            String str3 = mo272do().LLJI;
            if (str3 != null) {
                builder.creationId(str3);
            }
            String str4 = mo272do().LLJIJIL;
            if (str4 != null) {
                builder.groupId(str4);
            }
            if (!mo272do().LLIZLLLIL) {
                builder.shootFrom("others_homepage");
            } else {
                builder.shootFrom("personal_homepage");
            }
            ArtistHonorLabel artistHonorLabelBo = bo();
            if (artistHonorLabelBo != null) {
                HashMap<String, String> map = new HashMap<>();
                map.put("artist_type", artistHonorLabelBo.getLabel());
                builder.extraLogParams(map);
            }
            if (C0BN0.LIZ() && musicModel.isDownloadAfterGoNext()) {
                builder.shootExtraData(new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, 8388607, null));
                builder.musicDownloadComplete(musicModel.getDownloadComplete());
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("OriginMusic", new C580830MqH((C19EG) activityLLILLL, builder.build(), musicModel, 0));
        }
    }
}
