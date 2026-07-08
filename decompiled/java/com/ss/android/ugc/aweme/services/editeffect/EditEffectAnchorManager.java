package com.ss.android.ugc.aweme.services.editeffect;

import X.C15438062q;
import X.C2188811AlT;
import X.EnumC1429610nJ1;
import X.InterfaceC1635410sex;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.services.editeffect.FetchEffectState;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditEffectAnchorManager {
    public static final Companion Companion = new Companion();
    public final MutableLiveData<FetchEffectState> _fetchState;
    public final List<EditEffectAnchorInfo> data;
    public boolean serverRenderingCompleted;
    public final LiveData<FetchEffectState> state;
    public final String subType;

    public static final class Companion {
    }

    public final EnumC1429610nJ1 getEditEffectStyleForAlbum() {
        List<EditEffectAnchorInfo> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (EditEffectAnchorInfo editEffectAnchorInfo : list) {
            if (editEffectAnchorInfo.effectType == EnumC1429610nJ1.EDIT_EFFECT_CLIENT) {
                arrayList.add(editEffectAnchorInfo);
            }
        }
        List<EditEffectAnchorInfo> list2 = this.data;
        ArrayList arrayList2 = new ArrayList();
        for (EditEffectAnchorInfo editEffectAnchorInfo2 : list2) {
            EnumC1429610nJ1 enumC1429610nJ1 = editEffectAnchorInfo2.effectType;
            if (enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_SERVER || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_COMBINED) {
                arrayList2.add(editEffectAnchorInfo2);
            }
        }
        if (!arrayList.isEmpty()) {
            return EnumC1429610nJ1.EDIT_EFFECT_CLIENT;
        }
        if (!arrayList2.isEmpty()) {
            return EnumC1429610nJ1.EDIT_EFFECT_SERVER;
        }
        return null;
    }

    public final boolean hasOverlayEffects() {
        for (EditEffectAnchorInfo editEffectAnchorInfo : this.data) {
            List<EditEffectAnchorInfo> list = this.data;
            ArrayList arrayList = new ArrayList();
            for (EditEffectAnchorInfo editEffectAnchorInfo2 : list) {
                if (true ^ Intrinsics.LJFF(editEffectAnchorInfo.effectId, editEffectAnchorInfo2.effectId)) {
                    arrayList.add(editEffectAnchorInfo2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                for (EditEffectReuseDetails editEffectReuseDetails : ((EditEffectAnchorInfo) it2.next()).details) {
                    Iterator<EditEffectReuseDetails> it3 = editEffectAnchorInfo.details.iterator();
                    while (it3.hasNext()) {
                        if (hasOverlayEffect(it3.next(), editEffectReuseDetails)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean hasServerRenderingEffect() {
        Iterator<EditEffectAnchorInfo> it2 = this.data.iterator();
        while (it2.hasNext()) {
            EnumC1429610nJ1 enumC1429610nJ1 = it2.next().effectType;
            if (enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_SERVER || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_COMBINED) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEditEffect() {
        return Intrinsics.LJFF(this.subType, EnumC1429610nJ1.EDIT_EFFECT.getType());
    }

    public final boolean isEditProp() {
        return Intrinsics.LJFF(this.subType, EnumC1429610nJ1.EDIT_PROP.getType());
    }

    public final boolean isTemplate() {
        return Intrinsics.LJFF(this.subType, "template");
    }

    public final boolean needAuthenticationCheck() {
        Iterator<EditEffectAnchorInfo> it2 = this.data.iterator();
        while (it2.hasNext()) {
            EnumC1429610nJ1 enumC1429610nJ1 = it2.next().effectType;
            if (enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_SERVER || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_IN_ANIM || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_OUT_ANIM || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_COMBO_ANIM) {
                return true;
            }
        }
        return false;
    }

    public final List<EditEffectAnchorInfo> getData() {
        return this.data;
    }

    public final boolean getServerRenderingCompleted() {
        return this.serverRenderingCompleted;
    }

    public final LiveData<FetchEffectState> getState() {
        return this.state;
    }

    public final void downloadEffects(InterfaceC1635410sex interfaceC1635410sex) {
        List<EditEffectAnchorInfo> list = this.data;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EditEffectAnchorInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().effectId);
        }
        this._fetchState.postValue(FetchEffectState.LOADING.INSTANCE);
        interfaceC1635410sex.LJFF(arrayList, true, null, new IFetchEffectListListener() { // from class: com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager.downloadEffects.1
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                String msg;
                int errorCode;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to download effect list ");
                String msg2 = null;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" :: ");
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                } else {
                    msg = null;
                }
                sbLIZ.append(msg);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EditEffectAnchorManager", C2188811AlT.LIZIZ(sbLIZ));
                MutableLiveData<FetchEffectState> mutableLiveData = EditEffectAnchorManager.this._fetchState;
                if (exceptionResult != null) {
                    errorCode = exceptionResult.getErrorCode();
                    msg2 = exceptionResult.getMsg();
                } else {
                    errorCode = -1;
                }
                mutableLiveData.postValue(new FetchEffectState.ERROR(errorCode, msg2));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public void onSuccess(List<Effect> list2) {
                EditEffectAnchorInfo next;
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EditEffectAnchorManager", "success dowloaded effect");
                if (list2 != null) {
                    EditEffectAnchorManager editEffectAnchorManager = EditEffectAnchorManager.this;
                    for (Effect effect : list2) {
                        Iterator<EditEffectAnchorInfo> it3 = editEffectAnchorManager.getData().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(effect.getEffect_id(), next.effectId)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EditEffectAnchorInfo editEffectAnchorInfo = next;
                        if (editEffectAnchorInfo != null) {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EditEffectAnchorManager", "set effect successful");
                            editEffectAnchorInfo.setEffect(effect);
                        }
                    }
                }
                EditEffectAnchorManager editEffectAnchorManager2 = EditEffectAnchorManager.this;
                editEffectAnchorManager2._fetchState.postValue(new FetchEffectState.SUCCESS(editEffectAnchorManager2.getData()));
            }
        });
    }

    public final void setEffect(Effect effect) {
        if (this.data.size() == 1 && Intrinsics.LJFF(((EditEffectAnchorInfo) ListProtector.get(this.data, 0)).effectId, effect.getEffect_id())) {
            ((EditEffectAnchorInfo) ListProtector.get(this.data, 0)).setEffect(effect);
            this._fetchState.postValue(new FetchEffectState.SUCCESS(this.data));
        }
    }

    public final void setServerRenderingCompleted(boolean z) {
        this.serverRenderingCompleted = z;
    }

    public EditEffectAnchorManager(List<EditEffectAnchorInfo> list, String str) {
        this.data = list;
        this.subType = str;
        MutableLiveData<FetchEffectState> mutableLiveData = new MutableLiveData<>(FetchEffectState.INIT.INSTANCE);
        this._fetchState = mutableLiveData;
        this.state = mutableLiveData;
    }

    private final boolean hasOverlayEffect(EditEffectReuseDetails editEffectReuseDetails, EditEffectReuseDetails editEffectReuseDetails2) {
        if (editEffectReuseDetails2.endTime > editEffectReuseDetails.startTime && editEffectReuseDetails2.startTime < editEffectReuseDetails.endTime) {
            return true;
        }
        return false;
    }
}
