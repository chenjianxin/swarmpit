(ns material.factory
  (:refer-clojure :exclude [stepper list])
  (:require [cljsjs.react]
            [cljsjs.material-ui]))

(def create-factory js/React.createFactory)

;;; Components

(def card (create-factory js/MaterialUI.Card))
(def card-header (create-factory js/MaterialUI.CardHeader))
(def card-actions (create-factory js/MaterialUI.CardActions))
(def card-title (create-factory js/MaterialUI.CardTitle))
(def card-text (create-factory js/MaterialUI.CardText))
(def paper (create-factory js/MaterialUI.Paper))
(def avatar (create-factory js/MaterialUI.Avatar))
(def chip (create-factory js/MaterialUI.Chip))
(def app-bar (create-factory js/MaterialUI.AppBar))
(def drawer (create-factory js/MaterialUI.Drawer))
(def snackbar (create-factory js/MaterialUI.Snackbar))
(def menu (create-factory js/MaterialUI.Menu))
(def menu-item (create-factory js/MaterialUI.MenuItem))
(def list (create-factory js/MaterialUI.List))
(def list-item (create-factory js/MaterialUI.ListItem))
(def svg-icon (create-factory js/MaterialUI.SvgIcon))
(def font-icon (create-factory js/MaterialUI.FontIcon))
(def icon-button (create-factory js/MaterialUI.IconButton))
(def icon-menu (create-factory js/MaterialUI.IconMenu))
(def flat-button (create-factory js/MaterialUI.FlatButton))
(def raised-button (create-factory js/MaterialUI.RaisedButton))
(def toogle (create-factory js/MaterialUI.Toggle))
(def checkbox (create-factory js/MaterialUI.Checkbox))
(def dialog (create-factory js/MaterialUI.Dialog))
(def circular-progress (create-factory js/MaterialUI.CircularProgress))
(def refresh-indicator (create-factory js/MaterialUI.RefreshIndicator))
(def table (create-factory js/MaterialUI.Table))
(def table-header (create-factory js/MaterialUI.TableHeader))
(def table-header-column (create-factory js/MaterialUI.TableHeaderColumn))
(def table-body (create-factory js/MaterialUI.TableBody))
(def table-row (create-factory js/MaterialUI.TableRow))
(def table-row-column (create-factory js/MaterialUI.TableRowColumn))
(def table-footer (create-factory js/MaterialUI.TableFooter))
(def step (create-factory js/MaterialUI.Step))
(def stepper (create-factory js/MaterialUI.Stepper))
(def step-label (create-factory js/MaterialUI.StepLabel))
(def step-button (create-factory js/MaterialUI.StepButton))
(def step-content (create-factory js/MaterialUI.StepContent))
(def select-field (create-factory js/MaterialUI.SelectField))
(def text-field (create-factory js/MaterialUI.TextField))
(def slider (create-factory js/MaterialUI.Slider))
(def radio-button-group (create-factory js/MaterialUI.RadioButtonGroup))
(def radio-button (create-factory js/MaterialUI.RadioButton))
(def auto-complete (create-factory js/MaterialUI.AutoComplete))
(def mui-theme-provider (create-factory js/MaterialUIStyles.MuiThemeProvider))

;;; Functions

(def mui-theme js/MaterialUIStyles.getMuiTheme)
(def fade js/MaterialUIUtils.colorManipulator.fade)
(def auto-complete-filter js/MaterialUI.AutoComplete.caseInsensitiveFilter)