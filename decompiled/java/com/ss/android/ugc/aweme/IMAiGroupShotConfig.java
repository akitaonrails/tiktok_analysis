package com.ss.android.ugc.aweme;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1206810hVf;
import X.EnumC1783370wVb;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMAiGroupShotConfig implements Parcelable {
    public final ContactSelectConfig contactSelectConfig;
    public final AIGroupShotEntry entry;
    public final TemplateConfig templateConfig;
    public static final Parcelable.Creator<IMAiGroupShotConfig> CREATOR = new Parcelable.Creator<IMAiGroupShotConfig>() { // from class: X.0wVV
        @Override // android.os.Parcelable.Creator
        public final IMAiGroupShotConfig createFromParcel(Parcel parcel) {
            return new IMAiGroupShotConfig((AIGroupShotEntry) parcel.readParcelable(IMAiGroupShotConfig.class.getClassLoader()), (IMAiGroupShotConfig.TemplateConfig) parcel.readParcelable(IMAiGroupShotConfig.class.getClassLoader()), (IMAiGroupShotConfig.ContactSelectConfig) parcel.readParcelable(IMAiGroupShotConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IMAiGroupShotConfig[] newArray(int i) {
            return new IMAiGroupShotConfig[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMAiGroupShotConfig)) {
            return false;
        }
        IMAiGroupShotConfig iMAiGroupShotConfig = (IMAiGroupShotConfig) obj;
        return Intrinsics.LJFF(this.entry, iMAiGroupShotConfig.entry) && Intrinsics.LJFF(this.templateConfig, iMAiGroupShotConfig.templateConfig) && Intrinsics.LJFF(this.contactSelectConfig, iMAiGroupShotConfig.contactSelectConfig);
    }

    public final int hashCode() {
        return (((this.entry.hashCode() * 31) + this.templateConfig.hashCode()) * 31) + this.contactSelectConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAiGroupShotConfig(entry=");
        sbLIZ.append(this.entry);
        sbLIZ.append(", templateConfig=");
        sbLIZ.append(this.templateConfig);
        sbLIZ.append(", contactSelectConfig=");
        sbLIZ.append(this.contactSelectConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.entry, i);
        parcel.writeParcelable(this.templateConfig, i);
        parcel.writeParcelable(this.contactSelectConfig, i);
    }

    public static abstract class ContactSelectConfig implements Parcelable {
        public static final int $stable = 0;
        public final Action action;

        public static final class Selected extends ContactSelectConfig {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Selected> CREATOR = new Parcelable.Creator<Selected>() { // from class: X.0wRc
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.Selected createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.Selected((IMAiGroupShotConfig.ContactSelectConfig.ContactData) parcel.readParcelable(IMAiGroupShotConfig.ContactSelectConfig.Selected.class.getClassLoader()), (IMAiGroupShotConfig.Action) parcel.readParcelable(IMAiGroupShotConfig.ContactSelectConfig.Selected.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.Selected[] newArray(int i) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.Selected[i];
                }
            };
            public final Action action;
            public final ContactData contacts;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Selected)) {
                    return false;
                }
                Selected selected = (Selected) obj;
                return Intrinsics.LJFF(this.contacts, selected.contacts) && Intrinsics.LJFF(this.action, selected.action);
            }

            public final int hashCode() {
                return (this.contacts.hashCode() * 31) + this.action.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Selected(contacts=");
                sbLIZ.append(this.contacts);
                sbLIZ.append(", action=");
                sbLIZ.append(this.action);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.contacts, i);
                parcel.writeParcelable(this.action, i);
            }

            @Override // com.ss.android.ugc.aweme.IMAiGroupShotConfig.ContactSelectConfig
            public final Action LIZ() {
                return this.action;
            }

            public Selected(ContactData contactData, Action action) {
                super(action);
                this.contacts = contactData;
                this.action = action;
            }
        }

        public static final class Selecting extends ContactSelectConfig {
            public final Action action;
            public final EnumC1783370wVb contactFilter;
            public final String enterFrom;
            public final int minimumSelectedContacts;
            public final List<String> preselectedUids;
            public final Function1<String, CustomTopAction> provideCustomTopAction;
            public final TextConfig textConfig;
            public static final Parcelable.Creator<Selecting> CREATOR = new Parcelable.Creator<Selecting>() { // from class: X.0wVa
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.Selecting createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.Selecting(IMAiGroupShotConfig.ContactSelectConfig.TextConfig.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.createStringArrayList(), (Function1) parcel.readSerializable(), EnumC1783370wVb.valueOf(parcel.readString()), parcel.readString(), (IMAiGroupShotConfig.Action) parcel.readParcelable(IMAiGroupShotConfig.ContactSelectConfig.Selecting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.Selecting[] newArray(int i) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.Selecting[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Selecting)) {
                    return false;
                }
                Selecting selecting = (Selecting) obj;
                return Intrinsics.LJFF(this.textConfig, selecting.textConfig) && this.minimumSelectedContacts == selecting.minimumSelectedContacts && Intrinsics.LJFF(this.preselectedUids, selecting.preselectedUids) && Intrinsics.LJFF(this.provideCustomTopAction, selecting.provideCustomTopAction) && this.contactFilter == selecting.contactFilter && Intrinsics.LJFF(this.enterFrom, selecting.enterFrom) && Intrinsics.LJFF(this.action, selecting.action);
            }

            public final int hashCode() {
                return (((((((((((this.textConfig.hashCode() * 31) + this.minimumSelectedContacts) * 31) + this.preselectedUids.hashCode()) * 31) + this.provideCustomTopAction.hashCode()) * 31) + this.contactFilter.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.action.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Selecting(textConfig=");
                sbLIZ.append(this.textConfig);
                sbLIZ.append(", minimumSelectedContacts=");
                sbLIZ.append(this.minimumSelectedContacts);
                sbLIZ.append(", preselectedUids=");
                sbLIZ.append(this.preselectedUids);
                sbLIZ.append(", provideCustomTopAction=");
                sbLIZ.append(this.provideCustomTopAction);
                sbLIZ.append(", contactFilter=");
                sbLIZ.append(this.contactFilter);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.enterFrom);
                sbLIZ.append(", action=");
                sbLIZ.append(this.action);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.textConfig.writeToParcel(parcel, i);
                parcel.writeInt(this.minimumSelectedContacts);
                parcel.writeStringList(this.preselectedUids);
                parcel.writeSerializable((Serializable) this.provideCustomTopAction);
                parcel.writeString(this.contactFilter.name());
                parcel.writeString(this.enterFrom);
                parcel.writeParcelable(this.action, i);
            }

            @Override // com.ss.android.ugc.aweme.IMAiGroupShotConfig.ContactSelectConfig
            public final Action LIZ() {
                return this.action;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Selecting(TextConfig textConfig, int i, List<String> list, Function1<? super String, ? extends CustomTopAction> function1, EnumC1783370wVb enumC1783370wVb, String str, Action action) {
                super(action);
                this.textConfig = textConfig;
                this.minimumSelectedContacts = i;
                this.preselectedUids = list;
                this.provideCustomTopAction = function1;
                this.contactFilter = enumC1783370wVb;
                this.enterFrom = str;
                this.action = action;
            }
        }

        public Action LIZ() {
            return this.action;
        }

        public interface ContactData extends Parcelable {

            public static final class NoAction implements ContactData {
                public static final NoAction INSTANCE = new NoAction();
                public static final Parcelable.Creator<NoAction> CREATOR = new Parcelable.Creator<NoAction>() { // from class: X.0wR1
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction.INSTANCE;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction[] newArray(int i) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction[i];
                    }
                };
                public static final int $stable = 8;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof NoAction);
                }

                public final int hashCode() {
                    return -1493234386;
                }

                public final String toString() {
                    return "NoAction";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public static final class ConversationIds implements ContactData {
                public final List<String> conversationIds;
                public static final Parcelable.Creator<ConversationIds> CREATOR = new Parcelable.Creator<ConversationIds>() { // from class: X.0wR0
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds createFromParcel(Parcel parcel) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds(parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds[] newArray(int i) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds[i];
                    }
                };
                public static final int $stable = 8;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ConversationIds) && Intrinsics.LJFF(this.conversationIds, ((ConversationIds) obj).conversationIds);
                }

                public final int hashCode() {
                    return this.conversationIds.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ConversationIds(conversationIds=");
                    sbLIZ.append(this.conversationIds);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeStringList(this.conversationIds);
                }

                public ConversationIds(List<String> list) {
                    this.conversationIds = list;
                }
            }

            public static final class UserIds implements ContactData {
                public final List<String> userIds;
                public static final Parcelable.Creator<UserIds> CREATOR = new Parcelable.Creator<UserIds>() { // from class: X.0wQz
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds createFromParcel(Parcel parcel) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds(parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds[] newArray(int i) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds[i];
                    }
                };
                public static final int $stable = 8;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserIds) && Intrinsics.LJFF(this.userIds, ((UserIds) obj).userIds);
                }

                public final int hashCode() {
                    return this.userIds.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UserIds(userIds=");
                    sbLIZ.append(this.userIds);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeStringList(this.userIds);
                }

                public UserIds(List<String> list) {
                    this.userIds = list;
                }
            }
        }

        public ContactSelectConfig(Action action) {
            this.action = action;
        }

        public static final class TextConfig implements Parcelable {
            public final Function2<Context, Integer, String> buildCtaButtonText;
            public final int descriptionRes;
            public final int titleRes;
            public static final Parcelable.Creator<TextConfig> CREATOR = new Parcelable.Creator<TextConfig>() { // from class: X.0wVc
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.TextConfig createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.TextConfig(parcel.readInt(), parcel.readInt(), (Function2) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.ContactSelectConfig.TextConfig[] newArray(int i) {
                    return new IMAiGroupShotConfig.ContactSelectConfig.TextConfig[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TextConfig)) {
                    return false;
                }
                TextConfig textConfig = (TextConfig) obj;
                return this.titleRes == textConfig.titleRes && this.descriptionRes == textConfig.descriptionRes && Intrinsics.LJFF(this.buildCtaButtonText, textConfig.buildCtaButtonText);
            }

            public final int hashCode() {
                return (((this.titleRes * 31) + this.descriptionRes) * 31) + this.buildCtaButtonText.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TextConfig(titleRes=");
                sbLIZ.append(this.titleRes);
                sbLIZ.append(", descriptionRes=");
                sbLIZ.append(this.descriptionRes);
                sbLIZ.append(", buildCtaButtonText=");
                sbLIZ.append(this.buildCtaButtonText);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.titleRes);
                parcel.writeInt(this.descriptionRes);
                parcel.writeSerializable((Serializable) this.buildCtaButtonText);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TextConfig(int i, int i2, Function2<? super Context, ? super Integer, String> function2) {
                this.titleRes = i;
                this.descriptionRes = i2;
                this.buildCtaButtonText = function2;
            }
        }

        public interface CustomTopAction extends Parcelable {

            public static final class None implements CustomTopAction {
                public static final None INSTANCE = new None();
                public static final Parcelable.Creator<None> CREATOR = new Parcelable.Creator<None>() { // from class: X.0wVd
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None.INSTANCE;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None[] newArray(int i) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.None[i];
                    }
                };
                public static final int $stable = 8;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof None);
                }

                public final int hashCode() {
                    return 2019295615;
                }

                public final String toString() {
                    return "None";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public static final class Visible implements CustomTopAction {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Visible> CREATOR = new Parcelable.Creator<Visible>() { // from class: X.0wVZ
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible createFromParcel(Parcel parcel) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible(parcel.readInt(), parcel.readInt(), (IMAiGroupShotConfig.Text) parcel.readParcelable(IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible.class.getClassLoader()), (IMAiGroupShotConfig.CustomClick) parcel.readParcelable(IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible[] newArray(int i) {
                        return new IMAiGroupShotConfig.ContactSelectConfig.CustomTopAction.Visible[i];
                    }
                };
                public final int endIconRes;
                public final CustomClick onClick;
                public final int startIconRes;
                public final Text text;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Visible)) {
                        return false;
                    }
                    Visible visible = (Visible) obj;
                    return this.startIconRes == visible.startIconRes && this.endIconRes == visible.endIconRes && Intrinsics.LJFF(this.text, visible.text) && Intrinsics.LJFF(this.onClick, visible.onClick);
                }

                public final int hashCode() {
                    return (((((this.startIconRes * 31) + this.endIconRes) * 31) + this.text.hashCode()) * 31) + this.onClick.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Visible(startIconRes=");
                    sbLIZ.append(this.startIconRes);
                    sbLIZ.append(", endIconRes=");
                    sbLIZ.append(this.endIconRes);
                    sbLIZ.append(", text=");
                    sbLIZ.append(this.text);
                    sbLIZ.append(", onClick=");
                    sbLIZ.append(this.onClick);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(this.startIconRes);
                    parcel.writeInt(this.endIconRes);
                    parcel.writeParcelable(this.text, i);
                    parcel.writeParcelable(this.onClick, i);
                }

                public Visible(int i, int i2, Text text, CustomClick customClick) {
                    this.startIconRes = i;
                    this.endIconRes = i2;
                    this.text = text;
                    this.onClick = customClick;
                }
            }
        }
    }

    public static abstract class Action implements Parcelable {
        public static final int $stable = 0;
        public final Function1<List<? extends IMContact>, ContactSelectConfig.ContactData> mapToContactData;

        public Action() {
            throw null;
        }

        public static final class CreateNewGroup extends Action {
            public final String enterFrom;
            public static final Parcelable.Creator<CreateNewGroup> CREATOR = new Parcelable.Creator<CreateNewGroup>() { // from class: X.0wRf
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.CreateNewGroup createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.Action.CreateNewGroup(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.CreateNewGroup[] newArray(int i) {
                    return new IMAiGroupShotConfig.Action.CreateNewGroup[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CreateNewGroup) && Intrinsics.LJFF(this.enterFrom, ((CreateNewGroup) obj).enterFrom);
            }

            public final int hashCode() {
                return this.enterFrom.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CreateNewGroup(enterFrom=");
                sbLIZ.append(this.enterFrom);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.enterFrom);
            }

            public CreateNewGroup(String str) {
                super(AFwS269S0000000_27.get$arr$(32));
                this.enterFrom = str;
            }
        }

        public static final class Dismiss extends Action {
            public final Function1<IMAiGroupShotConfig, Unit> action;
            public static final Parcelable.Creator<Dismiss> CREATOR = new Parcelable.Creator<Dismiss>() { // from class: X.0wVU
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.Dismiss createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.Action.Dismiss((Function1) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.Dismiss[] newArray(int i) {
                    return new IMAiGroupShotConfig.Action.Dismiss[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dismiss) && Intrinsics.LJFF(this.action, ((Dismiss) obj).action);
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Dismiss(action=");
                sbLIZ.append(this.action);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeSerializable((Serializable) this.action);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Dismiss(Function1<? super IMAiGroupShotConfig, Unit> function1) {
                super(AFwS269S0000000_27.get$arr$(33));
                this.action = function1;
            }
        }

        public Action(Function1 function1) {
            this.mapToContactData = function1;
        }

        public static final class TakePhotoAndSend extends Action {
            public final String enterFrom;
            public final Long referenceMessageId;
            public final boolean showToast;
            public static final Parcelable.Creator<TakePhotoAndSend> CREATOR = new Parcelable.Creator<TakePhotoAndSend>() { // from class: X.0wRb
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.TakePhotoAndSend createFromParcel(Parcel parcel) {
                    Long lValueOf;
                    boolean z;
                    if (parcel.readInt() == 0) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(parcel.readLong());
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new IMAiGroupShotConfig.Action.TakePhotoAndSend(lValueOf, parcel.readString(), z);
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Action.TakePhotoAndSend[] newArray(int i) {
                    return new IMAiGroupShotConfig.Action.TakePhotoAndSend[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TakePhotoAndSend)) {
                    return false;
                }
                TakePhotoAndSend takePhotoAndSend = (TakePhotoAndSend) obj;
                return Intrinsics.LJFF(this.referenceMessageId, takePhotoAndSend.referenceMessageId) && this.showToast == takePhotoAndSend.showToast && Intrinsics.LJFF(this.enterFrom, takePhotoAndSend.enterFrom);
            }

            public final int hashCode() {
                Long l = this.referenceMessageId;
                return ((((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.showToast)) * 31) + this.enterFrom.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TakePhotoAndSend(referenceMessageId=");
                sbLIZ.append(this.referenceMessageId);
                sbLIZ.append(", showToast=");
                sbLIZ.append(this.showToast);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.enterFrom);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Long l = this.referenceMessageId;
                if (l == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeLong(l.longValue());
                }
                parcel.writeInt(this.showToast ? 1 : 0);
                parcel.writeString(this.enterFrom);
            }

            public TakePhotoAndSend(Long l, String str, boolean z) {
                super(AFwS269S0000000_27.get$arr$(324));
                this.referenceMessageId = l;
                this.showToast = z;
                this.enterFrom = str;
            }
        }
    }

    public interface CustomClick extends Parcelable {

        public static final class DismissPanel implements CustomClick {
            public static final int $stable = 0;
            public static final Parcelable.Creator<DismissPanel> CREATOR = new Parcelable.Creator<DismissPanel>() { // from class: X.0wVn
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.CustomClick.DismissPanel createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.CustomClick.DismissPanel(IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.CustomClick.DismissPanel[] newArray(int i) {
                    return new IMAiGroupShotConfig.CustomClick.DismissPanel[i];
                }
            };
            public final CreateQrGroupConfig createQrGroup;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DismissPanel) && Intrinsics.LJFF(this.createQrGroup, ((DismissPanel) obj).createQrGroup);
            }

            public final int hashCode() {
                return this.createQrGroup.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DismissPanel(createQrGroup=");
                sbLIZ.append(this.createQrGroup);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                this.createQrGroup.writeToParcel(parcel, i);
            }

            public DismissPanel(CreateQrGroupConfig createQrGroupConfig) {
                this.createQrGroup = createQrGroupConfig;
            }

            public static final class CreateQrGroupConfig implements Parcelable {
                public final String enterFrom;
                public final String selectedEffectTemplateId;
                public static final Parcelable.Creator<CreateQrGroupConfig> CREATOR = new Parcelable.Creator<CreateQrGroupConfig>() { // from class: X.0wVo
                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig createFromParcel(Parcel parcel) {
                        return new IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig[] newArray(int i) {
                        return new IMAiGroupShotConfig.CustomClick.DismissPanel.CreateQrGroupConfig[i];
                    }
                };
                public static final int $stable = 8;

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CreateQrGroupConfig)) {
                        return false;
                    }
                    CreateQrGroupConfig createQrGroupConfig = (CreateQrGroupConfig) obj;
                    return Intrinsics.LJFF(this.enterFrom, createQrGroupConfig.enterFrom) && Intrinsics.LJFF(this.selectedEffectTemplateId, createQrGroupConfig.selectedEffectTemplateId);
                }

                public final int hashCode() {
                    return (this.enterFrom.hashCode() * 31) + this.selectedEffectTemplateId.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CreateQrGroupConfig(enterFrom=");
                    sbLIZ.append(this.enterFrom);
                    sbLIZ.append(", selectedEffectTemplateId=");
                    sbLIZ.append(this.selectedEffectTemplateId);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.enterFrom);
                    parcel.writeString(this.selectedEffectTemplateId);
                }

                public CreateQrGroupConfig(String str, String str2) {
                    this.enterFrom = str;
                    this.selectedEffectTemplateId = str2;
                }
            }
        }

        public static final class MoveToNext implements CustomClick {
            public static final int $stable = 0;
            public static final Parcelable.Creator<MoveToNext> CREATOR = new Parcelable.Creator<MoveToNext>() { // from class: X.0wVX
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.CustomClick.MoveToNext createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.CustomClick.MoveToNext((IMAiGroupShotConfig.TemplateConfig) parcel.readParcelable(IMAiGroupShotConfig.CustomClick.MoveToNext.class.getClassLoader()), (IMAiGroupShotConfig.ContactSelectConfig) parcel.readParcelable(IMAiGroupShotConfig.CustomClick.MoveToNext.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.CustomClick.MoveToNext[] newArray(int i) {
                    return new IMAiGroupShotConfig.CustomClick.MoveToNext[i];
                }
            };
            public final ContactSelectConfig newContactSelectConfig;
            public final TemplateConfig newTemplateConfig;

            public MoveToNext() {
                this((ContactSelectConfig.Selecting) null, 3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoveToNext)) {
                    return false;
                }
                MoveToNext moveToNext = (MoveToNext) obj;
                return Intrinsics.LJFF(this.newTemplateConfig, moveToNext.newTemplateConfig) && Intrinsics.LJFF(this.newContactSelectConfig, moveToNext.newContactSelectConfig);
            }

            public final int hashCode() {
                TemplateConfig templateConfig = this.newTemplateConfig;
                int iHashCode = (templateConfig == null ? 0 : templateConfig.hashCode()) * 31;
                ContactSelectConfig contactSelectConfig = this.newContactSelectConfig;
                return iHashCode + (contactSelectConfig != null ? contactSelectConfig.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MoveToNext(newTemplateConfig=");
                sbLIZ.append(this.newTemplateConfig);
                sbLIZ.append(", newContactSelectConfig=");
                sbLIZ.append(this.newContactSelectConfig);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.newTemplateConfig, i);
                parcel.writeParcelable(this.newContactSelectConfig, i);
            }

            public /* synthetic */ MoveToNext(ContactSelectConfig.Selecting selecting, int i) {
                this((TemplateConfig) null, (i & 2) != 0 ? null : selecting);
            }

            public MoveToNext(TemplateConfig templateConfig, ContactSelectConfig contactSelectConfig) {
                this.newTemplateConfig = templateConfig;
                this.newContactSelectConfig = contactSelectConfig;
            }
        }
    }

    public interface TemplateConfig extends Parcelable {

        public static final class Selected implements TemplateConfig {
            public final String templateId;
            public static final Parcelable.Creator<Selected> CREATOR = new Parcelable.Creator<Selected>() { // from class: X.0wVm
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.TemplateConfig.Selected createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.TemplateConfig.Selected(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.TemplateConfig.Selected[] newArray(int i) {
                    return new IMAiGroupShotConfig.TemplateConfig.Selected[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.templateId);
            }

            public Selected(String str) {
                this.templateId = str;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Selecting implements TemplateConfig {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Selecting> CREATOR = new Parcelable.Creator<Selecting>() { // from class: X.0hVe
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.TemplateConfig.Selecting createFromParcel(Parcel parcel) {
                    Integer numValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    EnumC1206810hVf enumC1206810hVfValueOf = EnumC1206810hVf.valueOf(parcel.readString());
                    IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction customBottomAction = (IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction) parcel.readParcelable(IMAiGroupShotConfig.TemplateConfig.Selecting.class.getClassLoader());
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(parcel.readInt());
                    }
                    return new IMAiGroupShotConfig.TemplateConfig.Selecting(string, string2, enumC1206810hVfValueOf, customBottomAction, string3, numValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.TemplateConfig.Selecting[] newArray(int i) {
                    return new IMAiGroupShotConfig.TemplateConfig.Selecting[i];
                }
            };
            public final Integer chatType;
            public final CustomBottomAction customBottomAction;
            public final String enterFrom;
            public final EnumC1206810hVf mode;
            public final String preSelectedEffectTemplateId;
            public final String preselectedTemplateResId;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Selecting)) {
                    return false;
                }
                Selecting selecting = (Selecting) obj;
                return Intrinsics.LJFF(this.preSelectedEffectTemplateId, selecting.preSelectedEffectTemplateId) && Intrinsics.LJFF(this.preselectedTemplateResId, selecting.preselectedTemplateResId) && this.mode == selecting.mode && Intrinsics.LJFF(this.customBottomAction, selecting.customBottomAction) && Intrinsics.LJFF(this.enterFrom, selecting.enterFrom) && Intrinsics.LJFF(this.chatType, selecting.chatType);
            }

            public final int hashCode() {
                String str = this.preSelectedEffectTemplateId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.preselectedTemplateResId;
                int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.mode.hashCode()) * 31) + this.customBottomAction.hashCode()) * 31) + this.enterFrom.hashCode()) * 31;
                Integer num = this.chatType;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Selecting(preSelectedEffectTemplateId=");
                sbLIZ.append(this.preSelectedEffectTemplateId);
                sbLIZ.append(", preselectedTemplateResId=");
                sbLIZ.append(this.preselectedTemplateResId);
                sbLIZ.append(", mode=");
                sbLIZ.append(this.mode);
                sbLIZ.append(", customBottomAction=");
                sbLIZ.append(this.customBottomAction);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.enterFrom);
                sbLIZ.append(", chatType=");
                sbLIZ.append(this.chatType);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int iIntValue;
                parcel.writeString(this.preSelectedEffectTemplateId);
                parcel.writeString(this.preselectedTemplateResId);
                parcel.writeString(this.mode.name());
                parcel.writeParcelable(this.customBottomAction, i);
                parcel.writeString(this.enterFrom);
                Integer num = this.chatType;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            /* JADX INFO: loaded from: classes28.dex */
            public interface CustomBottomAction extends Parcelable {

                public static final class None implements CustomBottomAction {
                    public static final None INSTANCE = new None();
                    public static final Parcelable.Creator<None> CREATOR = new Parcelable.Creator<None>() { // from class: X.0wVl
                        @Override // android.os.Parcelable.Creator
                        public final IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None createFromParcel(Parcel parcel) {
                            parcel.readInt();
                            return IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None.INSTANCE;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None[] newArray(int i) {
                            return new IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.None[i];
                        }
                    };
                    public static final int $stable = 8;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof None);
                    }

                    public final int hashCode() {
                        return 960035933;
                    }

                    public final String toString() {
                        return "None";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(1);
                    }
                }

                public static final class Visible implements CustomBottomAction {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<Visible> CREATOR = new Parcelable.Creator<Visible>() { // from class: X.0wVe
                        @Override // android.os.Parcelable.Creator
                        public final IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible createFromParcel(Parcel parcel) {
                            return new IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible(parcel.readInt(), (IMAiGroupShotConfig.CustomClick) parcel.readParcelable(IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible[] newArray(int i) {
                            return new IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible[i];
                        }
                    };
                    public final CustomClick onClick;
                    public final int textRes;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Visible)) {
                            return false;
                        }
                        Visible visible = (Visible) obj;
                        return this.textRes == visible.textRes && Intrinsics.LJFF(this.onClick, visible.onClick);
                    }

                    public final int hashCode() {
                        return (this.textRes * 31) + this.onClick.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Visible(textRes=");
                        sbLIZ.append(this.textRes);
                        sbLIZ.append(", onClick=");
                        sbLIZ.append(this.onClick);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(this.textRes);
                        parcel.writeParcelable(this.onClick, i);
                    }

                    public Visible(int i, CustomClick customClick) {
                        this.textRes = i;
                        this.onClick = customClick;
                    }
                }
            }

            public Selecting(String str, String str2, EnumC1206810hVf enumC1206810hVf, CustomBottomAction customBottomAction, String str3, Integer num) {
                this.preSelectedEffectTemplateId = str;
                this.preselectedTemplateResId = str2;
                this.mode = enumC1206810hVf;
                this.customBottomAction = customBottomAction;
                this.enterFrom = str3;
                this.chatType = num;
            }
        }
    }

    public interface Text extends Parcelable {

        public static final class FromRes implements Text {
            public final int res;
            public static final Parcelable.Creator<FromRes> CREATOR = new Parcelable.Creator<FromRes>() { // from class: X.0wVY
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Text.FromRes createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.Text.FromRes(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Text.FromRes[] newArray(int i) {
                    return new IMAiGroupShotConfig.Text.FromRes[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromRes) && this.res == ((FromRes) obj).res;
            }

            public final int hashCode() {
                return this.res;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FromRes(res=");
                sbLIZ.append(this.res);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.res);
            }

            public FromRes(int i) {
                this.res = i;
            }
        }

        public static final class FromString implements Text {
            public final String string;
            public static final Parcelable.Creator<FromString> CREATOR = new Parcelable.Creator<FromString>() { // from class: X.0wVW
                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Text.FromString createFromParcel(Parcel parcel) {
                    return new IMAiGroupShotConfig.Text.FromString(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final IMAiGroupShotConfig.Text.FromString[] newArray(int i) {
                    return new IMAiGroupShotConfig.Text.FromString[i];
                }
            };
            public static final int $stable = 8;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromString) && Intrinsics.LJFF(this.string, ((FromString) obj).string);
            }

            public final int hashCode() {
                return this.string.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FromString(string=");
                sbLIZ.append(this.string);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.string);
            }

            public FromString(String str) {
                this.string = str;
            }
        }
    }

    public IMAiGroupShotConfig(AIGroupShotEntry aIGroupShotEntry, TemplateConfig templateConfig, ContactSelectConfig contactSelectConfig) {
        this.entry = aIGroupShotEntry;
        this.templateConfig = templateConfig;
        this.contactSelectConfig = contactSelectConfig;
    }

    public static IMAiGroupShotConfig LIZ(IMAiGroupShotConfig iMAiGroupShotConfig, TemplateConfig templateConfig, ContactSelectConfig contactSelectConfig, int i) {
        AIGroupShotEntry aIGroupShotEntry;
        if ((i & 1) != 0) {
            aIGroupShotEntry = iMAiGroupShotConfig.entry;
        } else {
            aIGroupShotEntry = null;
        }
        if ((i & 2) != 0) {
            templateConfig = iMAiGroupShotConfig.templateConfig;
        }
        if ((i & 4) != 0) {
            contactSelectConfig = iMAiGroupShotConfig.contactSelectConfig;
        }
        iMAiGroupShotConfig.getClass();
        return new IMAiGroupShotConfig(aIGroupShotEntry, templateConfig, contactSelectConfig);
    }
}
