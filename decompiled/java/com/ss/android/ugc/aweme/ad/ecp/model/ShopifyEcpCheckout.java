package com.ss.android.ugc.aweme.ad.ecp.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopifyEcpCheckout {

    @C09CT("buyer")
    public final Buyer buyer;

    @C09CT("currency")
    public final String currency;

    @C09CT("fulfillment")
    public final Fulfillment fulfillment;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("line_items")
    public final List<Object> lineItems;

    @C09CT("messages")
    public final List<Message> messages;

    @C09CT("order")
    public final Order order;

    @C09CT("payment")
    public final Payment payment;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("totals")
    public final List<Total> totals;

    public ShopifyEcpCheckout() {
        this("", "", null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopifyEcpCheckout)) {
            return false;
        }
        ShopifyEcpCheckout shopifyEcpCheckout = (ShopifyEcpCheckout) obj;
        return Intrinsics.LJFF(this.id, shopifyEcpCheckout.id) && Intrinsics.LJFF(this.status, shopifyEcpCheckout.status) && Intrinsics.LJFF(this.currency, shopifyEcpCheckout.currency) && Intrinsics.LJFF(this.buyer, shopifyEcpCheckout.buyer) && Intrinsics.LJFF(this.lineItems, shopifyEcpCheckout.lineItems) && Intrinsics.LJFF(this.totals, shopifyEcpCheckout.totals) && Intrinsics.LJFF(this.fulfillment, shopifyEcpCheckout.fulfillment) && Intrinsics.LJFF(this.payment, shopifyEcpCheckout.payment) && Intrinsics.LJFF(this.order, shopifyEcpCheckout.order) && Intrinsics.LJFF(this.messages, shopifyEcpCheckout.messages);
    }

    public final int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.status.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Buyer buyer = this.buyer;
        int iHashCode3 = (iHashCode2 + (buyer == null ? 0 : buyer.hashCode())) * 31;
        List<Object> list = this.lineItems;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Total> list2 = this.totals;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Fulfillment fulfillment = this.fulfillment;
        int iHashCode6 = (iHashCode5 + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31;
        Payment payment = this.payment;
        int iHashCode7 = (iHashCode6 + (payment == null ? 0 : payment.hashCode())) * 31;
        Order order = this.order;
        int iHashCode8 = (iHashCode7 + (order == null ? 0 : order.hashCode())) * 31;
        List<Message> list3 = this.messages;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyEcpCheckout(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", buyer=");
        sbLIZ.append(this.buyer);
        sbLIZ.append(", lineItems=");
        sbLIZ.append(this.lineItems);
        sbLIZ.append(", totals=");
        sbLIZ.append(this.totals);
        sbLIZ.append(", fulfillment=");
        sbLIZ.append(this.fulfillment);
        sbLIZ.append(", payment=");
        sbLIZ.append(this.payment);
        sbLIZ.append(", order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.messages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Buyer {

        @C09CT("email")
        public final String email;

        public Buyer() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Buyer) && Intrinsics.LJFF(this.email, ((Buyer) obj).email);
        }

        public final int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Buyer(email=");
            sbLIZ.append(this.email);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Buyer(String str) {
            this.email = str;
        }
    }

    public static final class Fulfillment {

        @C09CT("methods")
        public final List<Method> methods;

        public Fulfillment() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fulfillment) && Intrinsics.LJFF(this.methods, ((Fulfillment) obj).methods);
        }

        public final int hashCode() {
            List<Method> list = this.methods;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fulfillment(methods=");
            sbLIZ.append(this.methods);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Fulfillment(List<Method> list) {
            this.methods = list;
        }

        public static final class Method {

            @C09CT("destinations")
            public final List<Destination> destinations;

            @C09CT("groups")
            public final List<Object> groups;

            @C09CT(FollowStatusChangeMethod.PARAM_UID)
            public final String id;

            @C09CT("line_item_ids")
            public final List<String> lineItemIds;

            @C09CT("selected_destination_id")
            public final String selectedDestinationId;

            @C09CT("type")
            public final String type;

            public Method() {
                this("", null, null, null, null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Method)) {
                    return false;
                }
                Method method = (Method) obj;
                return Intrinsics.LJFF(this.id, method.id) && Intrinsics.LJFF(this.type, method.type) && Intrinsics.LJFF(this.destinations, method.destinations) && Intrinsics.LJFF(this.groups, method.groups) && Intrinsics.LJFF(this.selectedDestinationId, method.selectedDestinationId) && Intrinsics.LJFF(this.lineItemIds, method.lineItemIds);
            }

            public final int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.type;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                List<Destination> list = this.destinations;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List<Object> list2 = this.groups;
                int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str2 = this.selectedDestinationId;
                int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<String> list3 = this.lineItemIds;
                return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Method(id=");
                sbLIZ.append(this.id);
                sbLIZ.append(", type=");
                sbLIZ.append(this.type);
                sbLIZ.append(", destinations=");
                sbLIZ.append(this.destinations);
                sbLIZ.append(", groups=");
                sbLIZ.append(this.groups);
                sbLIZ.append(", selectedDestinationId=");
                sbLIZ.append(this.selectedDestinationId);
                sbLIZ.append(", lineItemIds=");
                sbLIZ.append(this.lineItemIds);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public Method(String str, String str2, List<Destination> list, List<Object> list2, String str3, List<String> list3) {
                this.id = str;
                this.type = str2;
                this.destinations = list;
                this.groups = list2;
                this.selectedDestinationId = str3;
                this.lineItemIds = list3;
            }

            public static final class Destination {

                @C09CT("address_country")
                public final String addressCountry;

                @C09CT("address_locality")
                public final String addressLocality;

                @C09CT("address_region")
                public final String addressRegion;

                @C09CT("extended_address")
                public final String extendedAddress;

                @C09CT("first_name")
                public final String firstName;

                @C09CT(FollowStatusChangeMethod.PARAM_UID)
                public final String id;

                @C09CT("last_name")
                public final String lastName;

                @C09CT("postal_code")
                public final String postalCode;

                @C09CT("street_address")
                public final String streetAddress;

                public Destination() {
                    this(null, null, null, null, null, null, null, null, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Destination)) {
                        return false;
                    }
                    Destination destination = (Destination) obj;
                    return Intrinsics.LJFF(this.id, destination.id) && Intrinsics.LJFF(this.firstName, destination.firstName) && Intrinsics.LJFF(this.lastName, destination.lastName) && Intrinsics.LJFF(this.streetAddress, destination.streetAddress) && Intrinsics.LJFF(this.extendedAddress, destination.extendedAddress) && Intrinsics.LJFF(this.addressLocality, destination.addressLocality) && Intrinsics.LJFF(this.addressRegion, destination.addressRegion) && Intrinsics.LJFF(this.postalCode, destination.postalCode) && Intrinsics.LJFF(this.addressCountry, destination.addressCountry);
                }

                public final int hashCode() {
                    String str = this.id;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.firstName;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.lastName;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.streetAddress;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.extendedAddress;
                    int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.addressLocality;
                    int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.addressRegion;
                    int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.postalCode;
                    int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                    String str9 = this.addressCountry;
                    return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Destination(id=");
                    sbLIZ.append(this.id);
                    sbLIZ.append(", firstName=");
                    sbLIZ.append(this.firstName);
                    sbLIZ.append(", lastName=");
                    sbLIZ.append(this.lastName);
                    sbLIZ.append(", streetAddress=");
                    sbLIZ.append(this.streetAddress);
                    sbLIZ.append(", extendedAddress=");
                    sbLIZ.append(this.extendedAddress);
                    sbLIZ.append(", addressLocality=");
                    sbLIZ.append(this.addressLocality);
                    sbLIZ.append(", addressRegion=");
                    sbLIZ.append(this.addressRegion);
                    sbLIZ.append(", postalCode=");
                    sbLIZ.append(this.postalCode);
                    sbLIZ.append(", addressCountry=");
                    sbLIZ.append(this.addressCountry);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public Destination(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                    this.id = str;
                    this.firstName = str2;
                    this.lastName = str3;
                    this.streetAddress = str4;
                    this.extendedAddress = str5;
                    this.addressLocality = str6;
                    this.addressRegion = str7;
                    this.postalCode = str8;
                    this.addressCountry = str9;
                }
            }
        }
    }

    public static final class Payment {

        @C09CT("handlers")
        public final List<String> handlers;

        @C09CT("instruments")
        public final List<Instrument> instruments;

        public Payment() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return Intrinsics.LJFF(this.instruments, payment.instruments) && Intrinsics.LJFF(this.handlers, payment.handlers);
        }

        public final int hashCode() {
            List<Instrument> list = this.instruments;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.handlers;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Payment(instruments=");
            sbLIZ.append(this.instruments);
            sbLIZ.append(", handlers=");
            sbLIZ.append(this.handlers);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public static final class Instrument {

            @C09CT("billing_address")
            public final BillingAddress billingAddress;

            @C09CT("display")
            public final Display display;

            @C09CT("handler_id")
            public final String handlerId;

            @C09CT(FollowStatusChangeMethod.PARAM_UID)
            public final String id;

            @C09CT("selected")
            public final Boolean selected;

            @C09CT("type")
            public final String type;

            public Instrument() {
                this("", "", "", null, null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Instrument)) {
                    return false;
                }
                Instrument instrument = (Instrument) obj;
                return Intrinsics.LJFF(this.id, instrument.id) && Intrinsics.LJFF(this.handlerId, instrument.handlerId) && Intrinsics.LJFF(this.type, instrument.type) && Intrinsics.LJFF(this.selected, instrument.selected) && Intrinsics.LJFF(this.display, instrument.display) && Intrinsics.LJFF(this.billingAddress, instrument.billingAddress);
            }

            public final int hashCode() {
                int iHashCode = ((((this.id.hashCode() * 31) + this.handlerId.hashCode()) * 31) + this.type.hashCode()) * 31;
                Boolean bool = this.selected;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Display display = this.display;
                int iHashCode3 = (iHashCode2 + (display == null ? 0 : display.hashCode())) * 31;
                BillingAddress billingAddress = this.billingAddress;
                return iHashCode3 + (billingAddress != null ? billingAddress.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Instrument(id=");
                sbLIZ.append(this.id);
                sbLIZ.append(", handlerId=");
                sbLIZ.append(this.handlerId);
                sbLIZ.append(", type=");
                sbLIZ.append(this.type);
                sbLIZ.append(", selected=");
                sbLIZ.append(this.selected);
                sbLIZ.append(", display=");
                sbLIZ.append(this.display);
                sbLIZ.append(", billingAddress=");
                sbLIZ.append(this.billingAddress);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public static final class Display {

                @C09CT("brand")
                public final String brand;

                @C09CT("last_digits")
                public final String lastDigits;

                public Display() {
                    this(null, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Display)) {
                        return false;
                    }
                    Display display = (Display) obj;
                    return Intrinsics.LJFF(this.brand, display.brand) && Intrinsics.LJFF(this.lastDigits, display.lastDigits);
                }

                public final int hashCode() {
                    String str = this.brand;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.lastDigits;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Display(brand=");
                    sbLIZ.append(this.brand);
                    sbLIZ.append(", lastDigits=");
                    sbLIZ.append(this.lastDigits);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public Display(String str, String str2) {
                    this.brand = str;
                    this.lastDigits = str2;
                }
            }

            public Instrument(String str, String str2, String str3, Boolean bool, Display display, BillingAddress billingAddress) {
                this.id = str;
                this.handlerId = str2;
                this.type = str3;
                this.selected = bool;
                this.display = display;
                this.billingAddress = billingAddress;
            }

            public static final class BillingAddress {

                @C09CT("address_country")
                public final String addressCountry;

                @C09CT("address_locality")
                public final String addressLocality;

                @C09CT("address_region")
                public final String addressRegion;

                @C09CT("extended_address")
                public final String extendedAddress;

                @C09CT("first_name")
                public final String firstName;

                @C09CT("last_name")
                public final String lastName;

                @C09CT("postal_code")
                public final String postalCode;

                @C09CT("street_address")
                public final String streetAddress;

                public BillingAddress() {
                    this(null, null, null, null, null, null, null, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BillingAddress)) {
                        return false;
                    }
                    BillingAddress billingAddress = (BillingAddress) obj;
                    return Intrinsics.LJFF(this.firstName, billingAddress.firstName) && Intrinsics.LJFF(this.lastName, billingAddress.lastName) && Intrinsics.LJFF(this.streetAddress, billingAddress.streetAddress) && Intrinsics.LJFF(this.extendedAddress, billingAddress.extendedAddress) && Intrinsics.LJFF(this.addressLocality, billingAddress.addressLocality) && Intrinsics.LJFF(this.addressRegion, billingAddress.addressRegion) && Intrinsics.LJFF(this.postalCode, billingAddress.postalCode) && Intrinsics.LJFF(this.addressCountry, billingAddress.addressCountry);
                }

                public final int hashCode() {
                    String str = this.firstName;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.lastName;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.streetAddress;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.extendedAddress;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.addressLocality;
                    int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.addressRegion;
                    int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.postalCode;
                    int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.addressCountry;
                    return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BillingAddress(firstName=");
                    sbLIZ.append(this.firstName);
                    sbLIZ.append(", lastName=");
                    sbLIZ.append(this.lastName);
                    sbLIZ.append(", streetAddress=");
                    sbLIZ.append(this.streetAddress);
                    sbLIZ.append(", extendedAddress=");
                    sbLIZ.append(this.extendedAddress);
                    sbLIZ.append(", addressLocality=");
                    sbLIZ.append(this.addressLocality);
                    sbLIZ.append(", addressRegion=");
                    sbLIZ.append(this.addressRegion);
                    sbLIZ.append(", postalCode=");
                    sbLIZ.append(this.postalCode);
                    sbLIZ.append(", addressCountry=");
                    sbLIZ.append(this.addressCountry);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    this.firstName = str;
                    this.lastName = str2;
                    this.streetAddress = str3;
                    this.extendedAddress = str4;
                    this.addressLocality = str5;
                    this.addressRegion = str6;
                    this.postalCode = str7;
                    this.addressCountry = str8;
                }
            }
        }

        public Payment(List<Instrument> list, List<String> list2) {
            this.instruments = list;
            this.handlers = list2;
        }
    }

    public static final class Order {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("permalink_url")
        public final String permalinkUrl;

        public Order() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Order)) {
                return false;
            }
            Order order = (Order) obj;
            return Intrinsics.LJFF(this.id, order.id) && Intrinsics.LJFF(this.permalinkUrl, order.permalinkUrl);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.permalinkUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Order(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", permalinkUrl=");
            sbLIZ.append(this.permalinkUrl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Order(String str, String str2) {
            this.id = str;
            this.permalinkUrl = str2;
        }
    }

    public static final class Total {

        @C09CT("amount")
        public final long amount;

        @C09CT("display_text")
        public final String displayText;

        @C09CT("type")
        public final String type;

        public Total() {
            this("", 0L, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            return Intrinsics.LJFF(this.type, total.type) && this.amount == total.amount && Intrinsics.LJFF(this.displayText, total.displayText);
        }

        public final int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + C786410Ut5.Y2(this.amount)) * 31;
            String str = this.displayText;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Total(type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", amount=");
            sbLIZ.append(this.amount);
            sbLIZ.append(", displayText=");
            sbLIZ.append(this.displayText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Total(String str, long j, String str2) {
            this.type = str;
            this.amount = j;
            this.displayText = str2;
        }
    }

    public static final class Message {

        @C09CT("code")
        public final String code;

        @C09CT("content")
        public final String content;

        @C09CT("content_type")
        public final String contentType;

        @C09CT("path")
        public final String path;

        @C09CT("severity")
        public final String severity;

        @C09CT("type")
        public final String type;

        public Message() {
            this(null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.LJFF(this.code, message.code) && Intrinsics.LJFF(this.content, message.content) && Intrinsics.LJFF(this.contentType, message.contentType) && Intrinsics.LJFF(this.severity, message.severity) && Intrinsics.LJFF(this.type, message.type) && Intrinsics.LJFF(this.path, message.path);
        }

        public final int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.content;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.contentType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.severity;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.type;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.path;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Message(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", content=");
            sbLIZ.append(this.content);
            sbLIZ.append(", contentType=");
            sbLIZ.append(this.contentType);
            sbLIZ.append(", severity=");
            sbLIZ.append(this.severity);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", path=");
            sbLIZ.append(this.path);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Message(String str, String str2, String str3, String str4, String str5, String str6) {
            this.code = str;
            this.content = str2;
            this.contentType = str3;
            this.severity = str4;
            this.type = str5;
            this.path = str6;
        }
    }

    public ShopifyEcpCheckout(String str, String str2, String str3, Buyer buyer, List<Object> list, List<Total> list2, Fulfillment fulfillment, Payment payment, Order order, List<Message> list3) {
        this.id = str;
        this.status = str2;
        this.currency = str3;
        this.buyer = buyer;
        this.lineItems = list;
        this.totals = list2;
        this.fulfillment = fulfillment;
        this.payment = payment;
        this.order = order;
        this.messages = list3;
    }
}
