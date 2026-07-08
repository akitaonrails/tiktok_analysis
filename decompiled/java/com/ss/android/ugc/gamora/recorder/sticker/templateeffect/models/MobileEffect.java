package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C098200Yq;
import X.C09CT;
import X.C1446130njf;
import X.C189200o6;
import X.C2188811AlT;
import X.C318930Cep;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public final class MobileEffect extends Effect {
    public String draftPath;

    @C09CT("effect")
    public Effect effect;

    @C09CT("from_type")
    public final int fromType;

    @C09CT("moderation_status")
    public final int moderationStatus;

    @C09CT("template_info")
    public final MobileEffectTemplateInfo templateInfo;
    public static final C318930Cep Companion = new Object() { // from class: X.0Cep
    };
    public static final Parcelable.Creator<MobileEffect> CREATOR = new Parcelable.Creator<MobileEffect>() { // from class: X.0sia
        @Override // android.os.Parcelable.Creator
        public final MobileEffect createFromParcel(Parcel parcel) {
            return new MobileEffect((Effect) parcel.readParcelable(MobileEffect.class.getClassLoader()), parcel.readInt(), (MobileEffectTemplateInfo) parcel.readParcelable(MobileEffect.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffect[] newArray(int i) {
            return new MobileEffect[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileEffect() {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        this(new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54), 0, null, -1);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.effect, i);
        parcel.writeInt(this.moderationStatus);
        parcel.writeParcelable(this.templateInfo, i);
        parcel.writeInt(this.fromType);
    }

    public final MobileEffect mustCallBeforeParcelize() {
        this.effect = new Effect(this);
        return this;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffect(");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("moderationStatus = ");
        sbLIZ2.append(this.moderationStatus);
        sbLIZ2.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("templateInfo = ");
        sbLIZ3.append(this.templateInfo);
        sbLIZ3.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("fromType = ");
        sbLIZ4.append(this.fromType);
        sbLIZ4.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("draftPath = ");
        sbLIZ5.append(this.draftPath);
        sbLIZ5.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ5));
        sbLIZ.append("), ");
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDraftPath() {
        return this.draftPath;
    }

    public final int getFromType() {
        return this.fromType;
    }

    public final int getModerationStatus() {
        return this.moderationStatus;
    }

    public final MobileEffectTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public final void updateDraftPath(String str) {
        boolean z;
        try {
            String extra = getExtra();
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJII = C1446130njf.LJII(this);
            if (jSONObjectLJII == null) {
                jSONObjectLJII = new JSONObject();
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONObjectLJII.remove("extra_draft_path");
                this.draftPath = null;
            } else {
                jSONObjectLJII.put("extra_draft_path", str);
                this.draftPath = str;
            }
            setExtra(C786410Ut5.J3(jSONObjectLJII));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateUnzipPath(");
            sbLIZ.append(str);
            sbLIZ.append("), before: ");
            sbLIZ.append(extra);
            sbLIZ.append(", after: ");
            sbLIZ.append(getExtra());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("MobileEffect", C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public MobileEffect(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo, int i2) {
        super(effect);
        this.effect = effect;
        this.moderationStatus = i;
        this.templateInfo = mobileEffectTemplateInfo;
        this.fromType = i2;
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJII = C1446130njf.LJII(this);
            jSONObjectLJII = jSONObjectLJII == null ? new JSONObject() : jSONObjectLJII;
            jSONObjectLJII.put("extra_from_type", i2);
            setExtra(C786410Ut5.J3(jSONObjectLJII));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.effect = new Effect(this);
    }

    public final MobileEffect copy(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo, int i2) {
        return new MobileEffect(effect, i, mobileEffectTemplateInfo, i2);
    }
}
