package com.ss.android.ugc.aweme.im.message.template.card;

import X.C13BV;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C15438062q;
import X.C18Y8;
import X.C18Y9;
import X.C19360810oo;
import X.C1954807lC;
import X.C2241631CoT;
import X.C2241691CoZ;
import X.C2241701Coa;
import X.C2241941Coy;
import X.C2241961Cp0;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC19360410ok;
import X.EnumC19360610om;
import X.EnumC19361210os;
import X.EnumC2241711Cob;
import X.EnumC2241721Coc;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GameChallengeCardTemplate implements BaseInteractiveTaskTemplate {
    public static final Parcelable.Creator<GameChallengeCardTemplate> CREATOR = new Parcelable.Creator<GameChallengeCardTemplate>() { // from class: X.18jo
        @Override // android.os.Parcelable.Creator
        public final GameChallengeCardTemplate createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            GameParticipantScoreComponent gameParticipantScoreComponentCreateFromParcel;
            AttachmentComponent attachmentComponentCreateFromParcel;
            BaseHeaderComponent baseHeaderComponentCreateFromParcel;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = parcel.readInt();
            GameInfoComponent gameInfoComponentCreateFromParcel = GameInfoComponent.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(GameParticipantScoreComponent.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            BaseFooterComponent baseFooterComponentCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                gameParticipantScoreComponentCreateFromParcel = null;
            } else {
                gameParticipantScoreComponentCreateFromParcel = GameParticipantScoreComponent.CREATOR.createFromParcel(parcel);
            }
            GameParticipantScoreComponent gameParticipantScoreComponent = gameParticipantScoreComponentCreateFromParcel;
            EnumC2241721Coc enumC2241721CocValueOf = EnumC2241721Coc.valueOf(parcel.readString());
            InlineMessageTipComponent inlineMessageTipComponentCreateFromParcel = InlineMessageTipComponent.CREATOR.createFromParcel(parcel);
            PreviewHintComponent previewHintComponentCreateFromParcel = PreviewHintComponent.CREATOR.createFromParcel(parcel);
            BaseRequestComponent baseRequestComponentCreateFromParcel = BaseRequestComponent.CREATOR.createFromParcel(parcel);
            BaseResponseComponent baseResponseComponentCreateFromParcel = BaseResponseComponent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                attachmentComponentCreateFromParcel = null;
            } else {
                attachmentComponentCreateFromParcel = AttachmentComponent.CREATOR.createFromParcel(parcel);
            }
            AttachmentComponent attachmentComponent = attachmentComponentCreateFromParcel;
            if (parcel.readInt() == 0) {
                baseHeaderComponentCreateFromParcel = null;
            } else {
                baseHeaderComponentCreateFromParcel = BaseHeaderComponent.CREATOR.createFromParcel(parcel);
            }
            BaseHeaderComponent baseHeaderComponent = baseHeaderComponentCreateFromParcel;
            if (parcel.readInt() != 0) {
                baseFooterComponentCreateFromParcel = BaseFooterComponent.CREATOR.createFromParcel(parcel);
            }
            return new GameChallengeCardTemplate(i, string, string2, z, i2, gameInfoComponentCreateFromParcel, arrayList, z2, gameParticipantScoreComponent, enumC2241721CocValueOf, inlineMessageTipComponentCreateFromParcel, previewHintComponentCreateFromParcel, baseRequestComponentCreateFromParcel, baseResponseComponentCreateFromParcel, attachmentComponent, baseHeaderComponent, baseFooterComponentCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GameChallengeCardTemplate[] newArray(int i) {
            return new GameChallengeCardTemplate[i];
        }
    };
    public final AttachmentComponent attachment;
    public final BaseFooterComponent baseFooterComponent;
    public final BaseHeaderComponent baseHeaderComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final String creatorId;
    public final GameParticipantScoreComponent currentUserScore;
    public final GameInfoComponent gameInfo;
    public final boolean hasMoreParticipants;
    public final boolean hideCard;
    public final int messageType;
    public final int playedUserCount;
    public final PreviewHintComponent previewHintComponent;
    public final List<GameParticipantScoreComponent> scores;
    public final EnumC2241721Coc status;
    public final String taskId;
    public final InlineMessageTipComponent tip;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameChallengeCardTemplate)) {
            return false;
        }
        GameChallengeCardTemplate gameChallengeCardTemplate = (GameChallengeCardTemplate) obj;
        return this.messageType == gameChallengeCardTemplate.messageType && Intrinsics.LJFF(this.taskId, gameChallengeCardTemplate.taskId) && Intrinsics.LJFF(this.creatorId, gameChallengeCardTemplate.creatorId) && this.hideCard == gameChallengeCardTemplate.hideCard && this.playedUserCount == gameChallengeCardTemplate.playedUserCount && Intrinsics.LJFF(this.gameInfo, gameChallengeCardTemplate.gameInfo) && Intrinsics.LJFF(this.scores, gameChallengeCardTemplate.scores) && this.hasMoreParticipants == gameChallengeCardTemplate.hasMoreParticipants && Intrinsics.LJFF(this.currentUserScore, gameChallengeCardTemplate.currentUserScore) && this.status == gameChallengeCardTemplate.status && Intrinsics.LJFF(this.tip, gameChallengeCardTemplate.tip) && Intrinsics.LJFF(this.previewHintComponent, gameChallengeCardTemplate.previewHintComponent) && Intrinsics.LJFF(this.baseRequestComponent, gameChallengeCardTemplate.baseRequestComponent) && Intrinsics.LJFF(this.baseResponseComponent, gameChallengeCardTemplate.baseResponseComponent) && Intrinsics.LJFF(this.attachment, gameChallengeCardTemplate.attachment) && Intrinsics.LJFF(this.baseHeaderComponent, gameChallengeCardTemplate.baseHeaderComponent) && Intrinsics.LJFF(this.baseFooterComponent, gameChallengeCardTemplate.baseFooterComponent);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.messageType * 31) + this.taskId.hashCode()) * 31) + this.creatorId.hashCode()) * 31) + C786410Ut5.Z2(this.hideCard)) * 31) + this.playedUserCount) * 31) + this.gameInfo.hashCode()) * 31) + this.scores.hashCode()) * 31) + C786410Ut5.Z2(this.hasMoreParticipants)) * 31;
        GameParticipantScoreComponent gameParticipantScoreComponent = this.currentUserScore;
        int iHashCode2 = (((((((((((iHashCode + (gameParticipantScoreComponent == null ? 0 : gameParticipantScoreComponent.hashCode())) * 31) + this.status.hashCode()) * 31) + this.tip.hashCode()) * 31) + this.previewHintComponent.hashCode()) * 31) + this.baseRequestComponent.hashCode()) * 31) + this.baseResponseComponent.hashCode()) * 31;
        AttachmentComponent attachmentComponent = this.attachment;
        int iHashCode3 = (iHashCode2 + (attachmentComponent == null ? 0 : attachmentComponent.hashCode())) * 31;
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        int iHashCode4 = (iHashCode3 + (baseHeaderComponent == null ? 0 : baseHeaderComponent.hashCode())) * 31;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        return iHashCode4 + (baseFooterComponent != null ? baseFooterComponent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate nw(C869590Y9l c869590Y9l) {
        return this;
    }

    public final String toString() {
        return "GameChallengeCardTemplate(messageType=" + this.messageType + ", taskId=" + this.taskId + ", creatorId=" + this.creatorId + ", hideCard=" + this.hideCard + ", playedUserCount=" + this.playedUserCount + ", gameInfo=" + this.gameInfo + ", scores=" + this.scores + ", hasMoreParticipants=" + this.hasMoreParticipants + ", currentUserScore=" + this.currentUserScore + ", status=" + this.status + ", tip=" + this.tip + ", previewHintComponent=" + this.previewHintComponent + ", baseRequestComponent=" + this.baseRequestComponent + ", baseResponseComponent=" + this.baseResponseComponent + ", attachment=" + this.attachment + ", baseHeaderComponent=" + this.baseHeaderComponent + ", baseFooterComponent=" + this.baseFooterComponent + ')';
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final ByteString encode() {
        EnumC2241711Cob enumC2241711Cob;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        c2241961Cp0.LJJIJ = baseHeaderComponent != null ? baseHeaderComponent.LIZ() : null;
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        c2241961Cp0.LJJIJIIJI = baseFooterComponent != null ? baseFooterComponent.LIZ() : null;
        C2241631CoT c2241631CoT = new C2241631CoT();
        c2241631CoT.LIZLLL = this.taskId;
        c2241631CoT.LJ = this.creatorId;
        GameInfoComponent gameInfoComponent = this.gameInfo;
        gameInfoComponent.getClass();
        C2241691CoZ c2241691CoZ = new C2241691CoZ();
        c2241691CoZ.LIZLLL = gameInfoComponent.gameId;
        c2241691CoZ.LJ = gameInfoComponent.gameName;
        c2241691CoZ.LJFF = gameInfoComponent.gameThumbnail.LIZIZ();
        EnumC19360610om enumC19360610om = gameInfoComponent.order;
        int i = enumC19360610om == null ? -1 : C19360810oo.LIZ[enumC19360610om.ordinal()];
        c2241691CoZ.LJI = i != 1 ? i != 2 ? EnumC19361210os.GAME_RANKING_ORDER_UNKNOWN : EnumC19361210os.GAME_RANKING_ORDER_ASC : EnumC19361210os.GAME_RANKING_ORDER_DESC;
        EnumC19360410ok enumC19360410ok = gameInfoComponent.rankType;
        c2241691CoZ.LJII = Integer.valueOf(enumC19360410ok != null ? enumC19360410ok.getType() : 0);
        c2241691CoZ.LJIIIIZZ = gameInfoComponent.resId;
        c2241631CoT.LJFF = c2241691CoZ.build();
        List<GameParticipantScoreComponent> list = this.scores;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<GameParticipantScoreComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        C1516540pZE.LIZ(arrayList);
        c2241631CoT.LJI = arrayList;
        c2241631CoT.LJIILJJIL = Integer.valueOf(this.playedUserCount);
        int i2 = C2241701Coa.LIZ[this.status.ordinal()];
        if (i2 == 1) {
            enumC2241711Cob = EnumC2241711Cob.TASK_STATUS_UNKNOWN;
        } else if (i2 == 2) {
            enumC2241711Cob = EnumC2241711Cob.TASK_STATUS_IN_PROGRESS;
        } else if (i2 == 3) {
            enumC2241711Cob = EnumC2241711Cob.TASK_STATUS_RECALL;
        } else if (i2 == 4) {
            enumC2241711Cob = EnumC2241711Cob.TASK_STATUS_EXPIRED;
        } else {
            if (i2 != 5) {
                throw new C1954807lC();
            }
            enumC2241711Cob = EnumC2241711Cob.TASK_STATUS_UNSUPPORTED;
        }
        c2241631CoT.LJIIIIZZ = enumC2241711Cob;
        c2241631CoT.LJIIIZ = Boolean.valueOf(this.hideCard);
        c2241631CoT.LJIIJ = this.tip.LIZ();
        c2241631CoT.LJIIJJI = this.previewHintComponent.LIZIZ();
        c2241631CoT.LJIILL = this.baseRequestComponent.LIZ();
        GameParticipantScoreComponent gameParticipantScoreComponent = this.currentUserScore;
        c2241631CoT.LJIILIIL = gameParticipantScoreComponent != null ? gameParticipantScoreComponent.LIZ() : null;
        c2241961Cp0.LJIIZILJ = c2241631CoT.build();
        return C1496910p3Z.LIZJ(c1496910p3Z, protoAdapter.encode(c2241961Cp0.build()));
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final AttachmentComponent Hs() {
        return this.attachment;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final boolean Jv() {
        return this.hideCard;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent Nc() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final InlineMessageTipComponent W7() {
        return this.tip;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseFooterComponent dG() {
        return this.baseFooterComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate
    public final String getTaskId() {
        return this.taskId;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseHeaderComponent og() {
        return this.baseHeaderComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseRequestComponent rj() {
        return this.baseRequestComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final PreviewHintComponent yo() {
        return this.previewHintComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final Map<String, String> Xr(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.messageType);
        parcel.writeString(this.taskId);
        parcel.writeString(this.creatorId);
        parcel.writeInt(this.hideCard ? 1 : 0);
        parcel.writeInt(this.playedUserCount);
        this.gameInfo.writeToParcel(parcel, i);
        List<GameParticipantScoreComponent> list = this.scores;
        parcel.writeInt(list.size());
        Iterator<GameParticipantScoreComponent> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasMoreParticipants ? 1 : 0);
        GameParticipantScoreComponent gameParticipantScoreComponent = this.currentUserScore;
        if (gameParticipantScoreComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gameParticipantScoreComponent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.status.name());
        this.tip.writeToParcel(parcel, i);
        this.previewHintComponent.writeToParcel(parcel, i);
        this.baseRequestComponent.queryData.writeToParcel(parcel, i);
        this.baseResponseComponent.writeToParcel(parcel, i);
        AttachmentComponent attachmentComponent = this.attachment;
        if (attachmentComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attachmentComponent.writeToParcel(parcel, i);
        }
        BaseHeaderComponent baseHeaderComponent = this.baseHeaderComponent;
        if (baseHeaderComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseHeaderComponent.text.writeToParcel(parcel, i);
        }
        BaseFooterComponent baseFooterComponent = this.baseFooterComponent;
        if (baseFooterComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseFooterComponent.writeToParcel(parcel, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        return LIZ(this, false, null, previewHintComponent, baseRequestComponent, baseResponseComponent, 116735);
    }

    public static GameChallengeCardTemplate LIZ(GameChallengeCardTemplate gameChallengeCardTemplate, boolean z, EnumC2241721Coc enumC2241721Coc, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        int i2;
        String str;
        String str2;
        int i3;
        GameInfoComponent gameInfoComponent;
        List<GameParticipantScoreComponent> list;
        GameParticipantScoreComponent gameParticipantScoreComponent;
        InlineMessageTipComponent inlineMessageTipComponent;
        AttachmentComponent attachmentComponent;
        BaseHeaderComponent baseHeaderComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        boolean z2 = z;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        EnumC2241721Coc enumC2241721Coc2 = enumC2241721Coc;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        boolean z3 = false;
        if ((i & 1) != 0) {
            i2 = gameChallengeCardTemplate.messageType;
        } else {
            i2 = 0;
        }
        BaseFooterComponent baseFooterComponent = null;
        if ((i & 2) != 0) {
            str = gameChallengeCardTemplate.taskId;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = gameChallengeCardTemplate.creatorId;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = gameChallengeCardTemplate.hideCard;
        }
        if ((i & 16) != 0) {
            i3 = gameChallengeCardTemplate.playedUserCount;
        } else {
            i3 = 0;
        }
        if ((i & 32) != 0) {
            gameInfoComponent = gameChallengeCardTemplate.gameInfo;
        } else {
            gameInfoComponent = null;
        }
        if ((i & 64) != 0) {
            list = gameChallengeCardTemplate.scores;
        } else {
            list = null;
        }
        if ((i & 128) != 0) {
            z3 = gameChallengeCardTemplate.hasMoreParticipants;
        }
        if ((i & 256) != 0) {
            gameParticipantScoreComponent = gameChallengeCardTemplate.currentUserScore;
        } else {
            gameParticipantScoreComponent = null;
        }
        if ((i & 512) != 0) {
            enumC2241721Coc2 = gameChallengeCardTemplate.status;
        }
        if ((i & 1024) != 0) {
            inlineMessageTipComponent = gameChallengeCardTemplate.tip;
        } else {
            inlineMessageTipComponent = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            previewHintComponent2 = gameChallengeCardTemplate.previewHintComponent;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            baseRequestComponent2 = gameChallengeCardTemplate.baseRequestComponent;
        }
        if ((i & 8192) != 0) {
            baseResponseComponent2 = gameChallengeCardTemplate.baseResponseComponent;
        }
        if ((i & 16384) != 0) {
            attachmentComponent = gameChallengeCardTemplate.attachment;
        } else {
            attachmentComponent = null;
        }
        if ((32768 & i) != 0) {
            baseHeaderComponent = gameChallengeCardTemplate.baseHeaderComponent;
        } else {
            baseHeaderComponent = null;
        }
        if ((i & 65536) != 0) {
            baseFooterComponent = gameChallengeCardTemplate.baseFooterComponent;
        }
        gameChallengeCardTemplate.getClass();
        return new GameChallengeCardTemplate(i2, str, str2, z2, i3, gameInfoComponent, list, z3, gameParticipantScoreComponent, enumC2241721Coc2, inlineMessageTipComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public GameChallengeCardTemplate(String str, String str2, boolean z, int i, GameInfoComponent gameInfoComponent, List list, boolean z2, GameParticipantScoreComponent gameParticipantScoreComponent, EnumC2241721Coc enumC2241721Coc, InlineMessageTipComponent inlineMessageTipComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent, int i2) {
        int i3;
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        PreviewHintComponent previewHintComponentLIZ = previewHintComponent;
        boolean z3 = z;
        BaseRequestComponent baseRequestComponentLIZ = baseRequestComponent;
        EnumC2241721Coc enumC2241721Coc2 = enumC2241721Coc;
        List list2 = list;
        boolean z4 = z2;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        InlineMessageTipComponent inlineMessageTipComponent2 = inlineMessageTipComponent;
        GameParticipantScoreComponent gameParticipantScoreComponent2 = gameParticipantScoreComponent;
        GameInfoComponent gameInfoComponent2 = gameInfoComponent;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = 1816;
        } else {
            i3 = 0;
        }
        z3 = (i2 & 8) != 0 ? true : z3;
        i4 = (i2 & 16) != 0 ? 0 : i4;
        gameInfoComponent2 = (i2 & 32) != 0 ? new GameInfoComponent(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63) : gameInfoComponent2;
        list2 = (i2 & 64) != 0 ? C13BV.INSTANCE : list2;
        z4 = (i2 & 128) != 0 ? false : z4;
        gameParticipantScoreComponent2 = (i2 & 256) != 0 ? null : gameParticipantScoreComponent2;
        enumC2241721Coc2 = (i2 & 512) != 0 ? EnumC2241721Coc.TASK_STATUS_UNKNOWN : enumC2241721Coc2;
        inlineMessageTipComponent2 = (i2 & 1024) != 0 ? new InlineMessageTipComponent(0) : inlineMessageTipComponent2;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        this(i3, str, str2, z3, i4, gameInfoComponent2, list2, z4, gameParticipantScoreComponent2, enumC2241721Coc2, inlineMessageTipComponent2, previewHintComponentLIZ, baseRequestComponentLIZ, (i2 & 8192) != 0 ? new BaseResponseComponent(0L, 15) : baseResponseComponent2, null, (32768 & i2) != 0 ? null : baseHeaderComponent2, (i2 & 65536) == 0 ? baseFooterComponent : null);
    }

    public GameChallengeCardTemplate(int i, String str, String str2, boolean z, int i2, GameInfoComponent gameInfoComponent, List<GameParticipantScoreComponent> list, boolean z2, GameParticipantScoreComponent gameParticipantScoreComponent, EnumC2241721Coc enumC2241721Coc, InlineMessageTipComponent inlineMessageTipComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, BaseFooterComponent baseFooterComponent) {
        this.messageType = i;
        this.taskId = str;
        this.creatorId = str2;
        this.hideCard = z;
        this.playedUserCount = i2;
        this.gameInfo = gameInfoComponent;
        this.scores = list;
        this.hasMoreParticipants = z2;
        this.currentUserScore = gameParticipantScoreComponent;
        this.status = enumC2241721Coc;
        this.tip = inlineMessageTipComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.attachment = attachmentComponent;
        this.baseHeaderComponent = baseHeaderComponent;
        this.baseFooterComponent = baseFooterComponent;
    }
}
