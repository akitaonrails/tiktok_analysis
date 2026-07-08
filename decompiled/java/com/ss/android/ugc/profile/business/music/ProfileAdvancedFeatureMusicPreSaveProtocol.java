package com.ss.android.ugc.profile.business.music;

import X.C13BV;
import X.C15438062q;
import X.C299980BpM;
import X.C633020OsG;
import X.C7740030o;
import X.EnumC631300OpU;
import X.EnumC631330OpX;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.profile.model.MusicPreSaveInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileAdvancedFeatureMusicPreSaveProtocol extends AdvancedFeatureProtocol {
    public MusicPreSaveData LLJL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "advanced_feature_music_pre_save";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return C633020OsG.LIZIZ.LJJIIJ();
    }

    public final PreSaveLogData LJLILLLLZI() {
        MusicPreSaveInfo musicPreSaveInfo;
        String str;
        IProfilePlatformVM iProfilePlatformVM;
        User userVQ2;
        MusicPreSaveData musicPreSaveData = this.LLJL;
        if (musicPreSaveData == null || (musicPreSaveInfo = musicPreSaveData.getMusicPreSaveInfo()) == null || (str = musicPreSaveInfo.metaAlbumId) == null) {
            return null;
        }
        String str2 = this.LLJJIJIL;
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        User userVQ22 = iProfilePlatformVM2 != null ? iProfilePlatformVM2.vQ2() : null;
        return new PreSaveLogData(null, str2, str2, null, null, null, null, ((userVQ22 == null || userVQ22.getFollowStatus() != 1) && ((iProfilePlatformVM = this.LLIZLLLIL) == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || userVQ2.getFollowStatus() != 2)) ? CardStruct.IStatusCode.DEFAULT : "1", str, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0OsG] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean LJLJI() {
        ?? arrayList;
        MusicPreSaveInfo musicPreSaveInfo;
        List<Integer> list;
        MusicPreSaveData musicPreSaveData = this.LLJL;
        if (musicPreSaveData == null || (musicPreSaveInfo = musicPreSaveData.getMusicPreSaveInfo()) == null || (list = musicPreSaveInfo.availableDspPlatforms) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(DspPlatform.Companion.from(Integer.valueOf(it2.next().intValue())));
            }
        }
        return C633020OsG.LIZIZ.LJJIL(arrayList);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        if (!LJLJI()) {
            AdvancedFeatureProtocol.LJJLL(this);
            return;
        }
        ProfileHeaderAdvancedFeatureViewModel profileHeaderAdvancedFeatureViewModel = this.LLJJJIL;
        if (profileHeaderAdvancedFeatureViewModel != null) {
            profileHeaderAdvancedFeatureViewModel.vQ2(new AwS588S0100000_9(this, 419));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_list_add);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        AwS563S0100000_19 awS563S0100000_19;
        if (!LJLJI()) {
            AdvancedFeatureProtocol.LJJLL(this);
            return true;
        }
        LJJZZI();
        if (!C299980BpM.LIZ() || (awS563S0100000_19 = this.LLJJL) == null) {
            return true;
        }
        awS563S0100000_19.invoke();
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        PreSaveLogData preSaveLogDataLJLILLLLZI = LJLILLLLZI();
        if (preSaveLogDataLJLILLLLZI != null) {
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            c633020OsG.LJJLIIIJLLLLLLLZ(preSaveLogDataLJLILLLLZI);
            c633020OsG.LJJJZ(new ReportData(EnumC631330OpX.PRESAVE_CLICK.getValue(), EnumC631300OpU.TT_TO_DSP.getValue(), null, null, null, null, preSaveLogDataLJLILLLLZI.albumId));
            c633020OsG.LJIJ(null);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        MusicPreSaveData musicPreSaveData = (MusicPreSaveData) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), nVar.toString(), MusicPreSaveData.class);
        this.LLJL = musicPreSaveData;
        this.LLJJJJ = musicPreSaveData;
    }
}
