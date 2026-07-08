package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import X.C1266810j4R;
import com.ss.lyrax.ttlh_adapter.push_param.interact.InteractConfigV2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class VPassInteractCfg {
    public JSONObject LIZ;
    public C1266810j4R LIZIZ;
    public boolean LIZJ;
    public InteractConfigV2 LJFF;

    @C09CT("enableAnchorNetStartForawrdOpt")
    public boolean enableAnchorNetStartForawrdOpt;

    @C09CT("enableUpdateLiveTranscodingOptimization")
    public boolean enableUpdateLiveTranscodingOptimization;

    @C09CT("guest_camera_15_fps")
    public boolean guestCamera15Fps;

    @C09CT("mixStreamRatioOpt")
    public boolean mixStreamRatioOpt;

    @C09CT("simulcastEventDriven")
    public boolean simulcastEventDriven;

    @C09CT("InteractUseBufferPoolInSingleView")
    public boolean interactUseBufferPoolInSingleView = true;

    @C09CT("upgrade1080x1920Default")
    public boolean upgrade1080x1920Default = true;

    @C09CT("simChannelNumber")
    public int simChannelNumber = 1;
    public final List<String> LIZLLL = new ArrayList();

    @C09CT("enableNtpTime")
    public boolean enableNtpTime = false;

    @C09CT("updateRoomIdEarlyForStreamMix")
    public boolean updateRoomIdEarlyForStreamMix = true;

    @C09CT("notifyLiveSceneToAuxStream")
    public boolean notifyLiveSceneToAuxStream = true;

    @C09CT("enable_native_interact")
    public boolean enableNativeInteract = false;
    public boolean LJ = false;

    public final boolean LIZ() {
        return this.LJ ? this.LJFF.mCommonConfig.getEnableAnchorNetStartForawrdOpt() : this.enableAnchorNetStartForawrdOpt;
    }

    public final boolean LIZIZ() {
        return this.LJ ? this.LJFF.mCommonConfig.getEnableNativeInteract() : this.enableNativeInteract;
    }

    public final boolean LIZJ() {
        return this.LJ ? this.LJFF.mCommonConfig.getEnableNtpTime() : this.enableNtpTime;
    }

    public final boolean LIZLLL() {
        return this.LJ ? this.LJFF.mMixConfig.getEnableUpdateLiveTranscodingOptimization() : this.enableUpdateLiveTranscodingOptimization;
    }

    public final boolean LJ() {
        return this.LJ ? this.LJFF.mVideoConfig.getGuestCamera15Fps() : this.guestCamera15Fps;
    }

    public final boolean LJFF() {
        return this.LJ ? this.LJFF.mVideoConfig.getInteractUseBufferPoolInSingleView() : this.interactUseBufferPoolInSingleView;
    }

    public final boolean LJI() {
        return this.LJ ? this.LJFF.mMixConfig.getMixStreamRatioOpt() : this.mixStreamRatioOpt;
    }

    public final boolean LJII() {
        return this.LJ ? this.LJFF.mCommonConfig.getNotifyLiveSceneToAuxStream() : this.notifyLiveSceneToAuxStream;
    }

    public final int LJIIIIZZ() {
        return this.LJ ? this.LJFF.mVideoConfig.getSimChannelNumber() : this.simChannelNumber;
    }

    public final boolean LJIIIZ() {
        return this.LJ ? this.LJFF.mVideoConfig.getSimulcastEventDriven() : this.simulcastEventDriven;
    }

    public final boolean LJIIJ() {
        return this.LJ ? this.LJFF.mMixConfig.getUpdateRoomIdEarlyForStreamMix() : this.updateRoomIdEarlyForStreamMix;
    }

    public final boolean LJIIJJI() {
        return this.LJ ? this.LJFF.mVideoConfig.getUpgrade1080x1920Default() : this.upgrade1080x1920Default;
    }
}
