package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C01GW;
import X.C08XD;
import X.C0I0B;
import X.C0YA1;
import X.C0Z2Z;
import X.C0Z70;
import X.C0ZDX;
import X.C13BV;
import X.C13LP;
import X.C1400340mXo;
import X.C1954807lC;
import X.C20085613iQ;
import X.C2188811AlT;
import X.C300750Bqb;
import X.C452501pT;
import X.C455420HtU;
import X.C459160HzW;
import X.C461060I6e;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C879170YeJ;
import X.C879250YeR;
import X.C879270YeT;
import X.C879290YeV;
import X.EnumC879260YeS;
import X.EnumC898050ZKx;
import X.InterfaceC879330YeZ;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.AvatarDuoInvitationCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VoiceMessageTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public interface MessageReactionsState {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class BigAimoji implements MessageReactionsState {
        public final C455420HtU aimoji;

        public final BigAimoji copy(C455420HtU c455420HtU) {
            return new BigAimoji(c455420HtU);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BigAimoji) && Intrinsics.LJFF(this.aimoji, ((BigAimoji) obj).aimoji);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BigAimoji(aimoji=");
            sbLIZ.append(this.aimoji);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public int hashCode() {
            return (int) this.aimoji.LIZIZ;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasBigSocialAvatar() {
            return DefaultImpls.hasBigSocialAvatar(this);
        }

        public final C455420HtU getAimoji() {
            return this.aimoji;
        }

        public BigAimoji(C455420HtU c455420HtU) {
            this.aimoji = c455420HtU;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasReaction(MessageReactionsState messageReactionsState) {
            return DefaultImpls.hasReaction(this, messageReactionsState);
        }
    }

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final C01GW<IDMRiskyKeywordsService> riskyKeywordsService$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(192));

        private final IDMRiskyKeywordsService getRiskyKeywordsService() {
            return riskyKeywordsService$delegate.getValue();
        }

        public static final class ReactionData implements Comparable<ReactionData> {
            public final int count;
            public final boolean isSelf;
            public final long lastUpdateTime;
            public final InterfaceC879330YeZ reaction;
            public final EnumC879260YeS selfActorType;

            public final ReactionData copy(boolean z, EnumC879260YeS enumC879260YeS, int i, long j, InterfaceC879330YeZ interfaceC879330YeZ) {
                return new ReactionData(z, enumC879260YeS, i, j, interfaceC879330YeZ);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReactionData)) {
                    return false;
                }
                ReactionData reactionData = (ReactionData) obj;
                return this.isSelf == reactionData.isSelf && this.selfActorType == reactionData.selfActorType && this.count == reactionData.count && this.lastUpdateTime == reactionData.lastUpdateTime && Intrinsics.LJFF(this.reaction, reactionData.reaction);
            }

            public int hashCode() {
                int iZ2 = C786410Ut5.Z2(this.isSelf) * 31;
                EnumC879260YeS enumC879260YeS = this.selfActorType;
                return ((((((iZ2 + (enumC879260YeS == null ? 0 : enumC879260YeS.hashCode())) * 31) + this.count) * 31) + C786410Ut5.Y2(this.lastUpdateTime)) * 31) + this.reaction.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ReactionData(isSelf=");
                sbLIZ.append(this.isSelf);
                sbLIZ.append(", selfActorType=");
                sbLIZ.append(this.selfActorType);
                sbLIZ.append(", count=");
                sbLIZ.append(this.count);
                sbLIZ.append(", lastUpdateTime=");
                sbLIZ.append(this.lastUpdateTime);
                sbLIZ.append(", reaction=");
                sbLIZ.append(this.reaction);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int getCount() {
                return this.count;
            }

            public final long getLastUpdateTime() {
                return this.lastUpdateTime;
            }

            public final InterfaceC879330YeZ getReaction() {
                return this.reaction;
            }

            public final EnumC879260YeS getSelfActorType() {
                return this.selfActorType;
            }

            public final boolean isSelf() {
                return this.isSelf;
            }

            @Override // java.lang.Comparable
            public int compareTo(ReactionData reactionData) {
                Comparator comparator;
                boolean z = this.isSelf;
                if (z != reactionData.isSelf) {
                    comparator = new Comparator() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState$Companion$ReactionData$compareTo$$inlined$compareByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C20085613iQ.LIZIZ(Boolean.valueOf(((MessageReactionsState.Companion.ReactionData) t2).isSelf()), Boolean.valueOf(((MessageReactionsState.Companion.ReactionData) t).isSelf()));
                        }
                    };
                } else if (z) {
                    comparator = new Comparator() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState$Companion$ReactionData$compareTo$$inlined$compareByDescending$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C20085613iQ.LIZIZ(Long.valueOf(((MessageReactionsState.Companion.ReactionData) t2).getLastUpdateTime()), Long.valueOf(((MessageReactionsState.Companion.ReactionData) t).getLastUpdateTime()));
                        }
                    };
                } else {
                    final Comparator comparator2 = new Comparator() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState$Companion$ReactionData$compareTo$$inlined$compareByDescending$3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C20085613iQ.LIZIZ(Integer.valueOf(((MessageReactionsState.Companion.ReactionData) t2).getCount()), Integer.valueOf(((MessageReactionsState.Companion.ReactionData) t).getCount()));
                        }
                    };
                    comparator = new Comparator() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState$Companion$ReactionData$compareTo$$inlined$thenBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            int iCompare = comparator2.compare(t, t2);
                            if (iCompare == 0) {
                                return C20085613iQ.LIZIZ(Long.valueOf(((MessageReactionsState.Companion.ReactionData) t).getLastUpdateTime()), Long.valueOf(((MessageReactionsState.Companion.ReactionData) t2).getLastUpdateTime()));
                            }
                            return iCompare;
                        }
                    };
                }
                return comparator.compare(this, reactionData);
            }

            public ReactionData(boolean z, EnumC879260YeS enumC879260YeS, int i, long j, InterfaceC879330YeZ interfaceC879330YeZ) {
                this.isSelf = z;
                this.selfActorType = enumC879260YeS;
                this.count = i;
                this.lastUpdateTime = j;
                this.reaction = interfaceC879330YeZ;
            }
        }

        public static final class ReactionUserData {
            public final long createTimeSeconds;
            public final String idempotentId;
            public final boolean isBot;

            public final boolean isBot() {
                return this.isBot;
            }

            public ReactionUserData(String str, long j, boolean z) {
                this.idempotentId = str;
                this.createTimeSeconds = j;
                this.isBot = z;
            }
        }

        private final List<ReactionUserData> convertToUserData(List<? extends C0YA1> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C0YA1 c0ya1 : list) {
                    String str = c0ya1.idempotent_id;
                    if (str != null) {
                        arrayList.add(new ReactionUserData(str, c0ya1.getCreateTimeSeconds(), C879250YeR.LIZLLL(c0ya1)));
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }

        private final ReactionList.Count formatCount(int i) {
            if (100 <= i) {
                if (i <= Integer.MAX_VALUE) {
                    return new ReactionList.Count.Show(i, "99+");
                }
            } else if (2 <= i && i < 100) {
                return new ReactionList.Count.Show(i, String.valueOf(i));
            }
            return ReactionList.Count.Hidden.INSTANCE;
        }

        private final boolean messageContentBlocksReactions(C869590Y9l c869590Y9l) {
            IIMMsgUtilService iIMMsgUtilService;
            IDMRiskyKeywordsService riskyKeywordsService;
            if ((!C300750Bqb.LIZ() || (riskyKeywordsService = getRiskyKeywordsService()) == null || !riskyKeywordsService.LIZ(c869590Y9l, false) || !C0ZDX.LJJIJIIJIL(c869590Y9l)) && !C0ZDX.LJJJJZ(c869590Y9l) && (iIMMsgUtilService = (IIMMsgUtilService) PluggableExtentionKt.pluggableSpiForReal(IIMMsgUtilService.class)) != null && iIMMsgUtilService.LJI(c869590Y9l, EnumC898050ZKx.REACTION)) {
                return false;
            }
            return true;
        }

        private final boolean messageSupportsBigAimoji(C869590Y9l c869590Y9l) {
            BaseContent.ReferenceVideo refVideo;
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            AttachmentTypeComponent attachmentTypeComponent = null;
            if (orParseJsonContent != null) {
                refVideo = orParseJsonContent.getRefVideo();
            } else {
                refVideo = null;
            }
            if (refVideo != null) {
                if (C461060I6e.LIZIZ(c869590Y9l)) {
                    return false;
                }
            } else {
                if (baseTemplateLIZ instanceof StickerTemplate) {
                    AttachmentComponent attachmentComponent = ((StickerTemplate) baseTemplateLIZ).attachment;
                    if (attachmentComponent != null) {
                        attachmentTypeComponent = attachmentComponent.type;
                    }
                    if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_STORY) {
                        return true;
                    }
                    return false;
                }
                if (C0ZDX.LJJIIZ(c869590Y9l) || (baseTemplateLIZ instanceof AvatarDuoInvitationCardTemplate) || (baseTemplateLIZ instanceof VoiceMessageTemplate)) {
                    return false;
                }
            }
            return true;
        }

        public final MessageReactionsState buildFromMessage(C869590Y9l c869590Y9l) {
            InterfaceC879330YeZ reaction;
            boolean z;
            ReactionList.ReactionListData aimoji;
            ReactionUserData next;
            EnumC879260YeS enumC879260YeS;
            boolean z2;
            long j;
            ReactionUserData next2;
            EnumC879260YeS enumC879260YeS2;
            boolean z3;
            long j2;
            C459160HzW c459160HzW;
            if (messageContentBlocksReactions(c869590Y9l)) {
                return Hidden.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, List<C0YA1>> entry : propertyItemListMap.entrySet()) {
                if (C879170YeJ.LIZLLL(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                List<ReactionUserData> listConvertToUserData = $$INSTANCE.convertToUserData((List) entry2.getValue());
                Iterator<ReactionUserData> it2 = listConvertToUserData.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (Intrinsics.LJFF(next2.idempotentId, curUserId)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ReactionUserData reactionUserData = next2;
                if (reactionUserData != null) {
                    C879270YeT c879270YeT = EnumC879260YeS.Companion;
                    boolean zIsBot = reactionUserData.isBot();
                    c879270YeT.getClass();
                    if (zIsBot) {
                        enumC879260YeS2 = EnumC879260YeS.BOT;
                    } else {
                        enumC879260YeS2 = EnumC879260YeS.HUMAN;
                    }
                } else {
                    enumC879260YeS2 = null;
                }
                C459160HzW c459160HzWLIZIZ = C879170YeJ.LIZIZ((String) entry2.getKey());
                if (reactionUserData != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int size = listConvertToUserData.size();
                Iterator<ReactionUserData> it3 = listConvertToUserData.iterator();
                if (it3.hasNext()) {
                    long j3 = it3.next().createTimeSeconds;
                    while (true) {
                        j2 = j3;
                        while (it3.hasNext()) {
                            j3 = it3.next().createTimeSeconds;
                            if (j2 < j3) {
                                break;
                            }
                        }
                    }
                    if (enumC879260YeS2 != null) {
                        c459160HzW = new C459160HzW(c459160HzWLIZIZ.LIZ, enumC879260YeS2);
                    } else {
                        c459160HzW = c459160HzWLIZIZ;
                    }
                    arrayList.add(new ReactionData(z3, enumC879260YeS2, size, j2, c459160HzW));
                } else {
                    throw new NoSuchElementException();
                }
            }
            Map<String, List<C0YA1>> propertyItemListMap2 = c869590Y9l.getPropertyItemListMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, List<C0YA1>> entry3 : propertyItemListMap2.entrySet()) {
                if (C879170YeJ.LIZJ(entry3.getKey())) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                C0YA1 c0ya1 = (C0YA1) C13LP.LJJJLL((List) entry4.getValue());
                if (c0ya1 != null) {
                    List<ReactionUserData> listConvertToUserData2 = $$INSTANCE.convertToUserData((List) entry4.getValue());
                    Iterator<ReactionUserData> it4 = listConvertToUserData2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(next.idempotentId, curUserId)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ReactionUserData reactionUserData2 = next;
                    if (reactionUserData2 != null) {
                        C879270YeT c879270YeT2 = EnumC879260YeS.Companion;
                        boolean zIsBot2 = reactionUserData2.isBot();
                        c879270YeT2.getClass();
                        if (zIsBot2) {
                            enumC879260YeS = EnumC879260YeS.BOT;
                        } else {
                            enumC879260YeS = EnumC879260YeS.HUMAN;
                        }
                        z2 = true;
                    } else {
                        enumC879260YeS = null;
                        z2 = false;
                    }
                    int size2 = listConvertToUserData2.size();
                    Iterator<ReactionUserData> it5 = listConvertToUserData2.iterator();
                    if (it5.hasNext()) {
                        long j4 = it5.next().createTimeSeconds;
                        while (true) {
                            j = j4;
                            while (it5.hasNext()) {
                                j4 = it5.next().createTimeSeconds;
                                if (j < j4) {
                                    break;
                                }
                            }
                        }
                        Long l = c0ya1.uid;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            String str = (String) entry4.getKey();
                            UrlStruct urlStruct = c0ya1.url;
                            if (urlStruct != null) {
                                arrayList.add(new ReactionData(z2, enumC879260YeS, size2, j, C879170YeJ.LIZ(jLongValue, str, new C0Z70(urlStruct.uri, urlStruct.url_list, urlStruct.width, urlStruct.height))));
                            }
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
            }
            C08XD.LJIL(arrayList);
            ReactionData reactionData = (ReactionData) C13LP.LJJJLL(arrayList);
            if (reactionData != null) {
                reaction = reactionData.getReaction();
            } else {
                reaction = null;
            }
            if (arrayList.isEmpty()) {
                return NoReactions.INSTANCE;
            }
            if (arrayList.size() == 1 && (reaction instanceof C455420HtU) && messageSupportsBigAimoji(c869590Y9l)) {
                return new BigAimoji((C455420HtU) reaction);
            }
            List<ReactionData> listLL = C13LP.LL(arrayList, 5);
            ArrayList arrayList2 = new ArrayList();
            for (ReactionData reactionData2 : listLL) {
                InterfaceC879330YeZ reaction2 = reactionData2.getReaction();
                if (!Intrinsics.LJFF(reaction2, C879290YeV.LIZ)) {
                    if (reaction2 instanceof C459160HzW) {
                        aimoji = new ReactionList.ReactionListData.Emoji((C459160HzW) reactionData2.getReaction(), $$INSTANCE.formatCount(reactionData2.getCount()), reactionData2.getSelfActorType());
                    } else if (reaction2 instanceof C455420HtU) {
                        aimoji = new ReactionList.ReactionListData.Aimoji((C455420HtU) reactionData2.getReaction(), $$INSTANCE.formatCount(reactionData2.getCount()), reactionData2.getSelfActorType());
                    } else {
                        throw new C1954807lC();
                    }
                    arrayList2.add(aimoji);
                }
            }
            if (arrayList.size() > 5) {
                z = true;
            } else {
                z = false;
            }
            return new ReactionList(arrayList2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean hasHeartReactionFromMyself(X.C869590Y9l r7) {
            /*
                r6 = this;
                X.0I0B r0 = X.C0I0B.LJFF
                X.0I8r r0 = r0.LIZ()
                java.lang.String r4 = r0.getCurUserId()
                java.util.Map r0 = r7.getPropertyItemListMap()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r5 = r0.iterator()
            L16:
                boolean r0 = r5.hasNext()
                r3 = 0
                if (r0 == 0) goto L42
                java.lang.Object r2 = r5.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r1 = r2.getKey()
                java.lang.String r0 = "e:❤️"
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 == 0) goto L16
                java.lang.Object r1 = r2.getValue()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L43
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L43
            L42:
                return r3
            L43:
                java.util.Iterator r2 = r1.iterator()
            L47:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L42
                java.lang.Object r1 = r2.next()
                X.0YA1 r1 = (X.C0YA1) r1
                java.lang.String r0 = r1.idempotent_id
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
                if (r0 == 0) goto L47
                boolean r0 = X.C879250YeR.LIZLLL(r1)
                if (r0 != 0) goto L47
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState.Companion.hasHeartReactionFromMyself(X.0Y9l):boolean");
        }
    }

    boolean hasBigSocialAvatar();

    boolean hasReaction(MessageReactionsState messageReactionsState);

    public static final class Hidden implements MessageReactionsState {
        public static final Hidden INSTANCE = new Hidden();

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasBigSocialAvatar() {
            return DefaultImpls.hasBigSocialAvatar(this);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasReaction(MessageReactionsState messageReactionsState) {
            return DefaultImpls.hasReaction(this, messageReactionsState);
        }
    }

    public static final class NoReactions implements MessageReactionsState {
        public static final NoReactions INSTANCE = new NoReactions();

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasBigSocialAvatar() {
            return DefaultImpls.hasBigSocialAvatar(this);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasReaction(MessageReactionsState messageReactionsState) {
            return DefaultImpls.hasReaction(this, messageReactionsState);
        }
    }

    public static final class ReactionList implements MessageReactionsState {
        public final List<ReactionListData> reactions;
        public final boolean withEllipsize;

        public final ReactionList copy(List<? extends ReactionListData> list, boolean z) {
            return new ReactionList(list, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionList)) {
                return false;
            }
            ReactionList reactionList = (ReactionList) obj;
            return Intrinsics.LJFF(this.reactions, reactionList.reactions) && this.withEllipsize == reactionList.withEllipsize;
        }

        public int hashCode() {
            return (this.reactions.hashCode() * 31) + C786410Ut5.Z2(this.withEllipsize);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReactionList(reactions=");
            sbLIZ.append(this.reactions);
            sbLIZ.append(", withEllipsize=");
            sbLIZ.append(this.withEllipsize);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasBigSocialAvatar() {
            return DefaultImpls.hasBigSocialAvatar(this);
        }

        public interface Count {

            public static final class Hidden implements Count {
                public static final Hidden INSTANCE = new Hidden();
            }

            public static final class Show implements Count {
                public final int count;
                public final String formatCount;

                public final Show copy(int i, String str) {
                    return new Show(i, str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Show)) {
                        return false;
                    }
                    Show show = (Show) obj;
                    return this.count == show.count && Intrinsics.LJFF(this.formatCount, show.formatCount);
                }

                public int hashCode() {
                    return (this.count * 31) + this.formatCount.hashCode();
                }

                public String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Show(count=");
                    sbLIZ.append(this.count);
                    sbLIZ.append(", formatCount=");
                    sbLIZ.append(this.formatCount);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final int getCount() {
                    return this.count;
                }

                public final String getFormatCount() {
                    return this.formatCount;
                }

                public Show(int i, String str) {
                    this.count = i;
                    this.formatCount = str;
                }
            }
        }

        public static abstract class ReactionListData {
            public final Count count;
            public final InterfaceC879330YeZ reaction;
            public final EnumC879260YeS selfActorType;

            public static final class Aimoji extends ReactionListData {
                public final C455420HtU aimoji;
                public final Count count;
                public final EnumC879260YeS selfActorType;

                public final Aimoji copy(C455420HtU c455420HtU, Count count, EnumC879260YeS enumC879260YeS) {
                    return new Aimoji(c455420HtU, count, enumC879260YeS);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Aimoji)) {
                        return false;
                    }
                    Aimoji aimoji = (Aimoji) obj;
                    return Intrinsics.LJFF(this.aimoji, aimoji.aimoji) && Intrinsics.LJFF(this.count, aimoji.count) && this.selfActorType == aimoji.selfActorType;
                }

                public String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Aimoji(aimoji=");
                    sbLIZ.append(this.aimoji);
                    sbLIZ.append(", count=");
                    sbLIZ.append(this.count);
                    sbLIZ.append(", selfActorType=");
                    sbLIZ.append(this.selfActorType);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public int hashCode() {
                    int iHashCode = ((((int) this.aimoji.LIZIZ) * 31) + this.count.hashCode()) * 31;
                    EnumC879260YeS enumC879260YeS = this.selfActorType;
                    return iHashCode + (enumC879260YeS == null ? 0 : enumC879260YeS.hashCode());
                }

                public final C455420HtU getAimoji() {
                    return this.aimoji;
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState.ReactionList.ReactionListData
                public Count getCount() {
                    return this.count;
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState.ReactionList.ReactionListData
                public EnumC879260YeS getSelfActorType() {
                    return this.selfActorType;
                }

                public Aimoji(C455420HtU c455420HtU, Count count, EnumC879260YeS enumC879260YeS) {
                    super(c455420HtU, count, enumC879260YeS);
                    this.aimoji = c455420HtU;
                    this.count = count;
                    this.selfActorType = enumC879260YeS;
                }
            }

            public static final class Emoji extends ReactionListData {
                public final Count count;
                public final C459160HzW emoji;
                public final EnumC879260YeS selfActorType;

                public final Emoji copy(C459160HzW c459160HzW, Count count, EnumC879260YeS enumC879260YeS) {
                    return new Emoji(c459160HzW, count, enumC879260YeS);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Emoji)) {
                        return false;
                    }
                    Emoji emoji = (Emoji) obj;
                    return Intrinsics.LJFF(this.emoji, emoji.emoji) && Intrinsics.LJFF(this.count, emoji.count) && this.selfActorType == emoji.selfActorType;
                }

                public int hashCode() {
                    int iHashCode = ((this.emoji.hashCode() * 31) + this.count.hashCode()) * 31;
                    EnumC879260YeS enumC879260YeS = this.selfActorType;
                    return iHashCode + (enumC879260YeS == null ? 0 : enumC879260YeS.hashCode());
                }

                public String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Emoji(emoji=");
                    sbLIZ.append(this.emoji);
                    sbLIZ.append(", count=");
                    sbLIZ.append(this.count);
                    sbLIZ.append(", selfActorType=");
                    sbLIZ.append(this.selfActorType);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState.ReactionList.ReactionListData
                public Count getCount() {
                    return this.count;
                }

                public final C459160HzW getEmoji() {
                    return this.emoji;
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState.ReactionList.ReactionListData
                public EnumC879260YeS getSelfActorType() {
                    return this.selfActorType;
                }

                public Emoji(C459160HzW c459160HzW, Count count, EnumC879260YeS enumC879260YeS) {
                    super(c459160HzW, count, enumC879260YeS);
                    this.emoji = c459160HzW;
                    this.count = count;
                    this.selfActorType = enumC879260YeS;
                }
            }

            public Count getCount() {
                return this.count;
            }

            public InterfaceC879330YeZ getReaction() {
                return this.reaction;
            }

            public EnumC879260YeS getSelfActorType() {
                return this.selfActorType;
            }

            public ReactionListData(InterfaceC879330YeZ interfaceC879330YeZ, Count count, EnumC879260YeS enumC879260YeS) {
                this.reaction = interfaceC879330YeZ;
                this.count = count;
                this.selfActorType = enumC879260YeS;
            }
        }

        public final List<ReactionListData> getReactions() {
            return this.reactions;
        }

        public final boolean getWithEllipsize() {
            return this.withEllipsize;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState
        public boolean hasReaction(MessageReactionsState messageReactionsState) {
            return DefaultImpls.hasReaction(this, messageReactionsState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ReactionList(List<? extends ReactionListData> list, boolean z) {
            this.reactions = list;
            this.withEllipsize = z;
        }
    }

    public static final class DefaultImpls {
        public static boolean hasBigSocialAvatar(MessageReactionsState messageReactionsState) {
            return messageReactionsState instanceof BigAimoji;
        }

        public static boolean hasReaction(MessageReactionsState messageReactionsState, MessageReactionsState messageReactionsState2) {
            if (!Intrinsics.LJFF(messageReactionsState2, Hidden.INSTANCE) && !Intrinsics.LJFF(messageReactionsState2, NoReactions.INSTANCE)) {
                return true;
            }
            return false;
        }
    }
}
